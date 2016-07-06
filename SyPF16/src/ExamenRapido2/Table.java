/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package ExamenRapido2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jjlui
 */
public class Table extends AbstractTableModel {

    String m[][]; //matriz row & column
    int i = 0;
    String nombreArchivo;
    String col[];
    
    String Frame = "FRAME";
    String Glue = "GLUE";
    String Puzzle = "PUZZLE";
    String Storage = "STORAGE";

    Table() {
        //constructor vacio que pide GraphTable
    }

    
    
    public int contarFrame() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            linea = br.readLine();
            i=0;

            col = linea.split(",");
            i = col.length;
            while(linea != null){
                i = i +1;
                if(col[1].equals("Frame")){
                    i = i +1;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException ex) {

        }
        return i;

    }
    public int contarGlue() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            linea = br.readLine();
            i=0;

            col = linea.split(",");
            i = col.length;
            while(linea != null){
                i = i +1;
                if(col[2].equals("GLUE")){
                    i = i +1;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException ex) {

        }
        return i;

    }
    public int contarPuzzle() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            linea = br.readLine();
            i=0;

            col = linea.split(",");
            i = col.length;
            while(linea != null){
                i = i +1;
                if(col[3].equals("PUZZLE")){
                    i = i +1;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException ex) {

        }
        return i;

    }
    public int contarStorage() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            linea = br.readLine();
            i=0;

            col = linea.split(",");
            i = col.length;
            while(linea != null){
                i = i +1;
                if(col[4].equals("STORAGE")){
                    i = i +1;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        } catch (IOException ex) {

        }
        return i;

    }
    
    
    
   

    @Override
    public int getRowCount() {// metodo abstracto de table model
        return 4;
    }

    @Override
    public int getColumnCount() {// metodo abstracto de table model
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {// metodo abstracto de table model
        return m[rowIndex][columnIndex];
    }

   
    public Table(String s1) throws FileNotFoundException, IOException {
        nombreArchivo = s1;
        int v = contarFrame();
        
        int v1 = contarGlue();
        int v2 = contarPuzzle();
        int v3 = contarStorage();
        m = new String[4][3];
        m[0][0]= "1";
        m[0][1]= "FRAME";
        m[0][2]= "" + v;
        
        
        m[1][0]= "1";
        m[1][1]= "GLUE";
        m[1][2]= "" + v1;
        
        
        m[2][0]= "1";
        m[2][1]= "PUZZLE";
        m[2][2]= "" + v2;
        
        
        m[3][0]= "1";
        m[3][1]= "STORAGE";
        m[3][2]= "" + v3;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        

        
    }

}
