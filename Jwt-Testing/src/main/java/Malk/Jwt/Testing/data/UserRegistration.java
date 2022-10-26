package Malk.Jwt.Testing.data;

import Malk.Jwt.Testing.user.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class UserRegistration extends User {

    private Long id;

    private String nome;
    private String email;
    private String senha;

    public UserRegistration() {

    }

    public UserRegistration(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public User toUser() {
        return new User(getNome(), getEmail(), getSenha());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
