/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjeTablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author administrador1
 */
public class ABTM extends AbstractTableModel{
    String arr[][];
    int i = 0;
    public ABTM(String nombre)throws FileNotFoundException, IOException {
        
        arr = new String[101][6];
        
            String  row[];
            BufferedReader br ;
        br = new BufferedReader(new FileReader("employees.csv"));
            
            String linea;
        
        linea = br.readLine();
        
        while(linea != null){
            row = linea.split(",");
            arr[i]= row;
            i = i +1;
                 linea = br.readLine();
    }

    

            
            
        
    }
    
    @Override
    public int getRowCount() {
        
    return 99;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arr[rowIndex][columnIndex];
    }
    
}
