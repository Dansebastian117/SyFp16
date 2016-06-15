/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER2;

/**
 *
 * @author administrador1
 */
public class Main {
    public static void main(String[]args){
        AAbstract at = new ArchivoTexto();
        AAbstract ab = new ArchivoBinario();
        AAbstract ai = new ArchivoImagen();
        
        at.DesplegarArchivo();
        at.abrirLectura(null, true);
        at.cerrarArchivo();
        ab.DesplegarArchivo();
        ab.abrirLectura(null, true);
        ab.cerrarArchivo();
        ai.DesplegarArchivo();
        ai.abrirLectura(null, true);
        ai.cerrarArchivo();
        
        
        
        
    }
}
