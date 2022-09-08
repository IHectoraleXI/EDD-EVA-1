package eva1_9_arreglos_multidim;

public class EVA1_9_ARREGLOS_MULTIDIM {

    public static void main(String[] args) {
        int[][] matrizDatos = new int[3][5];
        System.out.println("Filas:" + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) { //Primera dimensión (3 filas)
            System.out.println("Columnas:" + matrizDatos[i].length);
            for (int j = 0; j < matrizDatos[i].length; j++) { //Segunda dimensión (5 columnas)
                matrizDatos[i][j] = 100;
            }
        }
        System.out.println("");
        for (int i = 0; i < matrizDatos.length; i++) { //Primera dimensión (3 filas)
            for (int j = 0; j < matrizDatos[i].length; j++) { //Segunda dimensión (5 columnas)
                System.out.print("[" + matrizDatos[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
