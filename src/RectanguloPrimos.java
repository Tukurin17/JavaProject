public class RectanguloPrimos {
    public static void main (String[] args) {
        int n=Integer.parseInt(args[0]),m=Integer.parseInt(args[1]),a,x,me=1000,ma=0,med=0;
        int[][] numeros=new int[n][m];
        System.out.println();
        for (int k=0;k!=n;k++) {
            for (int j=0;j!=m;j++) {
                do {
                    a=(int)aleatorio(10,90);
                } while (!esPrimo(a));
                numeros[k][j]=a;
            }
        }
        imprimir(numeros,n,m);
        for (int p=0;p!=n;p++) {
            if (p%2==0) {
                for (int i=0;i!=m;i++) {
                    x=numeros[p][i];
                    ma=(x>ma)?x:ma;
                    me=(x<me)?x:me;
                    med=med+x;
                }
                System.out.println("Fila Numero: "+p);
                System.out.println("----------------");
                System.out.println("    El numero mayor de la fila "+p+" es: "+ma);
                System.out.println("    El numero menor de la fila "+p+" es: "+me);
                System.out.println("    La media de la fila "+p+" es: "+med/m);
                System.out.println();
            }
        }
    }
    static void imprimir(int[][] numeros,int n,int m) {
        for (int k=0;k!=n;k++) {
            for (int i=0;i!=m;i++) {
                System.out.print(numeros[k][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static double aleatorio(int min,int max) {
        return min+Math.floor(Math.random()*max+1);
    }
    static boolean esPrimo(int e) {
        if (e==1 || e==0) {
            return false;
        }
        for (int x=2;x<=e/2;x++) {
            if (e%x == 0) {
                return false;
            }
        }
        return true;
    }
}
