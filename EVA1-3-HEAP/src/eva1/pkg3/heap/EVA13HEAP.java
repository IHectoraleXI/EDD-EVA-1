package eva1.pkg3.heap;

public class EVA13HEAP {

    public static void main(String[] args) {
        //obj y obj2 guardan referencias, referencias = dirección de memoria (del IDE)
        //en otros lenguajes se llaman apuntadores, apuntadores = dirección de memoria (FÍSICA)
        int x = 10;
        Prueba obj = new Prueba();
        Prueba obj2 = new Prueba();
        System.out.println(x);
        System.out.println(obj.valor);
        System.out.println(obj2);
    }
    
}

class Prueba {
    public int valor = 100;
}
