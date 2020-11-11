/**
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
public class PruebaMatematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
    }
    static int pintaMenu(String titulo, String op1, String op2, String op3){
        int op;
        int opElegida=pintaMenu("Calculo del area: ", "Triangulo", "Circulo", "Cilindro");
         int opcion;
        do { 
        System.out.println("//**********"+titulo+"**************//");
        System.out.println("1.- "+op1);
        System.out.println("2.- "+op2);
        System.out.println("3.- "+op3);
        System.out.println("4.- Mayor de tres ");
        System.out.println("5.- Potencias ");
        System.out.println("6.- Suma, media y cantidad de parImpar");
        System.out.println("7.- Factorial.");
        System.out.println("8.- Primitiva");
        System.out.println("11.- SubMenu figura");
        System.out.println("12.- BinarioDecimal");
        System.out.println("13.- Decumal Binario");
        System.out.println("14.- Decimal Binario");
        System.out.println("15.- Decumal Binario");
        System.out.println("//************************//");
        
        
        opcion=ES.leeN("Introduce numero para el menu: ");
                  
            switch (opcion) {
                case 1:
                    float base = ES.leeN("Introduce base: ");
                    float altura = ES.leeN("Introduce altura: ");
                    System.out.println("El area es: " + Matematicas.areaTriangulo(base, altura));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    int a = ES.leeN("Introduce numero: ");
                    int b = ES.leeN("Introduce numero: ");
                    int c = ES.leeN("Introduce numero: ");
                    Matematicas.mayorTres(a, b, c);
                    break;
                case 5:
                    int exp;
                    exp = ES.leeN("Introduce exponente: ");
                    b = ES.leeN("Introduce base: ");
                    int p = Matematicas.potencia(exp, b);
                    System.out.println("La potencia de " + b + " es " + p);
                    break;
                case 6:
                    int n = ES.leeN("Introduce numero: ");
                    Matematicas.sumaMediaImparPar(n);
                    break;
                case 7:
                    int num = ES.leeN("Introduce numero: ");
                    System.out.println("Factorial: " + Matematicas.factorialgativo(num));
                    break;
                case 8:
                    System.out.println("Primitiva: \n");
                    Matematicas.primitiva();
                    break;
                case 9:
                    n = ES.leeN("Introduce numero: ");
                    int m = ES.leeN("Introduce numero: ");
                    System.out.println("MCD: " + Matematicas.MCD(n, m));
                    break;
                case 10:
                    n = ES.leeN("Introduce numero: ");
                    Matematicas.cantidadPrimo(n);
                    break;
                case 11:
            do{
                System.out.println("************SubMenu************\n"
                        + "\t1.-Cuadrado\n"
                        + "\t2.-Rectangulo\n"
                        + "\t3.-Triangulo\n"
                        + "\t4.-Piramide\n"
                        + "\t5.-Rombo\n"
                        + "\t0.-Salir 0\n");
                op = ES.leeN("Iintroduce opcion: ");
                
                switch(op){
                    case 1:
                        n = ES.leeN("Introduce numero de lados: ");
                        char simbolo = ES.leecaracter("Introduce simbolo: ");
                        Matematicas.cuadrado(n, simbolo);
                        break;
                    case 2:
                        n = ES.leeN("Introduce numero de lados: ");
                        m = ES.leeN("introduce columna: ");
                        simbolo = ES.leecaracter("Introduce simbolo: ");
                        Matematicas.rectangulo(n, m, simbolo);

                        break;
                    case 3:
                        n = ES.leeN("Introduce numero de lados: ");
                        simbolo = ES.leecaracter("Introduce simbolo: ");
                        Matematicas.triangulo(n, simbolo);

                        break;
                    case 4:
                        n = ES.leeN("Introduce numero de lados: ");
                        simbolo = ES.leecaracter("Introduce simbolo: ");
                        Matematicas.piramide(n, simbolo);
                        break;
                    case 5:
                        n = ES.leeN("Introduce numero de lados: ");
                        simbolo = ES.leecaracter("Introduce simbolo: ");
                        Matematicas.rombo(n, simbolo);
                        break;

                }
            }while (op!=0);
                 
                case 12:
                    long binario = ES.leeN("Introduce numero: ");
                    System.out.println(Matematicas.binarioDecimal(binario));
                    break;
                case 13:
                    int decimal = ES.leeN("INtroduce numero");
                    Matematicas.decimalBinario(decimal);
                case 14:
                    decimal = ES.leeN("Introduce numero");
                    Matematicas.pasarBinarioString(decimal);
                    break;
                case 15:
                    /*String binari=ES.leeDeTeclado("Introduce binario: ");
                    reverse(binari);*/
                    
                    /*Decimal a Binario*/
                    decimal=ES.leeN("Introduce numero: ");
                    System.out.println(Integer.toBinaryString(decimal));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion!=0);
        return opcion;   
    }
}