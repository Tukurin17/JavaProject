/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author Usuario
 */
public class Matematicas {
    static float areaTriangulo(float base, float altura) {
       float resultado; 
       resultado = base*altura/2;
       return resultado;
    }

    static void mayorTres(int a, int b, int c) {
        if (a>b && a<c) {
            System.out.println("Mayor " +a);
        } else {
            if (b>c) {
                System.out.println("Mayor "+b);
            } else {
                System.out.println("Mayor "+c);
            }
        }
    }
    static int potencia(int exp, int b){
        int potencia=1;
        do {            
            potencia=potencia*b;
            exp--;
        } while (exp<=0);
        return potencia;
    }
    
    static void sumaMediaImparPar(int n){
        boolean salir=false;
        
        int suma,i;
        suma=0;
        i=1;
        int p,ip;
        p=0;ip=0;
        do {
            //int m=(int)Math.floor(Math.random()*500+1);
            int m=random(500, 1);
            suma=suma+m;
            
            if (parImpar(m)==true) {
                System.out.println("Par");
               p++;
            } else {
                System.out.println("Impar");
                ip++;
            }
            i++;
            System.out.print("Numeros aleatorios: "+m+"\n");
         
        } while (i<=n);
        int media=suma/2;
        
        System.out.println("Suma: "+suma+"\n"
            +"\t Media: "+media+"\n"
            +"\t Cantidad de par: "+p+"\n"
            +"\t Cantidad de impares: "+ip+"\n");
        
    }
    static boolean parImpar(int n){
        boolean p=true;
        if (n%2==0) {
            return p;
        }else{
            p=false;
        }
       return p;
    }
    
    static int random(int max, int min){
        return (int)Math.floor(Math.random()*(max-min+1))+min;
    }
     static long randomlong(int max, int min){
        return (long)Math.floor(Math.random()*(max-min+1))+min;
    }
    
    static void primitiva(){
       int i=0;
       System.out.println("Numero: ");
            do { 
                
            int pri = random(49, 1);
                 
                 System.out.print(pri+", ");
                 i++;
        } while (i<6);
            int estrella = random(9, 1);
            long joker = randomlong(999999, 0);
            
            System.out.println("\nEstrella: "+estrella+"\n"+"Jocker: "+joker);
    
    }
    static int factorialgativo(int n){
        int fact=1;
        if (n<0) {
            n=n*-1;
            fact = factorial(n);
         
        }else
            fact = factorial(n);
        
        return fact;
    }
    static int factorial(int n){
        int fact=1;   
        do {            
            fact=fact*n;
            n--;
        } while (n!=0);
       
       return fact;
    }
    static int MCD(int n, int m){
        int mayor, menor;
        int resto=0;
        if (n>m) {
            mayor = n;
            menor = m;
            do {            
            resto=mayor%menor;
            mayor=menor;
            menor = resto;
            } while (menor==0);
        }else{
            mayor=m;
            menor=n;
            do {            
            resto=mayor%menor;
            mayor=menor;
            menor = resto;
            } while (menor==0);
        }
        
        return menor;
    }
    static boolean EsPrimo(int n){
    
         if (n<2)
            return false;
                    
		int div=n/2;
		while(n%div!=0){
			div--;
		}
		if(div==1)
			return true;
		else 
			return false;
    }
    static void cantidadPrimo(int n){
        
        for (int i = 0; i <= n; n--) {           
            if (EsPrimo(n)==true) {
                System.out.println("El numero: "+n+" es primo");
            } else {
                System.out.println("El numero: "+n+" es no primo");
            }
            
        }
    }

   static void cuadrado(int n, char simbolo) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(simbolo);
            }
            System.out.println("");
        }
    }
    static void rectangulo(int n,int m, char simbolo) {
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <=m; j++) {
              System.out.print(simbolo);
          }
          System.out.println("");
      }
    }
    static void triangulo( int fil, char simbolo){
        for (int i = 1; i <= fil; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(simbolo);
                
            }
            System.out.println("");
        }
    }

    static void piramide(int n, char simbolo) {
         for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int p = 1; p <=(2*i)-1; p++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
    static void rombo(int n, char simbolo){
           for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= (i*2)-1; j2++) {
                System.out.print(simbolo);   
            }
            System.out.println();
        }
        for (int j = 1; j <= n; j++) {
            for (int j2 = 1; j2 <= j; j2++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (j-j)*2+1; k++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
    static long binarioDecimal(long n){
        int exp=0;
        long decimal =0;
        long digito;
          while (n != 0) {
                digito = n % 10;                       
                decimal = decimal + digito * (int) Math.pow(2, exp);
                exp++;
                n = n / 10;
      }
        return decimal;
    }
    
    static void decimalBinario (int decimal){

        int digitos = (int) Math.floor(Math.log(decimal)/Math.log(2));
            if( (Math.log(decimal) % Math.log(2)) < 1)
                    digitos++;

        int cociente = decimal;
        int resto;
        int posicion = 0;
        int[] binario = new int[digitos];

        do{

            resto = cociente % 2;
            cociente = cociente/2;
            binario[posicion] = resto;
            posicion++;

        } while(cociente >= 2);

        binario[posicion] = cociente;

        for(int i=(binario.length-1);i>=0;i--){
            System.out.print(binario[i]+" ");
        }
    }
    public static String pasarBinarioString(int decimal){
        String binario="";
        int resti=0;
        while(decimal > 0){
            reverse(binario);
            binario=binario+(decimal%2);
            decimal=decimal/2;
            
        }
        return binario;
    }
    static String reverse(String binario){
        
        String inverso="";
        for (int i = binario.length()-1; i >=0 ; i--) {
            inverso += binario.charAt(i);
            
        }
        
        return inverso;
    }
    static void pruebaArray(){
        int nota[] = new int[30];
        int nota2[] = new int[]{5,6,7};
        System.out.println(nota[2]);
        
        for (int i = 0; i < nota.length; i++) {
            System.out.println(nota[i]+"-");         
        }
        for (int i = 0; i < nota2.length; i++) {
            System.out.println(nota2[i]+"-");
        }
        if (mismoContenido(nota, nota2)) {
            System.out.println("Nota y nota2 tiene el mismo contenido");
        }else{
            System.out.println("Nota y nota2 no son iguales.");
        }
        
    }
    static boolean mismoContenido(int[] a, int[] b){
        if (a.length==b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i]!=b[i]) {
                    return false;
                }
            }
            return true;
        }else
            return false;
    }
    
}
