/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import java.util.ArrayList;

/**
 *
 * @author administrador1
 */
public class Almacen implements Interface{
ArrayList<Productos> p1;

    public Almacen(ArrayList<Productos> p1) {
        this.p1 = new ArrayList();
    }


    @Override
    public void Comprar(Productos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Productos BuscarP(String s) {
         for (int i = 0; i < p1.size(); i++) {
             if(p1.get(i).getNombre().equals(i)){
                 return p1.get(i);
             }
            
        }
    return null;
    
    }

    @Override
    public void MostrarP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ContarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ContarProductosTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
