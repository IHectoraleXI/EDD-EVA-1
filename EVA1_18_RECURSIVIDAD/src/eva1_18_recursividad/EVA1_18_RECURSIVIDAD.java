package eva1_18_recursividad;

public class EVA1_18_RECURSIVIDAD {

    public static void main(String[] args) {
        falsoForDes(5);
        System.out.println("");
        falsoForAsc(5, 1);
    }

    public static void falsoForDes(int valor) {
        if (valor > 0) {
            System.out.print(valor + " - ");
            valor--;
            falsoForDes(valor);
        }
    }
    public static void falsoForAsc(int valor, int ini) {
        if (ini <= valor) {
            System.out.print(ini + " - ");
            falsoForAsc(valor, ini + 1);
        }
    }

}
