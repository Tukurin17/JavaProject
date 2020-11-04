import java.util.Arrays;

public class MatrizAleatorios {
    public static void main (String[] args) {
        int n=Integer.parseInt(args[0]),a,m=0,x=0,c=0;
        int[] numeros=new int[n*n];
        for (int k=0;k!=n;k++) {
            for (int i=0;i!=n;i++) {
                a=(int)aleatorio(10,90);
                System.out.print(a);
                System.out.print(" ");
                if (esPrimo(a)) {
                    m=m+a;
                    c++;
                }
                numeros[x]=a;
                x++;
            }
            System.out.println();
        }
        Arrays.sort(numeros);
        System.out.println("El numero mayor generado es: "+numeros[numeros.length-1]);
        System.out.println("El numero menor generado es: "+numeros[0]);
        System.out.println("La media de los numeros primos es: "+m/c);
    }
    static double aleatorio(int min,int max) {
        return min+Math.floor(Math.random()*max-min+1);
    }
    static boolean esPrimo(int e) {
        for (int x=2;x<=e/2;x++) {
            if (e%x == 0) {
                return false;
            }
        }
        return true;
    }
}
