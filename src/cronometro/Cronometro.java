/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author zll_OKAMI_llz
 */
public abstract class Cronometro {
   int opcion;
    int segundos=0,minutos=0,decimas=0,horas=0;
    while (horas<=24){
    while (minutos<=60){
        
    }
}
    public void setOP (int opcion){
        this.opcion = opcion;
    }
    public void setSG (int segundos){
        this.segundos = segundos;
    }
     public void setMN (int minutos){
        this.minutos = minutos;
    }
      public void setHR (int horas){
        this.horas = horas;
    }

    public void setDC(int decimas) {
        this.decimas = decimas;
    }
      
}

