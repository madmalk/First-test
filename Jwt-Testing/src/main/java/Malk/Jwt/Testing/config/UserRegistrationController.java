package Malk.Jwt.Testing.config;

import Malk.Jwt.Testing.data.UserAuthenticated;
import Malk.Jwt.Testing.data.UserRegistration;
import Malk.Jwt.Testing.service.UserRegistrationService;
import Malk.Jwt.Testing.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegistrationController {

    private UserRegistrationService userRegistrationService;

    @Autowired
    public UserRegistrationController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    public UserRegistrationController() {

    }

    @PostMapping("/user")
    public ResponseEntity<UserAuthenticated> registrate(@RequestBody UserRegistration userRegistrationDTO) {
        User user = userRegistrationService.registrate(userRegistrationDTO.toUser());
        return new ResponseEntity<UserAuthenticated>(UserAuthenticated.toDTO(user, "Bearer "), HttpStatus.CREATED);
    }

}