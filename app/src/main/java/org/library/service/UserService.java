package org.library.service;

import lombok.RequiredArgsConstructor;
import org.library.dto.request.UserRequest;
import org.library.dto.response.UserResponse;
import org.library.mapper.UserMapper;
import org.library.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import static org.library.exception.ErrorCode.USER_BY_EMAIL_NOT_FOUND;
import static org.library.exception.ErrorCode.USER_BY_ID_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse createUser(UserRequest request) {
        var user = userMapper.toEntity(request);
        var savedUser = userRepository.save(user);
        return userMapper.toResponse(savedUser);
    }

    public UserResponse updateUser(Long id, UserRequest request) {
        return userRepository.findById(id)
                .map(u -> userMapper.updateEntity(u, request))
                .map(userRepository::save)
                .map(userMapper::toResponse)
                .orElseThrow();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public UserResponse getUserById(Long id) {
        var user = userRepository.findById(id)
                .orElseThrow(() -> USER_BY_ID_NOT_FOUND.formatMessage(id).toException());
        return userMapper.toResponse(user);
    }

    public UserResponse getUserByEmail(String email) {
        return userRepository.findByEmail(email).map(userMapper::toResponse)
                .orElseThrow(() -> USER_BY_EMAIL_NOT_FOUND.formatMessage(email).toException());
    }

    public Page<UserResponse> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toResponse);
    }
}
