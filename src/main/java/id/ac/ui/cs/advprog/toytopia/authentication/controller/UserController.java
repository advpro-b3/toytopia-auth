package id.ac.ui.cs.advprog.toytopia.authentication.controller;

import id.ac.ui.cs.advprog.toytopia.authentication.model.User;
import id.ac.ui.cs.advprog.toytopia.authentication.model.dto.UserDetailsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping
    public ResponseEntity<UserDetailsResponse> getDetails() {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return ResponseEntity.ok(
                UserDetailsResponse
                        .builder()
                        .username(user.getUsername())
                        .email(user.getEmail())
                        .firstName(user.getFirstName())
                        .lastName(user.getLastName())
                        .address(user.getAddress())
                        .role(user.getRole())
                        .build()
        );
    }
}
