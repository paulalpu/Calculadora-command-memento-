package com.mycompany.calculadoracommand;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Historial historial = new Historial();

        int opcion;
        do {
            System.out.println("\n=== CALCULADORA COMMAND ===");
            System.out.println("Valor actual: " + calculadora.getValorActual());
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Borrar");
            System.out.println("6. Deshacer");
            System.out.println("7. Rehacer");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            double valor;
            Command cmd = null;

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el número a sumar: ");
                    valor = sc.nextDouble();
                    cmd = new SumaCommand(calculadora, valor);
                    historial.ejecutarComando(cmd);
                    break;
                case 2:
                    System.out.print("Ingresa el número a restar: ");
                    valor = sc.nextDouble();
                    cmd = new RestaCommand(calculadora, valor);
                    historial.ejecutarComando(cmd);
                    break;
                case 3:
                    System.out.print("Ingresa el número a multiplicar: ");
                    valor = sc.nextDouble();
                    cmd = new MultiplicacionCommand(calculadora, valor);
                    historial.ejecutarComando(cmd);
                    break;
                case 4:
                    System.out.print("Ingresa el número a dividir: ");
                    valor = sc.nextDouble();
                    cmd = new DivisionCommand(calculadora, valor);
                    historial.ejecutarComando(cmd);
                    break;
                case 5:
                    cmd = new BorrarCommand(calculadora);
                    historial.ejecutarComando(cmd);
                    break;
                case 6:
                    historial.deshacer();
                    break;
                case 7:
                    historial.rehacer();
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 8);

        sc.close();
    }
}
