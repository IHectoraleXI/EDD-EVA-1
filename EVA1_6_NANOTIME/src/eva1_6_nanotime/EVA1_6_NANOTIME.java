package eva1_6_nanotime;

public class EVA1_6_NANOTIME {

    public static void main(String[] args) {
        long ini = System.nanoTime();
        System.out.println(ini);
        long fin = System.nanoTime();
        System.out.println(fin);
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }

}
