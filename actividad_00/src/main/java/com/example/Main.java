package com.example;
public class Main {
    public static void main(String[] args) {
        ClaseAlumnos alumno_1 = new ClaseAlumnos();
        ClaseAlumnos alumno_2 = new ClaseAlumnos(22, "pepito");
        ClaseAlumnos alumno_3 = new ClaseAlumnos("pepote");

        System.out.println(alumno_1);
        System.out.println(alumno_2);
        System.out.println(alumno_3);

        System.out.println(alumno_1.Clase_imprimir_alumno());

        alumno_1.nombre("pepito");

        System.out.println(alumno_1.nombre());
    }
}

