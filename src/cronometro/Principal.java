/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.util.Scanner;

/**
 *
 * @author zll_OKAMI_llz
 */
public class Principal {
     public static void main(String[] args) {
       Scanner op = new Scanner (System.in);
       System.out.println("------CRONOMETRO-------");
       System.out.println("Digite 1 para iniciar el cronometro y x para guardar los tiempos");
       System.out.println("Al final se mostrara los 10 tiempos guardados");
       int opcion =op.nextInt();
       Cronometro c;
       switch (opcion){
           case 1: c = new tiempo;
                    for (int cont=0;cont<10){
                        if (x>0){
                            con++;
                        }
                    }
       }
    }
}
