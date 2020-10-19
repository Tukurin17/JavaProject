import java.util.*;
public class primosN {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int d=2;
        int n=2;
        System.out.println("Introduzca un número: ");
        int numero= teclado.nextInt();
        while (n!=numero) {
            if ((n%d)!=0) {
                System.out.println(n);
            }
            n=n+1;
        }
    }
}