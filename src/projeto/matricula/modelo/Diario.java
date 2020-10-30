package projeto.matricula.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author Maisa Honorato
 */
@Entity
@SequenceGenerator(name = "DIARIO_SEQ", sequenceName = "DIARIO_SEQ", initialValue = 1, allocationSize = 1)
public class Diario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_DIARIO")
    int id;
    @Column(name = "DESC_RICAO")
    String descricao;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dataletivo;
    @OneToMany
    ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    @OneToMany
    ArrayList<Frequencia> frequencias = new ArrayList<>();

    @OneToOne
    Disciplina disciplina;

    @OneToOne
    Professor professor;

    @OneToOne
    Serie serie;

    @OneToOne
    Turma turma;

    @OneToOne
    Turno turno;

    @OneToMany
    ArrayList<Matricula> matriculas = new ArrayList<>();

    public Diario() {
    }

    public Diario(int id, String descricao, Date dataletivo, Disciplina disciplina, Professor professor, Serie serie, Turno turno) {
        this.id = id;
        this.descricao = descricao;
        this.dataletivo = dataletivo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.serie = serie;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataletivo() {
        return dataletivo;
    }

    public void setDataletivo(Date dataletivo) {
        this.dataletivo = dataletivo;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Frequencia> getFrequencias() {
        return frequencias;
    }

    public void setFrequencias(ArrayList<Frequencia> frequencias) {
        this.frequencias = frequencias;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

}
