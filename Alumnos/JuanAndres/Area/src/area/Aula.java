/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;

/**
 *
 * @author Juan Andres
 */
import ES.ES;

public class Aula {

    static String[] alumnos;
    static int[][][] notas;
    static String[] modulos = {"Prog", "BD", "LM", "Fol", "SI"};

    public static void main(String[] args) {
        int nAl = ES.leeN("Numero de Alumnos: ");
        AnnaderAlumnos(nAl);
        //int nProf=ES.leeN("Numero de profesores: ");
        //annadeAlumProfNota(nAl, nProf);
        boletin(nAl);
        imprimirBoletin();

    }

    static void annadeAlumProfNota(int nAl, int nProf) {
        String[] alumno = new String[nAl];
        String[] profesore = new String[nProf];
        int[] nota = new int[nAl];

        for (int i = 0; i < nAl; i++) {
            alumno[i] = ES.leeDeTeclado("Nombre y Apellido del alumno: ");
            System.out.println(alumno[i]);
        }
        for (int i = 0; i < nProf; i++) {
            profesore[i] = ES.leeDeTeclado("Nombre y Apellido del profesor: ");
            System.out.println(profesore[i]);
        }
        for (int i = 0; i < nAl; i++) {
            nota[i] = ES.leeN("Introduce notas del alumnos: ");
        }
        for (int i = 0; i < nAl; i++) {
            System.out.println("Notas de los alumnos: " + nota[i]);
        }
    }

    static void NotasDimesional() {
        int matricula;
        String nombre;
        int num;
        int[][] notas;
        String[] alumnos;

        matricula = ES.leeN("Cuantos alumnos: ");

        notas = new int[matricula][3];

        alumnos = new String[matricula];

        for (int i = 0; i < matricula; i++) {
            alumnos[i] = ES.leeDeTeclado("Nombre y Apellido del alumno: ");
            for (int j = 0; j < 3; j++) {
                notas[i][j] = ES.leeN("Introduce notas del alumnos: " + alumnos[i] + " en la eva " + (j + 1));
            }
        }
    }

    /*static void NotasTridimensional(){
        int matricula;
        String nombre;
        int num;
        int[][][] notas;
        String[] alumnos;
        
        matricula = ES.leeN("Cuantos alumnos: ");
        
        
        notas = new int[matricula][3][];

        alumnos = new String[matricula];
        
        String [] modulos;

        for (int i = 0; i < matricula; i++) {
            alumnos[i]=ES.leeDeTeclado("Nombre y Apellido del alumno: ");
            int modulo = ES.leeN("Numero de modulos; ");
            for (int k = 0; k < modulo; k++) {
                modulos = new String[modulo];
                modulos[k]=ES.leeDeTeclado("Nombre de la asignatura: ");
          
                for (int j = 0; j < 3; j++) {
                    notas[i][j][k] = ES.leeN("Introduce notas del alumnos: " + alumnos[i] + "  con el modulo: " + modulos[k] + " en la eva " + (j + 1));
                }
            }
        }
    }*/
    //Añade los alumnos al array de alumnos y los devuelve en un String[].
    static String[] AnnaderAlumnos(int nAl) {
        alumnos = new String[nAl];
        for (int i = 0; i < nAl; i++) {
            alumnos[i] = ES.leeDeTeclado("Introduce nombre y apellido: ");
        }
        return alumnos;
    }

    /* static void NotasTridimensional2(int nAl){
        int [][][] notas;
        String[]NombreModulo;
        notas= new int[nAl][3][];
        int modulos=0;
        for (int i = 0; i < notas.length; i++) {
            modulos=ES.leeN("Introduce el numero de modulo del"+alumnos[i]);
        notas= new int[nAl][3][modulos];
        NombreModulo=new String[modulos];
            NombreModulo[i]=ES.leeDeTeclado("Nombre de la asignatura: ");
            for (int j = 0; j < notas[i+1].length; j++) {
               
                
                for (int k = 0; k < modulos; k++) {
                    
                    
                
                    notas[i][j][k]=ES.leeN("Introduce notas del alumno: "+alumnos[i]+" en la eva "+(j+1)+" de la asignatura :"+NombreModulo[j]);
                    //System.out.println(notas[i][j][k]);
                }
            }
        }
    }*/
    static void boletin(int nAl) {
        notas = new int[nAl][modulos.length][3];

        for (int i = 0; i < nAl; i++) {
            System.out.println("Nota del alumno "+alumnos[i]+":");
            for (int j = 0; j < modulos.length; j++) {
                System.out.println("Nota del modulo "+modulos[j]+":");
                for (int k = 0; k < 2; k++) {
                    String asignatura = ES.leeDeTeclado("Nombre de la Asignatura");
                    notas[i][j][k] = ES.leeN("Introduce la nota en la EVA "+(k+1)+": ");
                    
                }
            }
        }
    }
    static void imprimirBoletin(){
        System.out.println("Boletin del alumno");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno "+(i+1)+" - "+alumnos[i]);
            
        }
        int n=ES.leeN("Introduce el numero del alumno: ");
        System.out.println("------------------Boletin de "+ alumnos[n-1]+"--\n"
                + "|                                                |\n"
                + "| Modulo                EVA1     EVA2       EVA3 |\n"
                + "|                                                |") ;
        for (int i = 0; i < modulos.length; i++) {
            System.out.println("| "+modulos[i]);
            for (int j = 0; j < 3; j++) {
                System.out.print("\t\t\t"+notas[n][i][j]+" |");
                System.out.println("|                                                |") ;
                
            }
            System.out.println("|                                                |") ;
            
        }
        System.out.println("------------------Boletin de "+ alumnos[n-1]+"--");
        
    }
       
}
