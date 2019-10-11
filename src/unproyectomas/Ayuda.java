/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unproyectomas;

/**
 *
 * @author daw206
 */
public class Ayuda {
    private String tipo;
    private String mensaje;

    public Ayuda(String tipo, String mensaje) {
        this.tipo = tipo;
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Ayuda a Carlos" + "tipo=" + tipo + ", Apadrina un niño=" + mensaje + '}';
    }
    
    
}
