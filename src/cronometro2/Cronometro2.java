
package cronometro2;

import java.util.Scanner;
import Clases.Tiempo.*;
import java.io.IOException;

public class Cronometro2 {

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        
        Tiempo mil = new Tiempo();
        Tiempo seg = new Tiempo();
        Tiempo min = new Tiempo();
        Tiempo h = new Tiempo();
        
       System.out.println("Iniciar el Cronometro ------- 1");
       System.out.println("Mostrar tiempos almacenados - 2");
       
       int op = sc.nextInt();
       switch (op) {
           default: {
               System.out.println("Se ha iniciado el Cronometro");
               boolean run = true;
               while (run) {
                   Thread.sleep(1);
                    mil.Sumar();
                    //System.out.println("mil: "+mil.tiempo);
                    if (mil.tiempo >= 700){
                        seg.Sumar();
                        System.out.println("seg: "+seg.tiempo);
                        mil.tiempo = 0;
                    }
                    if (seg.tiempo >= 60){
                        min.Sumar();
                        //System.out.println("min: "+min.tiempo);
                        seg.tiempo = 0;
                    }
                    if (min.tiempo >= 160){
                        h.Sumar();
                        //System.out.println("h: "+h.tiempo);
                        min.tiempo = 0;
                    }
                }
            }
           case 2: {
               //System.out.println("Tiempo: "+mil.milesimas+":"+seg.segundos+":"+min.minutos+":"+min.horas);
               
           }
       }
       
    }
    
}
