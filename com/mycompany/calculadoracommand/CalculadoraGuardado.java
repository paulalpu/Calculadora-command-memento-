/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracommand;

/**
 *
 * @author manos
 */
public class CalculadoraGuardado {
    private double valorGuardado;
    private boolean errorGuardado;

    public CalculadoraGuardado(double valor, boolean error) {
        this.valorGuardado = valor;
        this.errorGuardado = error;
    }

    public double getValorGuardado() {
        return valorGuardado;
    }

    public boolean getErrorGuardado() {
        return errorGuardado;
    }
}