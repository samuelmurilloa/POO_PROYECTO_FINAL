/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */

import interfaces.Recomendable;

public class Paciente extends Persona
        implements Recomendable {

    private String enfermedad;
    private String tipoSangre;

    public Paciente(String nombre,
                     int edad,
                     String identificacion,
                     String enfermedad,
                     String tipoSangre) {

        super(nombre, edad, identificacion);

        this.enfermedad = enfermedad;
        this.tipoSangre = tipoSangre;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    @Override
    public String obtenerRecomendacion() {

        if(enfermedad.equalsIgnoreCase("Hipertension")) {

            return "Reducir el consumo de sal.";
        }

        if(enfermedad.equalsIgnoreCase("Arritmia")) {

            return "Evitar el estres.";
        }

        return "Mantener controles medicos.";
    }

    @Override
    public String mostrarInformacion() {

        return "Paciente: " + nombre;
    }
}