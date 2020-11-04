public class Granjero {
    public static void main (String[] args) {
        int n, p ,x, j=0;
        boolean lobo=false, oveja=false, col=false;
        do {
            j++;
            if (j!=5) {
                ES.debug(j);
                pintar("-------------------------------", true);
                pintar("ELIGE QUIEN DEBE CRUZAR CON EL GRANJERO", true);
                pintar(
                                "1.- Lobo\n"+
                                "2.- Oveja\n"+
                                "3.- Col\n"+
                                "0.- Salir\n"
                        , true);
                pintar("-------------------------------", true);
                n=ES.leeN("Introduce una opcion: ");
                pintar("-------------------------------", true);
                switch (n) {
                    case 1:
                        pintar("El lobo ahora esta en el otro lado", true);
                        lobo=true;
                        p=ES.leeN("Deseas regresar con algun animal? [0 NO, 1 SI]: ");
                        if (p==1) {
                            do {
                                pintar("-------------------------------", true);
                                pintar("ELIGE CON QUIEN QUIERES VOLVER", true);
                                pintar(
                                        "1.- Lobo\n"+
                                                "2.- Oveja\n"+
                                                "3.- Col\n"+
                                                "0.- Salir\n"
                                        , true);
                                pintar("-------------------------------", true);
                                x=ES.leeN("Introduce una opcion: ");
                                pintar("-------------------------------", true);
                                switch (x) {
                                    case 1:
                                        if (lobo) {
                                            lobo=false;
                                            pintar("El lobo ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("El lobo no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 2:
                                        if (oveja) {
                                            oveja=false;
                                            pintar("La oveja ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("La oveja no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 3:
                                        if (col) {
                                            col=false;
                                            pintar("La col ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("La col no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 0:
                                        pintar("Volviendo al menu anterior..." , false);
                                        x=0;
                                        continuar();
                                        continue;
                                    default:
                                        pintar("La intruccion elegida no existe en el programa!", false);
                                        continuar();
                                }
                            } while (x!=0);
                        }
                        continuar();
                        continue;
                    case 2:
                        pintar("La oveja ahora esta en el otro lado", true);
                        oveja=true;
                        p=ES.leeN("Deseas regresar con algun animal? [0 NO, 1 SI]: ");
                        if (p==1) {
                            do {
                                pintar("-------------------------------", true);
                                pintar("ELIGE CON QUIEN QUIERES VOLVER", true);
                                pintar(
                                        "1.- Lobo\n"+
                                                "2.- Oveja\n"+
                                                "3.- Col\n"+
                                                "0.- Salir\n"
                                        , true);
                                pintar("-------------------------------", true);
                                x=ES.leeN("Introduce una opcion: ");
                                pintar("-------------------------------", true);
                                switch (x) {
                                    case 1:
                                        if (lobo) {
                                            lobo=false;
                                            pintar("El lobo ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("El lobo no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 2:
                                        if (oveja) {
                                            oveja=false;
                                            pintar("La oveja ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("La oveja no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 3:
                                        if (col) {
                                            col=false;
                                            pintar("La col ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("La col no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 0:
                                        pintar("Volviendo al menu anterior..." , false);
                                        x=0;
                                        continuar();
                                        continue;
                                    default:
                                        pintar("La intruccion elegida no existe en el programa!", false);
                                        continuar();
                                }
                            } while (x!=0);
                        }
                        continuar();
                        continue;
                    case 3:
                        pintar("La col ahora esta en el otro lado", true);
                        col=true;
                        p=ES.leeN("Deseas regresar con algun animal? [0 NO, 1 SI]: ");
                        if (p==1) {
                            do {
                                pintar("-------------------------------", true);
                                pintar("ELIGE CON QUIEN QUIERES VOLVER", true);
                                pintar(
                                        "1.- Lobo\n"+
                                                "2.- Oveja\n"+
                                                "3.- Col\n"+
                                                "0.- Salir\n"
                                        , true);
                                pintar("-------------------------------", true);
                                x=ES.leeN("Introduce una opcion: ");
                                pintar("-------------------------------", true);
                                switch (x) {
                                    case 1:
                                        if (lobo) {
                                            lobo=false;
                                            pintar("El lobo ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("El lobo no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 2:
                                        if (oveja) {
                                            oveja=false;
                                            pintar("La oveja ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("La oveja no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 3:
                                        if (col) {
                                            col=false;
                                            pintar("La col ha vuelto al otro lado", true);
                                            x=0;
                                        }
                                        else {
                                            pintar("La col no esta en ese lado..." , false);
                                        }
                                        continuar();
                                        continue;
                                    case 0:
                                        pintar("Volviendo al menu anterior..." , false);
                                        x=0;
                                        continuar();
                                        continue;
                                    default:
                                        pintar("La intruccion elegida no existe en el programa!", false);
                                        continuar();
                                }
                            } while (x!=0);
                        }
                        continuar();
                        continue;
                    case 0:
                        pintar("Fin del programa..." , false);
                        n=0;
                        continuar();
                        continue;
                    default:
                        pintar("La intruccion elegida no existe en el programa!", false);
                        continuar();
                }
            }
            else {
                n=0;
            }
        } while(n!=0);
        if (j==5) {
            if (lobo && oveja && col) {
                ganar();
            }
            else {
                perder();
            }
        }
        else {
            perder();
        }
    }
    static void pintar(String x, boolean n) {
        if (n) {
            System.out.println(x);
        }
        else {
            System.err.println(x);
        }
    }
    static void continuar() {
        ES.leeDeTeclado("Pulsa \"ENTER\" para continuar...");
    }
    static void perder() {
        pintar("Has perdido!", false);
        continuar();
    }
    static void ganar() {
        pintar("Has ganado!", false);
        continuar();
    }
}
