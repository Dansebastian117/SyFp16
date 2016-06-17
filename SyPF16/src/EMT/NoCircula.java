/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;

/**
 *
 * @author administrador1
 */
public class NoCircula implements Interface{
    
    String color;
    String digitos;
    String dia;    
    String hoy;
    
    
    

    @Override
    public String getHoyNoCircula() {
        return hoy = "Hoy Jueves no circulan los vehiculos:" + " Placa 1 y 2, engomado Verde";
    }

    public String getByPlaca(String digitos) {

        if(digitos == "1" || digitos == "2"){
            return dia = "Jueves";
        }
        if(digitos == "3" || digitos == "4"){
            return dia = "Miercoles";
    }
        if(digitos == "5" || digitos == "6"){
            return dia = "Lunes";
        }
        if(digitos == "7" || digitos == "8"){
            return dia = "Martes";
        }
        if(digitos == "9" || digitos == "0"){
            return dia = "Viernes";
        }else
            return dia = "Escribe tus dígitos";
    }
    

    public String getTerminacionPlaca(String dia) {
        if(dia == "Lunes"){
            return digitos = "5 y 6";
            
        }
        if(dia == "Martes"){
            return digitos = "7 y 8"; 
        }
        if(dia == "Miercoles"){
            return digitos = " 3 y 4";
        }
        if(dia == "Jueves"){
            return digitos = "1 y 2";
        }
        if (dia == "Viernes"){
            return digitos = "9 y 0";
        }
        return digitos;
    }

    public String getColor(String color) {
        if(color == "Amarillo"){
            return dia = "Lunes";
        }
        if(color == "Rosa"){
            return dia = "Martes";
        }
        if(color == "Rojo"){
            return dia = "Miercoles";
        }
        if(color == "Verde"){
            return dia = "Jueves";
        }
        if(color == "Azul"){
            return dia = "Viernes";
        }
    return dia;
    }
    
    
}
