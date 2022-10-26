package Malk.Jwt.Testing.data;

import Malk.Jwt.Testing.user.User;

public class UserAuthenticated {
    private String tipo;
    private String email;
    private String nome;
    private String token;

    public UserAuthenticated(String email, String nome, String token, String tipo) {

        this.email = email;
        this.nome = nome;
        this.token = token;
        this.tipo = tipo;
    }

    public UserAuthenticated() {

    }

    public static UserAuthenticated toDTO(User user, String tipo) {
        return new UserAuthenticated(user.getEmail(), user.getNome(), user.getToken(), tipo);
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }

}
