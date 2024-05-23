package id.ac.ui.cs.advprog.toytopia.authentication.controller;

import id.ac.ui.cs.advprog.toytopia.authentication.model.dto.AuthenticationRequest;
import id.ac.ui.cs.advprog.toytopia.authentication.model.dto.AuthenticationResponse;
import id.ac.ui.cs.advprog.toytopia.authentication.model.dto.RegisterRequest;
import id.ac.ui.cs.advprog.toytopia.authentication.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService service;

    @Autowired
    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}
