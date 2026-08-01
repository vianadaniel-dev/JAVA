/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.codeup.corporatetalenthub;

import com.codeup.corporatetalenthub.modelo.Empleado;
import com.codeup.corporatetalenthub.modelo.EmpresaRecord;

/**
 *
 * @author unknown
 */
public class App {

    public static void main(String[] args) {
        String encabezado = """
                =====================================
                     CORPORATE TALENT HUB
                   Gestión del talento humano
                =====================================
                """;
        System.out.println(encabezado);

        Empleado empleado = crearEmpleadoDePrueba();
        EmpresaRecord empresa = new EmpresaRecord(
                "CodeUp Solutions",
                "900123456-7",
                2015);

        System.out.println(empleado);
        System.out.println("Empresa: " + empresa.nombre());
        System.out.println("Salario final: " + empleado.calcularSalarioFinal());
        System.out.println("¿ID par con bono extra?: " + empleado.tieneBonoExtra());
        System.out.println("¿Empleado elegible?: " + empleado.validarElegibilidad());

        if (empleado.tieneBonoExtra()) {
            empleado.actualizarBonoMensual(100_000.0);
            System.out.println("Bono actualizado con +=: " + empleado.getBonoMensual());
        }

    }
    
    private static Empleado crearEmpleadoDePrueba() {
        return new Empleado(
                (byte) 3,             // byte
                (short) 2024,         // short
                102,                  // int: ID par
                1_023_456_789L,       // long: sufijo L
                92.5f,                // float: sufijo f
                3_000_000.0,          // double
                'I',                  // char: contrato indefinido
                true,                 // boolean
                "Daniel Viaña",        // String
                27,
                2,
                500_000.0);
    }
}