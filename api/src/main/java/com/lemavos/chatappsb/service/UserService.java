package com.lemavos.chatappsb.service;

import org.springframework.stereotype.Service;

import com.lemavos.chatappsb.entity.User;
import com.lemavos.chatappsb.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.saveAndFlush(user);
    }

    public User searchUserByEmail(String email){
        return repository.findByEmail(email).orElseThrow(
            () -> new RuntimeException("Email not found!")
        );
    }

    public void deleteUserByEmail(String email){
        repository.deleteByEmail(email);
    }

    public void updateUserByEmail(Integer id, User user){
        User userEntity = repository.findById(id).orElseThrow(
            () -> new RuntimeException("User not found!")
        );

        User updatedUser = User.builder()
                .email(user.getEmail() != null ?
                user.getEmail() : userEntity.getEmail())

                .name(user.getName() != null ?
                user.getName() : userEntity.getName())

                .id(userEntity.getId())
                .build();

        repository.saveAndFlush(updatedUser);
    }
}
