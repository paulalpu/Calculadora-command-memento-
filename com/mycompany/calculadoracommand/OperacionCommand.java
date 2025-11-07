/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracommand;

/**
 *
 * @author manos
 */
public abstract class OperacionCommand implements Command {
    protected Calculadora receptor;
    protected double valor;
    protected CalculadoraGuardado estadoPrevio;

    public OperacionCommand(Calculadora receptor, double valor) {
        this.receptor = receptor;
        this.valor = valor;
    }

    @Override
    public void ejecutar() {
        estadoPrevio = receptor.guardarEstado();
        operar();
    }

    @Override
    public void deshacer() {
        receptor.restaurarEstado(estadoPrevio);
    }

    protected abstract void operar();
}