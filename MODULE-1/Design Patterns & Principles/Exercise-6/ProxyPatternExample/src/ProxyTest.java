public class ProxyTest {

    public static void main(String[] args) {

        Image image = new ProxyImage("nature.jpg");

        System.out.println("Image object created.");

        System.out.println("\nFirst Display Call:");
        image.display();

        System.out.println("\nSecond Display Call:");
        image.display();
    }
}