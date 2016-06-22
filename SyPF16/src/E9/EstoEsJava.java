/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrador1
 */
public class EstoEsJava {
    
    public void test(String m)throws MyException{
        if(m == null){
            
            throw new MyException("Error 404//System32");
        }else{
            System.out.println(":)");
            
        }
    }
    
    public static void main(String[]args)  {
       
        try {
            EstoEsJava esto = new EstoEsJava();
            esto.test(null);
        } catch (MyException ex) {
            System.out.println(ex.toString());
        }
    }
}
