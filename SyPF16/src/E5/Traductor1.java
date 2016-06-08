/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador1
 */
public class Traductor1 {
    List<String> palabras;
    List<String> palabrast;
    
    
    
    
    public String traducir(String texto){
        int i = palabras.indexOf(texto);
        if(i == -1){
            return texto;
        }else{
            return palabrast.get(i);
        }
    }
    
    public String eliminar(String texto){
        
        if(texto == texto){
            return texto;
        }else{
            return "-1";
        }
    }
    public void agregar(String t, String t2){
        palabras.add(t);
        palabrast.add(t2);
    }
    public Traductor1(){
        palabras = new ArrayList<String>();
        palabrast = new ArrayList<String>();
    }
    
    public static void main(String[]args){
        Traductor1 traductor = new Traductor1();
        traductor.agregar("reprobar", "fail");
        List<Traductor1> listaTraductores;
        listaTraductores = new ArrayList<>();
        
        
        
    }
   
}
