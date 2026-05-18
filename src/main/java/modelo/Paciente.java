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
    private String enfermedad1;
    private String proximaCita;
   

    public Paciente(String nombre,
                     int edad,
                     String identificacion,
                     String enfermedad,
                     String enfermedad1,
                     String tipoSangre) {

        super(nombre, edad, identificacion);

        this.enfermedad = enfermedad;
        this.tipoSangre = tipoSangre;
        this.proximaCita = "";
        this.enfermedad1 = enfermedad1;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }
    public String getEnfermedad1(){
        return enfermedad1;
    }

    public String getProximaCita() {
    return proximaCita;
}

public void setProximaCita(String proximaCita) {
    this.proximaCita = proximaCita;
}

    @Override
    public String obtenerRecomendacion() {

        if(enfermedad1.equalsIgnoreCase("Hipertension")) {

            return "Reducir el consumo de sal.";
        }

        if(enfermedad1.equalsIgnoreCase("Arritmia")) {

            return "Evitar el estres.";
        }

        return "Mantener controles medicos.";
    }

    @Override
    public String mostrarInformacion() {

        return "Paciente: " + nombre;
    }
}