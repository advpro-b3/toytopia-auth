package id.ac.ui.cs.advprog.toytopia.authentication.model.dto;

import id.ac.ui.cs.advprog.toytopia.authentication.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsResponse {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private Role roles;
}
