package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);

        ClaseAlumnos alumno_1 = new ClaseAlumnos();
        ClaseAlumnos alumno_2 = new ClaseAlumnos(22, "pepito");
        ClaseAlumnos alumno_3 = new ClaseAlumnos("pepote");

        System.out.println(alumno_1);
        System.out.println(alumno_2);
        System.out.println(alumno_3);

        System.out.println(alumno_1.Clase_imprimir_alumno());

        alumno_1.nombre("pepito");

        System.out.println(alumno_1.nombre());
        
        String menu = "menu: \n1. Opcion 1\n2. Opcion 2\n3. Opcion 3: salir\n";

        String opcion;

        do {
            System.out.println(menu);
            opcion = scr.next();
            switch (opcion) {
                case "1":
                    System.out.println("Opcion 1");
                    System.out.println("Crear alumno");
                    crear_alumno();
                    break;
                case "2":
                    System.out.println("Opcion 2"); 
                case "3":
                    System.out.println("Opcion 3");        
            };
        } while (!opcion.equals("3"));

        scr.close();
    }

    private static void crear_alumno(){
        System.out.println("Nombre: ");
        Scanner scr = new Scanner(System.in);
                String nombre = scr.next();
        System.out.println("Edad: ");
        int edad = scr.nextInt();
        ClaseAlumnos alumno = new ClaseAlumnos(edad, nombre);
        System.out.println(alumno);
        scr.close();
    }
}

