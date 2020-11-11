/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author Juan Andres
 */
import ES.ES;
public class ValidaNif {
    char letraNIF;
    String letraNIF2 = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static void main(String[] args) {
        NIFValido();
    }
    static void NIFValido(){
        
        String respuesta;
        boolean valido=false;
        letraNIF=letraNIF2.toCharArray();
        do {            
            respuesta=ES.leeDeTeclado("Introduce NIF");
            valido = respuesta.matches("0-9]{3}[A->]");
            if (!valido) {
                System.out.println("Nif no correcto");
            }
        } while (!valido);
        System.out.println("NIF correcto. ");
    }
}
