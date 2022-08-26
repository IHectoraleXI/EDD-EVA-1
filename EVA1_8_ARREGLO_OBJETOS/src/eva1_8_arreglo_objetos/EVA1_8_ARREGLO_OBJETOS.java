package eva1_8_arreglo_objetos;

public class EVA1_8_ARREGLO_OBJETOS {

    public static void main(String[] args) {
        Prueba arregloPrueba[] = new Prueba[20];
        for (int i = 0; i < arregloPrueba.length; i++) {
            arregloPrueba[i] = new Prueba(); //Se crean 20 objetos en el arreglo.
        }
        for (Prueba prueba : arregloPrueba) {
            System.out.println(prueba.x);
        }
    }

}

class Prueba {

    int x = 100;
}
