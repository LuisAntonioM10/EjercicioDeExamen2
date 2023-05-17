package ejercicio2examen;

import java.util.Scanner;

public class Ejercicio2Examen {
    public static void main(String[] args) {
        FrecuenciasCardiacas Prueba1 = new FrecuenciasCardiacas();
        
        Scanner x= new Scanner(System.in);
        
        String nombre,apellido;
        System.out.println("Ingresa tu nombre: ");
        nombre = x.nextLine();
        Prueba1.setNombre(nombre);
        System.out.println("Ingresa tu apellido: ");
        apellido = x.nextLine();
        Prueba1.setApellido(apellido);
        System.out.println(Prueba1.obtenerFechaNacimiento());
        System.out.println(Prueba1.obtenerFrecuenciaCardiacaMaxima());
    } 
}