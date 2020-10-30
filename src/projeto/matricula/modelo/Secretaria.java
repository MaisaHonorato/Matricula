/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.matricula.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Maisa Honorato
 */
@Entity
public class Secretaria extends Funcionario implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    
    @OneToOne(cascade = CascadeType.ALL)
    protected Endereco endereco;
    protected Perfil perfil;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Secretaria() {
    }

    public Secretaria(int id) {
        this.id = id;
    }
    
}
