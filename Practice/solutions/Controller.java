import java.util.ArrayList;

//delete - this was just a test
public class Controller {
    public static void Greeting() {
        System.out.println("Hello");
    }
    public static void counting(int max){
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < max; i++)
        primes.add(i);
        System.out.print(primes);
    }
    public static void main(String[] args) {
        Greeting();
        counting(10);
    }
}
