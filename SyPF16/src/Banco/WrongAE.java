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
public class WrongAE extends Exception {
    

    public WrongAE(String m) {
        super(m);
    }

    public WrongAE(String message, Throwable cause) {
        
        super(message, cause);
        
    }

    
    
}

