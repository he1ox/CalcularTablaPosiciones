package com.modelo;

/**
 * @author Jorge A. López
 *         Abstracción del 'equipo' para manipular los datos
 */
public class Equipo {
    //Propiedades
    private String nombre;
    private int juegos;
    private int puntos;
    private int ganados;
    private int empates;
    private int perdidos;
    private int golesAFavor;
    private int golesEnContra;
    private int diferenciaGoles;

    
    //Constructor vacío
    public Equipo() {
    }

    //Sobrecarga de constructores
    public Equipo(String nombre, int ganados, int empates, int perdidos, int golesAFavor, int golesEnContra,
            int diferenciaGoles) {
        this.nombre = nombre;
        this.ganados = ganados;
        this.empates = empates;
        this.perdidos = perdidos;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
        this.diferenciaGoles = diferenciaGoles;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGoles() {
        return ganados;
    }

    public void setGoles(int goles) {
        this.ganados = goles;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getDiferenciaGoles() {
        return diferenciaGoles;
    }

    public void setDiferenciaGoles(int diferenciaGoles) {
        this.diferenciaGoles = diferenciaGoles;
    }

    /**
     * Devuelve información del objecto
     */
    @Override
    public String toString() {
        return "Equipo [diferenciaGoles=" + diferenciaGoles + ", empates=" + empates + ", goles=" + ganados
                + ", golesAFavor=" + golesAFavor + ", golesEnContra=" + golesEnContra + ", juegos=" + juegos
                + ", nombre=" + nombre + ", perdidos=" + perdidos + ", puntos=" + puntos + "]";
    }

    
}
