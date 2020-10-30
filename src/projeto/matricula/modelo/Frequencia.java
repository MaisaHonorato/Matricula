package projeto.matricula.modelo;

import com.sun.istack.internal.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity

public class Frequencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_boletim", nullable = false)
    private int id;
    @Column(name = "data_frequencia", nullable = false)
    private String data;
    @Column(name = "aula_por_dia", nullable = false)
    private int quantdeaula;
    @NotNull
    private boolean statsfreq;

    public Frequencia() {
    }

    public Frequencia(int id, String data, int quantdeaula, boolean statsfreq) {
        this.id = id;
        this.data = data;
        this.quantdeaula = quantdeaula;
        this.statsfreq = statsfreq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantdeaula() {
        return quantdeaula;
    }

    public void setQuantdeaula(int quantdeaula) {
        this.quantdeaula = quantdeaula;
    }

    public boolean isStatsfreq() {
        return statsfreq;
    }

    public void setStatsfreq(boolean statsfreq) {
        this.statsfreq = statsfreq;
    }

    @Override
    public String toString() {
        return "Frequencia{" + "id=" + id + ", data=" + data + ", quantdeaula=" + quantdeaula + ", statsfreq=" + statsfreq + '}';
    }

}
