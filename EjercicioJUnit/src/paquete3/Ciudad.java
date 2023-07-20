/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {

    String nombre;
    int poblacion;

    public void establecerNombre(String no) {
        nombre = no;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerPoblacion(int p) {
        poblacion = p;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    public String toString() {
        String cadena = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                nombre,
                poblacion
        );
        return cadena;
    }

}
