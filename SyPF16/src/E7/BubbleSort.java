/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador1
 */
public class BubbleSort implements ISort {

    @Override
    public int[] ordenar(int[] array) {
       
        System.out.println("Estoy en la clase Bubble Sort y en el metodo ordenar");
        return array;
    }

    @Override
    public List<Integer> ordenar(List<Integer> array) {
        ArrayList  lista = new ArrayList<Integer>();
        Integer a = new Integer(5);
        Integer b = new Integer(4);
        Integer c = new Integer(3);
        Integer d = new Integer(2);
        Integer e = new Integer(1);
       lista.add(a);
       lista.add(b);
       lista.add(c);
       lista.add(d);
       lista.add(e);
       
       
       return lista;
        
    }
    
}
