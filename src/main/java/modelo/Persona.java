/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */
public class Persona {

    protected String nombre;
    protected int edad;
    protected String identificacion;

    public Persona(String nombre,
                   int edad,
                   String identificacion) {

        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String mostrarInformacion() {

        return nombre + " - " + edad;
    }
}