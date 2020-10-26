public class Figuras {
    public static void main(String[] args) {
        int opcionElegida = pintaMenu("Figuras", "Cuadrado", "Rectangulo","Triangulo", "Rombo");
        switch(opcionElegida) {
            case 1:
                int n;
                n=ES.leeN("Introduce las filas del cuadrado: ");
                char c=ES.leecaracter("Introduce el caracter: ");
                cuadrado(n,c);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.err.println("La intruccion elegida no existe en el programa!");
                ES.debug(4);
        }
    }
    static int pintaMenu(String titulo, String op1, String op2, String op3, String op4) {
        System.err.println("--" + titulo + "--");
        System.out.println("1.-" + op1);
        System.out.println("2.-" + op2);
        System.out.println("3.-" + op3);
        System.out.println("4.-" + op4);
        System.out.println("---------------");
        return ES.leeN("Introduce la opcion: ");
    }
    static void cuadrado(int n, char c) {
        for (int i=0;i!=n;i++) {
            System.out.println();
            for (int j=0;j!=n;j++) {
                System.out.print(c);
            }
        }
    }
}
