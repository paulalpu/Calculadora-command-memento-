/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracommand;

/**
 *
 * @author manos
 */
public class DivisionCommand extends OperacionCommand {
    public DivisionCommand(Calculadora receptor, double valor) {
        super(receptor, valor);
    }

    @Override
    protected void operar() {
        receptor.dividir(valor);
    }
}