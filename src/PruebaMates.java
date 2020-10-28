public class PruebaMates {
    public static void main (String[] args) {
        int op=1, op2=1, n, j, i;
        char c;
        do {
            pintar("-------------------------------", true);
            pintar(
                "1.- Mayor de 2 Numeros\n"+
                "2.- Mayor de 3 Numeros\n"+
                "3.- Numero aleatorio\n"+
                "4.- Binario Decimal\n"+
                "5.- Decimal Binario\n"+
                "6.- Saber si un numero es primo\n"+
                "7.- Factorial de un numero\n"+
                "8.- MCD de dos numeros\n"+
                "9.- Potencia\n"+
                "10.- Figuras\n"+
                "0.- Salir\n"
            , true);
            pintar("-------------------------------", true);
            op=ES.leeN("Introduce una opcion: ");
            pintar("-------------------------------", true);
            switch (op) {
                case 1:
                    n=ES.leeN("Introduce el primer numero: ");
                    i=ES.leeN("Introduce el segundo numero: ");
                    pintar("El numero mayor es "+Matematicas.mayor2(n,i), true);
                    continuar();
                    continue;
                case 2:
                    n=ES.leeN("Introduce el primer numero: ");
                    i=ES.leeN("Introduce el segundo numero: ");
                    j=ES.leeN("Introduce el tercer numero: ");
                    pintar("El numero mayor es "+Matematicas.mayor3(n,i,j), true);
                    continuar();
                    continue;
                case 3:
                    n=ES.leeN("Introduce hasta que numero se puede generar un aleatorio: ");
                    pintar("El numero aleatorio es "+Math.round(Matematicas.aleatorio(n)), true);
                    continuar();
                    continue;
                case 4:
                    n=ES.leeN("Introduce el numero en binario: ");
                    pintar("El numero "+n+" en decimal es el numero "+Math.round(Matematicas.binarioDecimal(n)), true);
                    continuar();
                    continue;
                case 5:
                    n=ES.leeN("Introduce el numero en decimal: ");
                    pintar("El numero "+n+" en binario es el numero "+Math.round(Matematicas.decimalBinario(n)), true);
                    continuar();
                    continue;
                case 6:
                    n=ES.leeN("Introduce un numero para saber si es primo: ");
                    if (Matematicas.esPrimo(n)) {
                        pintar("El numero "+n+" es primo!", true);
                    }
                    else {
                        pintar("El numero "+n+" no es primo!", true);
                    }
                    continuar();
                    continue;
                case 7:
                    n=ES.leeN("Introduce el numero del que quieres saber el factorial: ");
                    pintar("El factorial del numero "+n+" es de "+Math.round(Matematicas.factorial(n)), true);
                    continuar();
                    continue;
                case 8:
                    n=ES.leeN("Introduce el primer numero: ");
                    i=ES.leeN("Introduce el segundo numero: ");
                    pintar("El MCD es "+Math.round(Matematicas.mcd(n,i)), true);
                    continuar();
                    continue;
                case 9:
                    n=ES.leeN("Introduce numero: ");
                    i=ES.leeN("Introduce el exponente: ");
                    pintar("El resultado es "+Matematicas.potencia(n,i), true);
                    continuar();
                    continue;
                case 10:
                    do {
                        pintar("-------------------------------", true);
                        pintar(
                                "1.- Cuadrado\n"+
                                "2.- Rectangulo\n"+
                                "3.- Piramide\n"+
                                "4.- Rombo\n"+
                                "0.- Volver al menu anterior\n"
                                , true);
                        pintar("-------------------------------", true);
                        op2=ES.leeN("Introduce una opcion: ");
                        pintar("-------------------------------", true);
                        switch (op2) {
                            case 1:
                                n=ES.leeN("Introduce el numero de filas y columnas: ");
                                c=ES.leecaracter("Introduce el caracter con el que pintar la figura: ");
                                Matematicas.cuadrado(n,c);
                                pintar("",true);
                                continuar();
                                continue;
                            case 2:
                                n=ES.leeN("Introduce el numero de filas: ");
                                j=ES.leeN("Introduce el numero de columnas: ");
                                c=ES.leecaracter("Introduce el caracter con el que pintar la figura: ");
                                Matematicas.rectangulo(n,j,c);
                                pintar("",true);
                                continuar();
                                continue;
                            case 3:
                                n=ES.leeN("Introduce el numero de filas: ");
                                c=ES.leecaracter("Introduce el caracter con el que pintar la figura: ");
                                Matematicas.triangulo(n,c);
                                pintar("",true);
                                continuar();
                                continue;
                            case 4:
                                n=ES.leeN("Introduce el numero de filas: ");
                                c=ES.leecaracter("Introduce el caracter con el que pintar la figura: ");
                                Matematicas.rombo(n,c);
                                pintar("",true);
                                continuar();
                                continue;
                            case 0:
                                pintar("Volviendo al menu anterior..." , false);
                                op2=0;
                                continuar();
                                continue;
                            default:
                                pintar("La intruccion elegida no existe en el programa!", false);
                                continuar();
                                continue;
                        }
                    } while (op2!=0);
                    continuar();
                    continue;
                case 0:
                    pintar("Fin del programa..." , false);
                    op=0;
                    continuar();
                    continue;
                default:
                    pintar("La intruccion elegida no existe en el programa!", false);
                    continuar();
                    continue;
            }
        } while (op!=0);
    }
    static void pintar(String x, boolean n) {
        if (n) {
            System.out.println(x);
        }
        else {
            System.err.println(x);
        }

    }
    static void continuar() {
        ES.leeDeTeclado("Pulsa \"ENTER\" para continuar...");
    }
}
