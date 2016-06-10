/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author administrador1
 */
public class Convertidor {
    Map<String,Double> lista = new HashMap();
    public Convertidor(){
        lista = new HashMap();
        lista.put("Centimetros", 0.01);
        lista.put("Metros", 1.00);
        lista.put("Kilometros", 1000.00);
        lista.put("Pulgadas", 0.0254);
        lista.put("Pies", 0.305);
        lista.put("Yardas", 0.919);
        lista.put("Millas", 1613.00);
    }
    
    public double convertir(String a, double b, String c){
        
        if(lista.containsKey(a)){
          double entry = lista.get(a);
          entry = entry *b;
          double entry2 = lista.get(c);
          return entry/entry2;
        
        }
        return 0.00;
    }
    
    public static void main(String[]args){
        Convertidor cnvr = new Convertidor();
        double r;
        r = cnvr.convertir("Centimetros", 30, "Pies");
        System.out.println(r);
    }
    
}
