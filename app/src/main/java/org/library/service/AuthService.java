package org.library.service;

import org.library.dto.request.UserLoginRequest;
import org.library.dto.request.UserRegisterRequest;
import org.library.dto.response.JwtAuthResponse;
import org.library.entity.User;
import org.library.repository.UserRepository;
import org.library.security.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public JwtAuthResponse login(UserLoginRequest request) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenProvider.generateToken(authentication);
        return new JwtAuthResponse(token);
    }

    public JwtAuthResponse register(UserRegisterRequest request) {
        if (userRepository.existsByEmail(request.email())) {
            throw new RuntimeException("Пользователь с таким email уже существует");
        }

        if (!isPasswordStrong(request.password())) {
            throw new RuntimeException("Пароль не достаточно надёжный. Рекомендуется использовать пароль не короче 8 символов, содержащий заглавные и строчные буквы, цифры и спецсимволы.");
        }

        String encodedPassword = passwordEncoder.encode(request.password());


        User user = new User();
        user.setEmail(request.email());
        user.setPassword(encodedPassword);
        user.setUsername(request.username());
        user.setAboutMe(request.aboutMe());
        user.setRoleId(request.roleId() != null ? request.roleId() : 1L);

        userRepository.save(user);

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.email(), request.password())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenProvider.generateToken(authentication);
        return new JwtAuthResponse(token);
    }

    private boolean isPasswordStrong(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }


        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return false;
            } else if (Character.isLowerCase(ch)) {
                return false;
            } else if (Character.isDigit(ch)) {
                return false;
            } else if ("!@#$%^&*()_+-=[]{}|;':\",.<>/?".indexOf(ch) >= 0) {
                return false;
            }
        }

        return true;
    }
}
