package com.example.zagrebnev.services;

import com.example.zagrebnev.enums.Role;
import com.example.zagrebnev.models.User;
import com.example.zagrebnev.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean createUser(User user){
        String username = user.getUsername();
        if(userRepository.findByEmail(user.getEmail())!= null) return false;
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRole().add(Role.ROLE_USER);
        log.info("saving new User {}", username);
        return true;
    }
}
