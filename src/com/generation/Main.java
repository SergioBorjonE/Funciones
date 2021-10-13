package com.generation;
import java.math.*;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	/* En java si bien son propiamente funciones se denominan "métodos"*/
        /*String mensaje=saludar("Sergio");
        System.out.println(mensaje);
        int resultado=suma(5,3);
        System.out.println(resultado);
        alerta("hola como estan");*/

        /*double limif=-2*Math.PI;
        double limsp=2*Math.PI;

        //pares ordenados de la función seno cardinal
        while (limif<=limsp){
            System.out.println(limif+","+Math.sin(limif*Math.PI)/limif*Math.PI);
            limif+=0.1;
        }*/

        String mensaje1="Hola";
        String mensaje2= "hola";

        System.out.println(mensaje1.length());
        System.out.println(mensaje1.toUpperCase());
        System.out.println(mensaje1.compareTo(mensaje2));
        System.out.println(mensaje1.concat(mensaje2));
        System.out.println(mensaje1.equals(mensaje2));
        System.out.println(mensaje1.getClass());
        System.out.println(mensaje1.equalsIgnoreCase(mensaje2));
        



    }

    public static String saludar(String nombre) {
        return "Hola, como estas "+nombre;
    }

    public static int suma(int num1,int num2){
        return num1+num2;
    }


    public static void alerta(String mensaje){
        System.out.println(mensaje);
    }

}
