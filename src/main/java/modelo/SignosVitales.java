/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author samue
 */

public class SignosVitales {

    private int presionSistolica;
    private int presionDiastolica;
    private double frecuenciaCardiaca;

    public SignosVitales(int presionSistolica,
                         int presionDiastolica,
                         double frecuenciaCardiaca) {

        this.presionSistolica = presionSistolica;
        this.presionDiastolica = presionDiastolica;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public String evaluarPresion() {

        if(presionSistolica > 140
                || presionDiastolica > 90) {

            return "ALERTA: Presion alta";
        }

        return "Presion normal";
    }
}