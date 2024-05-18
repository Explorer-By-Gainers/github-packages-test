package com.explorer.test.service;

import com.explorer.test.dto.UserInfo;
import com.explorer.test.entity.User;
import com.explorer.test.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void save(String name) {
        User user = User.from(name);
        userRepository.save(user);
    }

    public UserInfo findById(Long id) {
        return userRepository.findById(id)
                .map(UserInfo::of)
                .orElseThrow(() -> new NullPointerException("user"));
    }

    public List<UserInfo> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserInfo::of)
                .collect(Collectors.toList());
    }

}
