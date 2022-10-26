package Malk.Jwt.Testing.service;

import Malk.Jwt.Testing.repository.UserRepository;
import Malk.Jwt.Testing.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {

    private UserRepository userRepository;
    private TokenService tokenService;

    @Autowired
    public UserRegistrationService(UserRepository userRepository, TokenService tokenService) {
        this.userRepository = userRepository;
        this.tokenService = tokenService;
    }

    public User registrate(User user) {
        user.setToken(tokenService.generateToken(user));
        return userRepository.save(user);
    }

}