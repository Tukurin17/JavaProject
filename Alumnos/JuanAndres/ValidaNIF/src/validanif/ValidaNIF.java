/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validanif;

/**
 *
 * @author Juan Andres
 */
import ES.ES;

public class ValidaNIF {

    /**
     * @param args the command line arguments
     */
    static char[] letra;
    static String letraNIF2 = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static void main(String[] args) {
        valida();
    }
    //Valida el NIF si falta alguna letra mandara una llamada al metodo letraNif y buscara la letra.
    static void valida() {
        String respuesta;
        boolean valido = false;
        do {
            respuesta = ES.leeDeTeclado("Introduce NIF");
            valido = respuesta.matches("[0-9]{8}[A-Z]{1}"); //Comprueba si el NIF es correcto añadira true si es correcto si no false

            if (!valido) {
                System.err.println("Falta la LETRA");
                valido = respuesta.matches("[0-9]{8}");
                if (!valido) {
                    System.err.println("Faltan algun numero.");

                } else {
                    int n = Integer.parseInt(respuesta);
                    respuesta = respuesta + letraNIF(n);
                    System.out.println(respuesta);
                }
            }
        } while (!valido);
        System.out.println("NIF correcto. ");
    }

    static char letraNIF(int n) {
        int resul = resto(n);
        char letra = ' ';
        for (int i = 0; i < 22; i++) {
            letra = (char) letraNIF2.charAt(resul);
        }
        return letra;

    }

    static int resto(int n) {
        int resultado = n % 23;
        System.out.println(resultado);
        return resultado;
    }
}
