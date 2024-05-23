package id.ac.ui.cs.advprog.toytopia.authentication.service;

import id.ac.ui.cs.advprog.toytopia.authentication.model.dto.AuthenticationRequest;
import id.ac.ui.cs.advprog.toytopia.authentication.model.dto.AuthenticationResponse;
import id.ac.ui.cs.advprog.toytopia.authentication.model.dto.RegisterRequest;

public interface AuthService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
}
