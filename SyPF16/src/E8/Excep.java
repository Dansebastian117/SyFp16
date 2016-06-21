/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

/**
 *
 * @author administrador1
 */
public class Excep {
    public static void main(String[]args){
        
        String ar2[]={"1","2","3","4"};
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(ar2);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error");
                System.out.println(e.toString());
            }
            
        }
        
    }
    
}
