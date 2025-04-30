package org.library.service;

import lombok.RequiredArgsConstructor;
import org.library.dto.request.UserRequest;
import org.library.dto.response.UserResponse;
import org.library.mapper.UserMapper;
import org.library.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse createUser(UserRequest request){
        var user = userMapper.toEntity(request);
        var savedUser = userRepository.save(user);
        return userMapper.toResponse(savedUser);
    }

    public UserResponse getUserByEmail(String email) {
        return userRepository.findByEmail(email).map(userMapper::toResponse).orElseThrow();
    }
}
