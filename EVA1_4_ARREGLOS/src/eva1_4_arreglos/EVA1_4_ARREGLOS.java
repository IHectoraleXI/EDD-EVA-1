package eva1_4_arreglos;

public class EVA1_4_ARREGLOS {

    public static void main(String[] args) {
        /*TIPO DE DATO[] IDENTIFICADOR = new TIPO DE DATO(TAMAÑO)
        FUNCIONES E IDENTIFICADORES EMPIEZAN EN MINUSCULA
        FUNCIONES INDICAN UNA ACCION -> VERBO
        CLASES EMPIEZAN CON MAYUSCULA*/
        int[] arregloEdades, arregloSalario, arregloCali;
        //Todos declarados como arreglos.
        double arregloPromedio[], porcentaje;
        //Solo arregloPromedio es un arreglo.
        arregloEdades = new int[50];
        System.out.println(arregloEdades);
        for (int i = 0; i < arregloEdades.length; i++) {
            arregloEdades[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < arregloEdades.length; i++) {
            System.out.println("[" + i + "]" + arregloEdades[i]);
        }
    }

}
