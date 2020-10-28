public class Matematicas {
    //Mayor de 2 numeros
    public static int mayor2(int n1, int n2) {
        return (n1>n2)?n1:n2;
    }
    //Mayor de 3 numeros
    public static int mayor3(int n1, int n2, int n3) {
        int n;
        if (n1>n2 && n1>n3) {
            n=n1;
        }
        else if (n2>n3) {
            n=n2;
        }
        else {
            n=n3;
        }
        return n;
    }
    //Hacemos la potencia de un numero
    public static int potencia(int n, int p) {
        int c=1, i;
        i=n;
        while (c!=p) {
            n=n*i;
            c++;
        }
        return n;
    }
    //Comprobamos si un numero es primo
    public static boolean esPrimo(int e) {
        for (int x=2;x<=e/2;x++) {
            if (e%x == 0) {
                return false;
            }
        }
        return true;
    }
    //Pasamos un numero binario a decimal
    public static double binarioDecimal(int n) {
        String i=n+"";
        double decimal=0;
        for (int x=i.length()-1;x!=-1;x--) {
            double c=Integer.parseInt(Character.toString(i.charAt(x)));
            if (c!=0) {
                double suma=Math.pow(2, x);
                decimal=decimal+suma;
            }
        }
        return Math.round(decimal);
    }
    //Pasamos un numero decimal a binario
    public static double decimalBinario(int numero) {
        int exp=0, digito;
        double binario=0;
        while (numero!=0) {
            digito = numero%2;
            binario = binario+digito*Math.pow(10, exp);
            exp++;
            numero = numero/2;
        }
        return Math.round(binario);
    }
    //MCD de dos numeros
    public static double mcd(double n1, double n2) {
        while (n1!=n2) {
            if (n1>n2) {
                n1=n1-n2;
            }
            else {
                n2=n2-n1;
            }
        }
        return n1;
    }
    //Factorial de un numero pasado por parametro
    public static double factorial(double n) {
        double f=1;
        for (int i=1;i!=n+1;i++) {
            f=f*i;
        }
        return f;
    }
    //Generamos un cuadrado de n simbolos por cada lado
    public static void cuadrado(int n, char c) {
        for (int i=0;i!=n;i++) {
            System.out.println();
            for (int j=0;j!=n;j++) {
                System.out.print(c);
            }
        }
    }
    //Generamos un rectangulo donde n son las filas y j las columnas
    public static void rectangulo(int n, int j, char c) {
        for (int i=0;i!=n;i++) {
            System.out.println();
            for (int k=0;k!=j;k++) {
                System.out.print(c);
            }
        }
    }
    //Generamos una piramede con el numero de filas y un caracter pasado por parametro
    public static void triangulo(int n, char c) {
        int e=n-1,f=1;
        for (int i=0;i!=n;i++) {
            System.out.println();
            for (int k=0;k!=e;k++) {
                System.out.print(" ");
            }
            for (int j=0;j!=f;j++) {
                System.out.print(c);
            }
            e--;
            f=f+2;
        }
    }
    //Generamos un rombo con el numero de filas y un caracter pasado por parametro
    public static void rombo(int n, char c) {
        int nn=n;
        n=n+1;
        int e=n-1,f=1;
        for (int i=0;i!=n;i++) {
            System.out.println();
            for (int k=0;k!=e;k++) {
                System.out.print(" ");
            }
            for (int j=0;j!=f;j++) {
                System.out.print(c);
            }
            e--;
            f=f+2;
        }
        System.out.println();
        for(int numBlancos=1,numCarac=(nn*2)-1;numCarac>0;numBlancos++,numCarac-=2){
            for(int i=0; i<numBlancos;i++) {
                System.out.print(" ");
            }
            for(int j=numCarac;j>0;j--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    //Numero aleatorio con un maximo por parametro
    public static double aleatorio(int max) {
        return Math.floor(Math.random()*max+1);
    }
    //-------------------------------------------------------------------------------------DEBUG
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void fix(double x) {
        System.out.println(ANSI_YELLOW+"Debug Nº: "+ANSI_RED+Math.round(x)+ANSI_RESET);
    }
}
