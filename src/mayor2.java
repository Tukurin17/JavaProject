public class mayor2 {
    public static void main (String[] args) {
        int n1, n2;
        n1=ES.leeN("Introduce el primer numero: ");
        n2=ES.leeN("Introduce el segundo numero: ");
        int i=(n1>n2)?n1:n2;
        System.out.println("El numero " + i +" es mayor!");
    }
}