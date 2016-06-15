/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER2;

/**
 *
 * @author administrador1
 */
public abstract class AAbstract{
    String nombre;
    boolean LecturaEscritura;
    
   
    public boolean abrirLectura (String nombre, boolean LecturaEscritura) {
        return true;
    }
   
    public boolean cerrarArchivo(){
        return true;
    }
    
    public void DesplegarArchivo(){
        System.out.println("Abierto");
    }
    
    
}
