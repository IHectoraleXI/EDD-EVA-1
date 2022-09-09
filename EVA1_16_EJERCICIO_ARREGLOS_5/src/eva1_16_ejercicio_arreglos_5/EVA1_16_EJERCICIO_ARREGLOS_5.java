package eva1_16_ejercicio_arreglos_5;

public class EVA1_16_EJERCICIO_ARREGLOS_5 {

    public static void main(String[] args) {
        int[] arregloNum = new int[50];
        int par = 0;
        for (int i = 0; i < arregloNum.length; i++) {
            arregloNum[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arregloNum.length; i++) {
            if ((arregloNum[i] % 2) == 0) {
                par++;
            }
        }
        int[] arregloPares = new int[par];
        int posPar = 0;
        for (int i = 0; i < arregloNum.length; i++) {
            if ((arregloNum[i] % 2) == 0) {
                arregloPares[posPar] = arregloNum[i];
                posPar++;
            }
        }
        System.out.println("Arreglo Normal " + "(" + arregloNum.length + ")");
        imprimir(arregloNum);
        System.out.println("Arreglo Pares " + "(" + arregloPares.length + ")");
        imprimir(arregloPares);
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
    }

}
