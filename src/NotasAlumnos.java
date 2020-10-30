public class NotasAlumnos {
    public static void main (String[] args) {
        int x=0, i, n;
        i=ES.leeN("Introduce los alumnos que vas a registrar: ");
        n=ES.leeN("Introduce la nota maxima que puede tener un alumno: ");
        String[] nombre=new String[i];
        int[] nota=new int[i];
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
                    if (!nombre[x].equals("")){nota[x]=ES.leeN("Introduce la nota del alumno "+(x+1)+": ");}
                } while (nota[x]>n);
            }
            else {
                k=x;
                x=i-1;
            }
            x++;
        } while (x!=i);
        System.out.println("NOMBRE -- NOTA");
        System.out.println("--------------");
        for (int j=0;j!=k;j++) {
            if (!nombre[j].equals("")) {
                System.out.print(nombre[j]+" -- "+nota[j]);
                System.out.println();
            }
        }
    }
}
