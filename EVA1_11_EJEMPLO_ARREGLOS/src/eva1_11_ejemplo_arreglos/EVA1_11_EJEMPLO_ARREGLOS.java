package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

public class EVA1_11_EJEMPLO_ARREGLOS {

    public static void main(String[] args) {
        int grupo, alumno, calif, arregloCali[][];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el número de grupos.");
        grupo = entrada.nextInt();
        System.out.println("Introduzca la cantidad de alumnos de cada grupo.");
        arregloCali = new int[grupo][];
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.print("Grupo " + (i + 1) + ": ");
            alumno = entrada.nextInt();
            arregloCali[i] = new int[alumno];
        }
        System.out.println("Introduzca las calificaciones.");
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("Grupo " + (i + 1));
            for (int j = 0; j < arregloCali[i].length; j++) {
                calif = entrada.nextInt();
                arregloCali[i][j] = calif;
            }
        }
        for (int i = 0; i < arregloCali.length; i++) {
            System.out.println("Calificaciones de Grupo " + (i + 1));
            for (int j = 0; j < arregloCali[i].length; j++) {
                System.out.println("Alumno " + (j + 1) + ": " + arregloCali[i][j]);
            }
        }
    }

}
