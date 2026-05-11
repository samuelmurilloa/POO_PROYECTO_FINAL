/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

/**
 *
 * @author samue
 */

import java.util.ArrayList;
import modelo.Paciente;

public class PacienteServicio {

    private ArrayList<Paciente> pacientes;

    public PacienteServicio() {

        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {

        pacientes.add(paciente);
    }

    public ArrayList<Paciente> obtenerPacientes() {

        return pacientes;
    }
}