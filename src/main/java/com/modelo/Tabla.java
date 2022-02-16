package com.modelo;

public class Tabla {
    /*TODO 
    Crear un método que llene 'equipos' de información ficticia de 12 equipos 
    usar la clase Equipo para esto
    */
    private Equipo datos[];


    public Tabla(){
        datos = new Equipo[12];
    }

    public void llenarInfo(){
        this.datos[0] = new Equipo("Gaso", 4, 4, 6, 4, 4, 6);
    }

    public void mostrarInfo(){
        System.out.println(datos[0].getNombre());
    }

    public static void main(String[] args){
        Tabla tablita = new Tabla();
        tablita.llenarInfo();
        tablita.mostrarInfo();

    }
}
