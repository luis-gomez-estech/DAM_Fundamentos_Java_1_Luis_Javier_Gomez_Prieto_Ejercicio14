package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce una nota del 0 al 10");
        int nota = escaner.nextInt();

        // Si se introduce una nota menor de cero o mayor de 10 nos imprime este mensaje
        if (nota<0||nota>10){
            System.out.println("La nota introducida esta fuera del rango 0 - 10");

        }

        // Si la nota es cero o la nota es menor de 5, imprime
        if (nota == 0||nota <5){
            System.out.println("La nota es INSUFICIENTE");

        }

        if (nota ==5){
            System.out.println("La nota es SUFICIENTE");
        }

        if (nota ==6){
            System.out.println("La nota es BIEN");
        }

        if (nota ==7){
            System.out.println("La nota es NOTABLE");
        }

        if (nota ==8){
            System.out.println("La nota es NOTABLE");
        }


        if (nota ==9){
            System.out.println("La nota es SOBRESALIENTE");
        }

        if (nota ==10){
            System.out.println("La nota es SOBRESALIENTE");
        }


    }


}

