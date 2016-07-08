/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author administrador1
 */
public abstract class Productos {
    
   String nombre;
   String tipo;
    
    public void imprimirTodo(){
        System.out.println(nombre + tipo);
       
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Productos(String tipo) {
        this.tipo = tipo;
    }

   

   
    
}
