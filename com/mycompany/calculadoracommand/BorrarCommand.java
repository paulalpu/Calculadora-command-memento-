package com.mycompany.calculadoracommand;

public class BorrarCommand implements Command {
    private Calculadora receptor;
    private CalculadoraGuardado estadoPrevio;

    public BorrarCommand(Calculadora receptor) {
        this.receptor = receptor;
    }

    @Override
    public void ejecutar() {
        estadoPrevio = receptor.guardarEstado();
        receptor.borrar();
    }

    @Override
    public void deshacer() {
        receptor.restaurarEstado(estadoPrevio);
    }
}