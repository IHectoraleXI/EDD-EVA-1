package eva1_5_for_each;

public class EVA1_5_FOR_EACH {

    public static void main(String[] args) {
        int[] arregloDatos = new int[50];
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int) (Math.random() * 100);
        }
        //for each
        for (int arregloDato : arregloDatos) {
            System.out.print("[" + arregloDato + "]");
        }
    }

}
