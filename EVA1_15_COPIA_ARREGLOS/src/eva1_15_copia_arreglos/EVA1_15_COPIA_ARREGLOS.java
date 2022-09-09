package eva1_15_copia_arreglos;

public class EVA1_15_COPIA_ARREGLOS {

    public static void main(String[] args) {
        int[] arregloDatos = new int[100];
        int j = arregloDatos.length - 1;
        llenar(arregloDatos);
        imprimir(arregloDatos);
        int arregloCopia[] = new int[arregloDatos.length];
        System.out.println("");
        System.out.println(arregloDatos);
        System.out.println(arregloCopia);
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia[i] = arregloDatos[j];
            //arregloCopia[i] = arregloDatos[(arregloDatos.length - 1) - i];
            j--;
        }
        imprimir(arregloCopia);
    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }

}
