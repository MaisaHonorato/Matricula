
package projeto.matricula.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Professor extends Funcionario implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String formacao;
    @OneToMany
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    
    @OneToOne(cascade = CascadeType.ALL)
    protected Endereco endereco;
    protected Perfil perfil;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Professor() {
    }

    public Professor(int id, String formacao) {
        this.id = id;
        this.formacao = formacao;
    }
    
}
