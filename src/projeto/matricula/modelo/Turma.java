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
@Table(name = "tb_turma")
public class Turma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_turma", nullable = false)
    private int id;
    @Column(name = "nome_turma", nullable = false)
    private String nome;
    @NotNull
    private int sala;
    @NotNull
    @OneToOne
    private Turno turno;
    @NotNull
    private int ano;

    public Turma() {
    }

    public Turma(int id, String nome, int sala, Turno turno, int ano) {
        this.id = id;
        this.nome = nome;
        this.sala = sala;
        this.turno = turno;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Turma{" + "id=" + id + ", nome=" + nome + ", sala=" + sala + ", turno=" + turno + ", ano=" + ano + '}';
    }
    
    
}
