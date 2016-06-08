/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author administrador1
 */
public class Cesar {
    public String cifrar (String mensaje, int constante){
        String resultado= "";
        for (int i = 0; i<mensaje.length(); i++){
            if((int)mensaje.charAt(i)== 10){
                resultado= resultado + mensaje.charAt(i);
            }
            else{
                resultado = resultado + (char)(mensaje.charAt(i) + constante);
            }
        }
        return resultado;
        
    }
    
    public String Dcifrar (String m1, int n1){
        
        String resultado= "";
        for (int i = 0; i<m1.length(); i++){

            resultado = resultado+(char)(m1.charAt(i)- n1);
        }
        return resultado;
    }
    
    
    public static void main(String[]args){
        Cesar c = new Cesar();
        String s= c.cifrar("hola", 2);
        System.out.println(s);
        String s1=c.Dcifrar(s, 2);
        System.out.println(s1);
        
        
    }
    
}
