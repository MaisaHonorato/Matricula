package projeto.matricula.modelo;

import com.sun.istack.internal.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
@Table(name = "tb_matricula")
public class Matricula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_matricula", nullable = false)
    private int id;
    @Column(name = "data_matricula", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datamat;
    @NotNull
    @OneToOne
    protected Aluno aluno;
    @OneToOne
    protected Serie serie;
    @OneToOne
    protected Turma turma;
    @OneToOne
    protected Turno turno;
    protected Boletim boletim;
    private boolean ativo;

    public Matricula() {
    }

    public Matricula(int id, Date datamat, Aluno aluno, Serie serie, Turma turma, Turno turno, boolean ativo) {
        this.id = id;
        this.datamat = datamat;
        this.aluno = aluno;
        this.serie = serie;
        this.turma = turma;
        this.turno = turno;
        this.ativo = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatamat() {
        return datamat;
    }

    public void setDatamat(Date datamat) {
        this.datamat = datamat;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    

}
