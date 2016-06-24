/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/*
 ▓█████▄  ███▄    █  ▄▄▄██▀▀▀    ▄████▄   ▒█████   ██▀███   ██▓███  
▒██▀ ██▌ ██ ▀█   █    ▒██      ▒██▀ ▀█  ▒██▒  ██▒▓██ ▒ ██▒▓██░  ██▒
░██   █▌▓██  ▀█ ██▒   ░██      ▒▓█    ▄ ▒██░  ██▒▓██ ░▄█ ▒▓██░ ██▓▒
░▓█▄   ▌▓██▒  ▐▌██▒▓██▄██▓     ▒▓▓▄ ▄██▒▒██   ██░▒██▀▀█▄  ▒██▄█▓▒ ▒
░▒████▓ ▒██░   ▓██░ ▓███▒      ▒ ▓███▀ ░░ ████▓▒░░██▓ ▒██▒▒██▒ ░  ░
 ▒▒▓  ▒ ░ ▒░   ▒ ▒  ▒▓▒▒░      ░ ░▒ ▒  ░░ ▒░▒░▒░ ░ ▒▓ ░▒▓░▒▓▒░ ░  ░
 ░ ▒  ▒ ░ ░░   ░ ▒░ ▒ ░▒░        ░  ▒     ░ ▒ ▒░   ░▒ ░ ▒░░▒ ░     
 ░ ░  ░    ░   ░ ░  ░ ░ ░      ░        ░ ░ ░ ▒    ░░   ░ ░░       
   ░             ░  ░   ░      ░ ░          ░ ░     ░              
 ░                             ░                                   
                                                                   
      ,---,           ,--.'|      .-- -.' \                                                
  .'  .' `\     ,--,:  : |      |    |   :                                    ,-.----.   
,---.'     \ ,`--.'`|  ' :      :    ;   |                    ,---.    __  ,-.\    /  \  
|   |  .`\  ||   :  :  | |      :        |                   '   ,'\ ,' ,'/ /||   :    | 
:   : |  '  |:   |   \ | :      |    :   :           ,---.  /   /   |'  | |' ||   | .\ : 
|   ' '  ;  :|   : '  '; |      :                   /     \.   ; ,. :|  |   ,'.   : |: | 
'   | ;  .  |'   ' ;.    ;      |    ;   |         /    / ''   | |: :'  :  /  |   |  \ : 
|   | :  |  '|   | | \   |  ___ l                 .    ' / '   | .; :|  | '   |   : .  | 
'   : | /  ; '   : |  ; .'/    /\    J   :        '   ; :__|   :    |;  : |   :     |`-' 
|   | '` ,/  |   | '`--' /  ../  `..-    ,        '   | '.'|\   \  / |  , ;   :   : :    
;   :  .'    '   : |     \    \         ;         |   :    : `----'   ---'    |   | :    
|   ,.'      ;   |.'      \    \      ,'           \   \  /                   `---'.|    
'---'        '---'         "---....--'              `----'                      `---`                                                                   
                                                                   
                                                                   
                                                               
*/
/**
 *
 * @author administrador1
 */
public class Banco {

    List<Cliente> listaclientes;
    List<Cuenta> cuentas;

    public Banco() {
         listaclientes = new ArrayList();
         cuentas = new ArrayList();
    }
    
    
    public void agregarCliente(Cliente c){
        listaclientes.add(c);
    }
    
    public void agregarCuenta(Cuenta c){
        cuentas.add(c);
    }
    
    public void guardarClientes(){
        try(BufferedWriter br = new BufferedWriter(new FileWriter("clientes.txt", true)))
        {
            // Recorre cada cliente de la lista
            for(Cliente cl: listaclientes){
                br.write(cl.getID() + "," + cl.getEdad() + "," + cl.getNombre() + "," + cl.getNumCuenta() + "\n" );
            }
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
    }
    
    public void guardarCunetas(){
  
        try(BufferedWriter br = new BufferedWriter(new FileWriter("clientes.txt", true)))
        {
             // Recorre cada cliente de la lista
            for(Cuenta cu: cuentas){
                br.write( cu.getCliente() + "," + cu.getCuenta() + "," +  cu.getSaldo() + "\n" );
            }
        }catch(FileNotFoundException e){
            
        }catch(IOException e){
            
        }
    }
    
    /**
 *
 *           _____                    _____                    _____                    _____          
         /\    \                  /\    \                  /\    \                  /\    \         
        /::\____\                /::\    \                /::\    \                /::\____\        
       /::::|   |               /::::\    \               \:::\    \              /::::|   |        
      /:::::|   |              /::::::\    \               \:::\    \            /:::::|   |        
     /::::::|   |             /:::/\:::\    \               \:::\    \          /::::::|   |        
    /:::/|::|   |            /:::/__\:::\    \               \:::\    \        /:::/|::|   |        
   /:::/ |::|   |           /::::\   \:::\    \              /::::\    \      /:::/ |::|   |        
  /:::/  |::|___|______    /::::::\   \:::\    \    ____    /::::::\    \    /:::/  |::|   | _____  
 /:::/   |::::::::\    \  /:::/\:::\   \:::\    \  /\   \  /:::/\:::\    \  /:::/   |::|   |/\    \ 
/:::/    |:::::::::\____\/:::/  \:::\   \:::\____\/::\   \/:::/  \:::\____\/:: /    |::|   /::\____\
\::/    / ~~~~~/:::/    /\::/    \:::\  /:::/    /\:::\  /:::/    \::/    /\::/    /|::|  /:::/    /
 \/____/      /:::/    /  \/____/ \:::\/:::/    /  \:::\/:::/    / \/____/  \/____/ |::| /:::/    / 
             /:::/    /            \::::::/    /    \::::::/    /                   |::|/:::/    /  
            /:::/    /              \::::/    /      \::::/____/                    |::::::/    /   
           /:::/    /               /:::/    /        \:::\    \                    |:::::/    /    
          /:::/    /               /:::/    /          \:::\    \                   |::::/    /     
         /:::/    /               /:::/    /            \:::\    \                  /:::/    /      
        /:::/    /               /:::/    /              \:::\____\                /:::/    /       
        \::/    /                \::/    /                \::/    /                \::/    /        
         \/____/                  \/____/                  \/____/                  \/____/         
                                                                                             
 */
    
    
    public static void main(String[]args){
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Daniel", "19", 77530, 7);
        Cliente cliente2 = new Cliente("Daniel", "19", 77531, 8);
        Cliente cliente3 = new Cliente("Daniel", "19", 77532, 9);
        Cliente cliente4 = new Cliente("Daniel", "19", 77533, 10);
        Cliente cliente5 = new Cliente("Daniel", "19", 77534, 11);
        banco.agregarCliente(cliente);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);
        banco.agregarCliente(cliente4);
        banco.agregarCliente(cliente5);
        banco.guardarClientes();
        
        Cuenta cuenta0 = new Cuenta(100,7,77530);
        Cuenta cuenta1 = new Cuenta(134,8,77531);
        Cuenta cuenta2 = new Cuenta(12134,9,77532);
        Cuenta cuenta3 = new Cuenta(13134,10,77533);
        Cuenta cuenta4 = new Cuenta(121134,11,77534);
        banco.agregarCuenta(cuenta0);
        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta3);
        banco.agregarCuenta(cuenta4);
        banco.guardarCunetas();
    }
}
    
    


