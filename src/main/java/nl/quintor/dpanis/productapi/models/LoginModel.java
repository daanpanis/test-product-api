package nl.quintor.dpanis.productapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginModel {

    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 1)
    private String password;

}
