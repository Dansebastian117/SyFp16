/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author administrador1
 */
public class Cliente {
    String nombre;
    String edad;
    int ID;
    int numCuenta;

    public Cliente(String nombre, String edad, int ID, int numCuenta) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.numCuenta = numCuenta;
    }

    

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public int getID() {
        return ID;
    }

    public int getNumCuenta() {
        return numCuenta;
    }
    
    
    
}
