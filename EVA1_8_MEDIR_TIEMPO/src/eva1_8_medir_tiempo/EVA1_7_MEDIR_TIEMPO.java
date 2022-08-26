package eva1_8_medir_tiempo;

public class EVA1_7_MEDIR_TIEMPO {

    public static void main(String[] args) {
        long ini = System.nanoTime();
        int[] datos = new int[100000000];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = 100;
        }
        long fin = System.nanoTime();
        double tiempo = fin - ini;
        System.out.println(tiempo / 1000000000);
    }

}
