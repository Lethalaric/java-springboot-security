package com.example.jwtsample.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Slf4j
@Service
public class AuthenticationService implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("jwtsample".equals(username)) {
            // password: password
            return new User(username, "$2a$10$Hnr6a11iq5rdje/9YRxeqOJ0VLhj3i1Rd8G6iVCF3y.e7F2xivJDu", new ArrayList<>());
        }

        throw new UsernameNotFoundException("user is mismatch. try `jwtsample` username");
    }
}
