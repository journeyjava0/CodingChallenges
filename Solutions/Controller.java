public class Controller {
    public void greeting(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Controller abc = new Controller();
        abc.greeting(); // just practicing calling a non static method from a static method :)

    }
}
