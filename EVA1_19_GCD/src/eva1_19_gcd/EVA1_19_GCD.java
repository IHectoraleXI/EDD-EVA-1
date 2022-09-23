package eva1_19_gcd;

public class EVA1_19_GCD {

    public static void main(String[] args) {
        System.out.println(GCD(108, 48));
    }

    public static int GCD(int dvd, int dvs) {
        int residuo;
        residuo = dvd % dvs;
        if (residuo == 0) {
            return dvs;
        } else {
            return GCD(dvs, residuo);
        }
    }
}
