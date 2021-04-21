
package ejercicio.pkg1.sentencias.pkgif;

import java.util.Scanner;

public class Ejercicio1SentenciasIF {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba dos variables:");
        int valor1 = leer.nextInt();
        int valor2 = leer.nextInt();
    System.out.println("---------- 1 ----------");   
        Scanner Leer = new Scanner(System.in);
        if (valor2>valor1) {
            System.out.println( valor2 +" "+"Es mayor");
        }else{
            System.out.println( valor1 +" "+"Es mayor");
        }
    System.out.println("---------- 2 ----------");
        if (valor2>valor1) {
            System.out.println( valor2 +" "+"Es mayor y" +" "+ valor1 +" "+"Es menor");
        }else{
            System.out.println( valor1 +" "+"Es mayor" +" "+ valor2 +" "+ "Es menor");
        }
    System.out.println("---------- 3 ----------");
        if (valor1>valor2) {
            System.out.println( valor2 +" "+"Es mayor y" +" "+ valor1 +" "+"Es menor");
        }else{
            if (valor2>valor1) {
                System.out.println( valor1 +" "+"Es mayor" +" "+ valor2 +" "+ "Es menor");
            }else{
                System.out.println("Son iguales");   
            }
        }
    System.out.println("---------- 4 ----------"); 
        System.out.println("Ingrese un año:");
        int añoActual = 2021;
        int añoRandom = leer.nextInt();
        int resul = añoActual-añoRandom;
        if (añoRandom > añoActual) {
            int conver = -1 * resul;
           System.out.println("han pasado "+conver+" Años");
        }else{
            System.out.println("Faltan "+resul+" Años para llegar al 2021");
        }
    System.out.println("---------- 5 ----------");
    //numeros negativos y positivos
    System.out.println("Ingrese un numero cualquiera");
    int num = leer.nextInt();
        if (num>0) {
            System.out.println("Es Positivo");
        }else{
            if (num<0) {
                System.out.println("Es Negativo");
            }else{
                System.out.println("excepción de 0");
            }
        }
    System.out.println("---------- 6 ----------");
    int cifras = leer.nextInt();
        if (cifras>=10 && cifras<=99) {
            System.out.println("Tiene dos cifras");
        }else{
            if (cifras>0 && cifras<10) {
                System.out.println("Distinto a dos cifras");
            }else{
                System.out.println("No tiene cifras");
            }
        }
    }
    
}
