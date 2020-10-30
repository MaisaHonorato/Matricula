package projeto.matricula.modelo;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "tb_perfil")
public class Perfil implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_perfil", nullable = false)
    int id;
    @Column(name = "nome_perfil", nullable = false)
    String nome;
    @NotNull
    int nivel;  // 1. Secretaria   2. Professor   3. Aluno
    private final ArrayList<Usuario> usuarios = new ArrayList<>(); 

    public Perfil() {
    }

    public Perfil(int id, String nome, int nivel) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
    	if (this.nivel <= 1&this.nivel>=3) {
    		System.err.println("Somente Níveis de 1 a 3.");
    		
    	}
        return;
    }

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", nome=" + nome + ", nivel=" + nivel + ", usuarios=" + usuarios + '}';
    }
    
    
}
