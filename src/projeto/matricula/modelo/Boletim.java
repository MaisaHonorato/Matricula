package projeto.matricula.modelo;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "tb_boletim")
public class Boletim implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_boletim", nullable = false)
    private int id;
    
    @Column(name = "descricao_boletim", nullable = false)
    private String descricao;
    
    @Column(name = "disciplina_boletim", nullable = false)
    @OneToOne
    Disciplina disciplina;
    
    @OneToMany
    ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

    public Boletim() {
    }

    public Boletim(int id, String descricao, Disciplina disciplina, Avaliacao avaliacao ) {
    	this.id = id;
    	this.descricao = descricao;
    	this.disciplina = disciplina;
    	this.avaliacoes = avaliacao;
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
    public String toString() {
        return "Boletim{" + "id=" + id + ", descricao=" + descricao + ","
        		+ " disciplina=" + disciplina + ", avaliacao=" + avaliacao '}';
    }
  }
