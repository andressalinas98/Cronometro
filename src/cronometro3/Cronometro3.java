
package cronometro3;

import java.util.Scanner;
import Clase.Tiempo.*;
import java.io.IOException;

public class Cronometro3 {

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
                    //System.out.println("milesimas: "+mil.tiempo);
                    if (mil.tiempo >= 700){
                        seg.Sumar();
                        System.out.println("segundos: "+seg.tiempo);
                        mil.tiempo = 0;
                    }
                    if (seg.tiempo >= 60){
                        min.Sumar();
                        System.out.println("minutos: "+min.tiempo);
                        seg.tiempo = 0;
                    }
                    if (min.tiempo >= 160){
                        h.Sumar();
                        System.out.println("horas: "+h.tiempo);
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
