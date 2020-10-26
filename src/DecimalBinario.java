public class DecimalBinario {
    public static void main(String[] args) {
        int numero, exp=0, digito;
        double binario=0;
        numero=ES.leeN("Introduce el numero en decimal: ");
        while (numero!=0) {
            digito = numero%2;
            binario = binario+digito*Math.pow(10, exp);
            exp++;
            numero = numero/2;
        }
        System.out.println("Binario: "+Math.round(binario));
    }
}
