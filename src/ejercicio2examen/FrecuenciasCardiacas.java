package ejercicio2examen;

import java.util.Scanner;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mes;
    private int dia;
    private int año;

    public FrecuenciasCardiacas(String nombre, String apellido, int mes, int dia, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public FrecuenciasCardiacas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int obtenerFechaNacimiento(){
        int dia,mes,año;
        Scanner x= new Scanner(System.in);
        System.out.println("Ingresa el dia de su nacimiento: ");
        dia=x.nextInt();
        if(dia>31){
            System.out.println("Error, debe de ingresar un numero de escala 1-31");
        } else{
            this.dia = dia;
        }
        System.out.println("Ingresa el mes de su nacimiento: ");
        mes=x.nextInt();
        if(mes>12){
            System.out.println("Error, los meses llegan hasta el numero 12");
        } else{
            this.mes = mes;
        }
         System.out.println("Ingresa el año de su nacimiento: ");
        año=x.nextInt();
        if(año>2023){
           System.out.println("Error, estamos en el año 2023");
        }else{
            this.año = año;
        }
        System.out.println("Su fecha nacimiento es: "+dia+"/"+mes+"/"+año);
        return 0;
    }
    
    public int obtenerFrecuenciaCardiacaMaxima(){
        int edad, fcm, fcs, fce;
        Scanner x= new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        edad=x.nextInt();
        System.out.println("Su edad es: "+edad+" años.");
        fcm=220-edad;
        System.out.println("Su frecuencia cardiaca maxima es: "+fcm);
        fcs=(int) (fcm*.50);
        /*System.out.println("Su frecuencia cardiaca esperada en un 50% es: "+fcs);*/
        fce=(int) (fcm*.85);
        /*System.out.println("Su frecuencia cardiaca esperada en un 85% es: "+fce);*/
        System.out.println("Su frecuencia cardiaca esperada debe de estar entre "+fcs+" y "+fce);
        return 0;
    }
} 