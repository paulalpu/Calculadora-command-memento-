/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoracommand;

/**
 *
 * @author manos
 */
import java.util.ArrayList;
import java.util.List;

public class Historial {
    private List<Command> historial = new ArrayList<>();
    private int posicionActual = -1;

    public void ejecutarComando(Command cmd) {
        cmd.ejecutar();

        
        while (historial.size() > posicionActual + 1) {
            historial.remove(historial.size() - 1);
        }

        historial.add(cmd);
        posicionActual++;
    }

    public void deshacer() {
        if (posicionActual >= 0) {
            historial.get(posicionActual).deshacer();
            posicionActual--;
        } else {
            System.out.println("No hay operaciones para deshacer.");
        }
    }

    public void rehacer() {
        if (posicionActual < historial.size() - 1) {
            posicionActual++;
            historial.get(posicionActual).ejecutar();
        } else {
            System.out.println("No hay operaciones para rehacer.");
        }
    }
}