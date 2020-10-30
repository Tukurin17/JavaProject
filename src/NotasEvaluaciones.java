public class NotasEvaluaciones {
    public static void main (String[] args) {
        int x=0, i, n;
        i=ES.leeN("Introduce los alumnos que vas a registrar: ");
        n=ES.leeN("Introduce la nota maxima que puede tener un alumno: ");
        String[] nombre=new String[i];
        int[][] nota=new int[i][3];
        int k=i;
        System.out.println("Puedes terminar antes el programa si en el nombre del alumno escribes salir");
        ES.leeDeTeclado("Pulsa \"ENTER\" para continuar...");
        do {
            do {
                System.out.println("El nombre del alumno no puede estar vacio.");
                nombre[x]=ES.leeDeTeclado("Introduce el nombre del alumno "+(x+1)+": ");
            } while (nombre[x].equals(""));
            if (!nombre[x].equals("salir")) {
                do {
                    System.out.println("La nota maxima solo puede ser de "+n);
                    if (!nombre[x].equals("")){
                        nota[x][0]=ES.leeN("Introduce la nota del alumno "+(x+1)+" en la primera EVA: ");
                        nota[x][1]=ES.leeN("Introduce la nota del alumno "+(x+1)+" en la segunda EVA: ");
                        nota[x][2]=ES.leeN("Introduce la nota del alumno "+(x+1)+" en la tercera EVA: ");
                    }
                } while (nota[x][0]>n && nota[x][1]>n && nota[x][2]>n);
            }
            else {
                k=x;
                x=i-1;
            }
            x++;
        } while (x!=i);
        System.out.println("NOMBRE -- EVA1 -- EVA2 -- EVA3");
        System.out.println("--------------");
        for (int j=0;j!=k;j++) {
            if (!nombre[j].equals("")) {
                System.out.print(nombre[j]+" -- ");
                for (int e=0;e!=3;e++) {
                    System.out.print(nota[j][e]);
                    if (e<2){System.out.print(" -- ");}
                }
                System.out.println();
            }
        }
    }
}
