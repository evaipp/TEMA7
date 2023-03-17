/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO7_2;

/**
 *
 * @author PROGRAMACION
 */
public class CuentaCorriente {

    private String dni;
    private String nombre;
    private double saldo;

    CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        int saldo = 0;
    }

    CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar";
    }

    CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    boolean egreso(double cant) {
        boolean operacionPosible;
        if (saldo >= cant) {
            saldo -= cant;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente");
            operacionPosible = false;

        }
        return (operacionPosible);
    }

    void ingreso(double cant) {
        saldo += cant;
    }

    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo; " + saldo + " euros");

    }
}
