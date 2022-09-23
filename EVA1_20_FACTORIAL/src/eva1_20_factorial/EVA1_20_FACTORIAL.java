package eva1_20_factorial;

public class EVA1_20_FACTORIAL {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int fact) {
        if (fact == 0) {
            return 1;
        } else {
            return fact * factorial(fact - 1);
        }
    }
}
