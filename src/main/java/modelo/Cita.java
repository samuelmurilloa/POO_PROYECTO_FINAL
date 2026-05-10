/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */

public class Cita {

    private String fecha;
    private Paciente paciente;

    public Cita(String fecha,
                Paciente paciente) {

        this.fecha = fecha;
        this.paciente = paciente;
    }

    public String mostrarCita() {

        return "Fecha: " + fecha
                + " Paciente: "
                + paciente.getNombre();
    }
}