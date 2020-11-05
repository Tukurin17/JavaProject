public class FactoresPrimos {
    public static void main (String[] args) {
        int n,x=0,c2=0,c3=0,c5=0,c7=0,a2=0,a3=0,a5=0,a7=0,e2=0,e3=0,e5=0,e7=0,contador=0;
        n=ES.leeN("Introduce un numero: ");
        int j=n;
        int[][] matriz=new int[2][10];
        do {
            if (n%2==0) {
                n=n/2;
                if (e2==0) {
                    a2=x;
                    e2++;
                }
                matriz[0][a2]=2;
                c2++;
                matriz[1][a2]=c2;
            }
            else if (n%3==0) {
                n=n/3;
                if (e3==0) {
                    a3=x;
                    e3++;
                }
                matriz[0][a3]=3;
                c3++;
                matriz[1][a3]=c3;
            }
            else if (n%5==0) {
                n=n/5;
                if (e5==0) {
                    a5=x;
                    e5++;
                }
                matriz[0][a5]=5;
                c5++;
                matriz[1][a5]=c5;
            }
            else if (n%7==0) {
                n=n/7;
                if (e7==0) {
                    a7=x;
                    e7++;
                }
                matriz[0][a7]=7;
                c7++;
                matriz[1][a7]=c7;
            }
            if (matriz[0][x]!=0) {
                x++;
            }
            if (n==1){n=0;}
        } while (n!=0);
        System.out.println("Los factores primos de "+j+" son: ");
        for (int k=0;k!=10;k++) {
            if (matriz[0][k]!=0) {
                System.out.print(matriz[0][k]+"^"+matriz[1][k]);
            }
            contador++;
            if (contador==1) {
                System.out.print(" + ");
            }
        }
    }
}
