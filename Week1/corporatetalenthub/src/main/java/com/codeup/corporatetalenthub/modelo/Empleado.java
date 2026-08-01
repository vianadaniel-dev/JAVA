/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeup.corporatetalenthub.modelo;

/**
 *
 * @author unknown
 */
public class Empleado {
    //8 tipos primitivos
    private byte nivelAcceso;
    private short añoIngreso;
    private int idEmpleado;
    private long numeroDocumento;
    private float puntajeTest;
    private double salarioBase;
    private char tipoContrato;
    private boolean esActivo;
    //String no es primitivo
    private String nombre;
    //Datos adicionales
    private int edad;
    private int idSede;
    private double bonoMensual;
    
    public Empleado(
            byte nivelAcceso,
            short añoIngreso,
            int idEmpleado,
            long numeroDocumento,
            float puntajeTest,
            double salarioBase,
            char tipoContrato,
            boolean esActivo,
            String nombre,
            int edad,
            int idSede,
            double bonoMensual) {
        this.nivelAcceso = nivelAcceso;
        this.añoIngreso = añoIngreso;
        this.idEmpleado = idEmpleado;
        this.numeroDocumento = numeroDocumento;
        this.puntajeTest = puntajeTest;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
        this.esActivo = esActivo;
        this.nombre = nombre;
        this.edad = edad;
        this.idSede = idSede;
        this.bonoMensual = bonoMensual;
    }
    
    public double calcularSalarioFinal(){
        //El resultado del salario sumandole bonos y restando prestaciones
        return (salarioBase + (bonoMensual * 1.10))-(salarioBase * 0.05);
    }
    
     public boolean tieneBonoExtra() {
        // % se evalúa antes que ==. Un residuo cero indica que el ID es par.
        return idEmpleado % 2 == 0;
    }
     
     public boolean validarElegibilidad() {
        // Precedencia: primero !, después && y finalmente ||.
        // Los paréntesis hacen explícitos los dos grupos de condiciones.
        return (puntajeTest > 85 && edad < 30)
                || (idSede == 1 && !esActivo);
    }
    
    public void actualizarBonoMensual(double incremento) {
        // Equivale a: bonoMensual = bonoMensual + incremento;
        bonoMensual += incremento;
    }
    
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getBonoMensual() {
        return bonoMensual;
    }
    
   @Override
    public String toString() {
        return "Empleado{" +
                "nivelAcceso=" + nivelAcceso +
                ", añoIngreso=" + añoIngreso +
                ", idEmpleado=" + idEmpleado +
                ", numeroDocumento=" + numeroDocumento +
                ", puntajeTest=" + puntajeTest +
                ", salarioBase=" + salarioBase +
                ", tipoContrato=" + tipoContrato +
                ", esActivo=" + esActivo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", idSede=" + idSede +
                ", bonoMensual=" + bonoMensual +
                '}';
    }
}