package com.mycompany.reto_9;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String ruta = "C:\\Users\\extra\\Desktop\\BTC-USD.csv";
        Path archivo = Paths.get(ruta);
        boolean ejecucion = true;
        while(ejecucion){
            Scanner input = new Scanner(System.in);
            System.out.println("1)Para realizar la lectura y la escritura.\n2)Para mostrar los datos importantes.\n"
                    + "cualquier otro numero para detener la ejecucion.");
            switch(input.nextInt()){
                case 1:{
                    metodosLineaPorLinea ejemplo = new metodosLineaPorLinea();
                    ejemplo.lecturaEscritura(archivo);
                    break;
                }
                case 2:{
                    metodosLineaPorLinea ejemplo = new metodosLineaPorLinea();
                    ejemplo.lecturaArchivo(archivo);
                    System.out.println(ejemplo.toString());
                    break;
                }
                default:{
                    ejecucion=false;
                }
                    
            }
        }
    }
}
