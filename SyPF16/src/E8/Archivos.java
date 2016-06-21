/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author administrador1
 */
public class Archivos {
    public void leer(){
        try{
            
            BufferedReader br ;
        br = new BufferedReader(new FileReader("newfile.txt"));
            String linea;
        
        linea = br.readLine();
        
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
        
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("no puedo leer archivo");
        }
        finally{
            
            
        }
    }
    public void escribir()throws IOException{
        BufferedWriter bw ;
        
            bw = new BufferedWriter(new FileWriter("newfile.txt", true));
        bw.write("weadup");
        bw.close();
        
  
            bw.close();
        
    }
        public static void main(String [] args) throws IOException{
            Archivos a = new Archivos();
            a.leer();
            a.escribir();
        }
}
