package projeto.matricula.modelo;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private int id;
     @Column(name = "login_usuario", nullable = false)
    private String login;
     @Column(name = "senha_usuario", nullable = false)
    private String senha;
     @NotNull
     @OneToOne
    private Perfil perfil;
     @Column(name = "pessoa_usuario", nullable = false)
     @OneToOne
    private Pessoa pessoa;

    public Usuario() {
    }

    public Usuario(int id, String login, String senha, Perfil perfil, Pessoa pessoa) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "chamou!";
    }
    
    
}
