/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO7_2;

/**
 *
 * @author PROGRAMACION
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c;
        c = new CuentaCorriente("12345678-A", "Pepe");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: " + c.egreso(700));
        System.out.println("Puedo sacar 500 euros: " + c.egreso(500));
        c = new CuentaCorriente("98765432-z", "Paco");
        c.mostrarInformacion();

    }
}

    

