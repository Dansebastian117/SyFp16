/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author administrador1
 */
    

public class Cuenta {
    double saldo ;
    int cuenta;
    int cliente;

    private Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public int getCliente() {
        return cliente;
    }

    public Cuenta(double saldo, int cuenta, int cliente) {
        this.saldo = saldo;
        this.cuenta = cuenta;
        this.cliente = cliente;
    }

    
     
    public double checkSaldo(){
        return saldo;
        
    }
    
    public void deposito(double d)throws WrongAE{
        if(d <= 0.00){
            throw new WrongAE("No puedes depositar 0.00 creditos");
        }else{
            saldo = saldo + d;
            System.out.println(saldo);
        }
        
    }
    
    public void retiro(double retiro)throws SaldoIE{
        if(retiro >= saldo){
            throw new SaldoIE("No tienes suficientes creditos");
        }
        if(retiro <= 0.00){
            throw new SaldoIE("No puedes retirar 0.00");
        }else{
            saldo = saldo - retiro;
            System.out.println(saldo);
        }
    }
    
    public static void main(String[]args){
        Cuenta cuenta = new Cuenta();
        
        double saldo = cuenta.checkSaldo();        
        try {            
            cuenta.deposito(10.00);
            cuenta.retiro(200.0);
            cuenta.deposito(10.00);
            cuenta.deposito(10.00);
            cuenta.deposito(10.00);
            cuenta.deposito(10.00);
            
        } catch (WrongAE | SaldoIE ex) {
            System.out.println(ex.toString());                                
        }
        System.out.println("saldo" + cuenta.checkSaldo());
    }
 }

