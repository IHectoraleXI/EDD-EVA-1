package eva1_17_ejercicio_arreglos_3;

public class EVA1_17_EJERCICIO_ARREGLOS_3 {

    public static void main(String[] args) {
        int[][] matrizDatos, matrizCopia;
        matrizDatos = new int[5][5];
        matrizCopia = new int[5][5];
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizDatos[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos[i].length; j++) {
                matrizCopia[i][j] = matrizDatos[(matrizDatos.length - 1) - i][(matrizDatos[i].length - 1) - j];
            }
        }
        System.out.println("Matriz");
        imprimir(matrizDatos);
        System.out.println("Matriz Volteada");
        imprimir(matrizCopia);
    }

    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
