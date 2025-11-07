/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracommand;

/**
 *
 * @author manos
 */
public class Calculadora {
    private double valorActual = 0.0;
    private boolean error = false;

    public double getValorActual() {
        return valorActual;
    }

    public void sumar(double operando) {
        valorActual += operando;
    }

    public void restar(double operando) {
        valorActual -= operando;
    }

    public void multiplicar(double operando) {
        valorActual *= operando;
    }

    public void dividir(double operando) {
        if (operando == 0) {
            System.out.println("❌ Error: división por cero");
            error = true;
        } else {
            valorActual /= operando;
        }
    }

    public void borrar() {
        valorActual = 0.0;
        error = false;
    }

    public CalculadoraGuardado guardarEstado() {
        return new CalculadoraGuardado(valorActual, error);
    }

    public void restaurarEstado(CalculadoraGuardado guardado) {
        this.valorActual = guardado.getValorGuardado();
        this.error = guardado.getErrorGuardado();
    }
}
