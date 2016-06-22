/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E9;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author administrador1
 */
public class MyException extends Exception{

    public MyException(String m) {
        super(m);
    }

    public MyException(String message, Throwable cause) {
        
        super(message, cause);
        
    }

    
    
}
