package com.sofka.project;

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        String nombre;
        String tel;
        String edad;
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre= captura.nextLine();
        System.out.println("Ingrese su telefono: ");
        tel=captura.next();
        System.out.println("Ingrese su edad: ");
        edad= captura.next();
        System.out.println("Bienvenido señor "+nombre+", es un placer para nosotros contar con una persona de "+edad+" años. ");
        System.out.println("Próximamente nos comunicaremos con usted al numero "+tel+".");
    }


}


