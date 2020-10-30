/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.matricula.modelo;

/**
 *
 * @author Maisa Honorato
 */
public enum Turno {
    MATUTINO("Matutino"), VESPERTINO("Vespertino"), NOTURNO("Noturno");
    private final String valor;

    private Turno(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }
    
    
}
