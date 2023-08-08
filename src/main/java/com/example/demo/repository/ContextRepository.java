package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContextRepository {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
}
