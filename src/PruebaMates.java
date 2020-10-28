public class PruebaMates {
    public static void main (String[] args) {
        prueba(Matematicas.mayor2(2,3));
        prueba(Matematicas.mayor3(2,3,4));
        prueba(Matematicas.aleatorio(500));
        prueba(Matematicas.binarioDecimal(101));
        prueba(Matematicas.decimalBinario(5));
        prueba( Matematicas.esPrimo(11));
        prueba(Matematicas.factorial(8));
        prueba(Matematicas.mcd(20,10));
        prueba( Matematicas.potencia(2,3));
        Matematicas.fix(3);
        Matematicas.cuadrado(3,'*');
        Matematicas.rectangulo(3,4,'*');
        Matematicas.triangulo(3,'*');
        Matematicas.rombo(8,'*');
    }
    static void prueba(int x) {
        System.out.println(x);
    }
    static void prueba(double x) {
        System.out.println(Math.round(x));
    }
    static void prueba(boolean x) {
        System.out.println(x);
    }
}
