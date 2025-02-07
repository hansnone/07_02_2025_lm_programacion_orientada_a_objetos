package com.example;

public class ClaseAlumnos {
    private String nombre;
    private int edad;
    private String curso;
    private String telefono;
    private double saldo;

    public ClaseAlumnos(){}
    public ClaseAlumnos(String nombre){
        this.nombre = nombre;
    }
    public ClaseAlumnos(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "clase_alumnos{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                ", telefono='" + telefono + '\'' +
                ", saldo=" + saldo +
                '}';
    };

    public String Clase_imprimir_alumno(){
        return "Nombre "+nombre+" edad: "+edad;
    };

    public String Clase_imprimir_alumno(ClaseAlumnos alumno){
        return "Nombre "+nombre+" edad: "+edad;
    };
}
