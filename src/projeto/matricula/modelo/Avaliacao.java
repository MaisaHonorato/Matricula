/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.matricula.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Maisa Honorato
 */
@Entity
public class Avaliacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    double nota;
    String descricao;
    @OneToOne
    Disciplina Disciplina;
    @OneToOne
    Matricula matricula;

    public Avaliacao() {
    }

    public Avaliacao(double nota, String descricao, Disciplina Disciplina, Matricula matricula) {
        this.nota = nota;
        this.descricao = descricao;
        this.Disciplina = Disciplina;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Disciplina getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(Disciplina Disciplina) {
        this.Disciplina = Disciplina;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

}
