public class BinarioDecimal {
    public static void main (String[] args) {
        int n=ES.leeN("Introduce el numero en binario: ");
        String i=n+"";
        double decimal=0;
        for (int x=i.length()-1;x!=-1;x--) {
            double c=Integer.parseInt(Character.toString(i.charAt(x)));
            if (c!=0) {
                double suma=Math.pow(2, x);
                decimal=decimal+suma;
            }
        }
        System.out.println("El numero "+n+" en decimal es el numero "+Math.round(decimal));
    }
}
