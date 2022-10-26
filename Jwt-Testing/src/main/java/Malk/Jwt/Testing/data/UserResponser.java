package Malk.Jwt.Testing.data;

import Malk.Jwt.Testing.user.User;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class UserResponser {
    private Long id;

    private String nome;
    private String email;
    private String senha;

    public UserResponser(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public UserResponser() {
    }

    public static UserResponser toDTO(User user) {
        return new UserResponser(user.getNome(), user.getEmail(), user.getSenha());
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
