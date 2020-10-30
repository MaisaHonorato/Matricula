package projeto.matricula.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_funcionario", nullable = false)
    private int id;
    
    private double salario;
    @Column(name = "data_admissao", nullable = false)
    private String dataAdmissao;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(double salario, String dataAdmissao, String cargo) {
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    

  

}
