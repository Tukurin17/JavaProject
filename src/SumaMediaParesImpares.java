public class SumaMediaParesImpares {
    public static void main (String[] args) {
        int n, alt, max, cpares=0, cimpares=0, sumpares=0, sumimpares=0, medpares, medimpares, medtotal, x=1;
        n=ES.leeN("Cuantos numeros aleatorios quieres generar: ");
        max=ES.leeN("Introduce el maximo numero que se puede generar: ");
        while (x!=n) {
            alt=(int)Math.floor(Math.random()*max+1);
            if (alt%2==0) {
                cpares++;
                sumpares=sumpares+alt;
            }
            else {
                cimpares++;
                sumimpares=sumimpares+alt;
            }
            x++;
        }
        medpares=sumpares/cpares;
        medimpares=sumimpares/cimpares;
        medtotal=(medpares+medimpares)/2;
        System.out.println(
                "Se han generado " +n+ " numeros aleatorios,"+"\n" +
                "Maximo para un numero generado era de " +max+"\n" +
                "----------------------------------------------\n" +
                "La Cantidad de pares es de " +cpares+"\n" +
                "La suma de pares es de " +sumpares+"\n" +
                "La media de pares es de " +medpares+"\n" +
                "----------------------------------------------\n" +
                "La cantidad de impares es de " +cimpares+"\n" +
                "La suma de impares es de " +sumimpares+"\n" +
                "La media de impares es de " +medimpares+"\n" +
                "----------------------------------------------\n" +
                "La media total es de " +medtotal+"\n"
        );
    }
}
