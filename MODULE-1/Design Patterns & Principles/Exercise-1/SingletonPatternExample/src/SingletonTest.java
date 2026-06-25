public class SingletonTest {

    public static void main(String[] args) {

        Logger firstLogger = Logger.getLogger();
        Logger secondLogger = Logger.getLogger();

        firstLogger.showMessage("Application Started");
        secondLogger.showMessage("Reading User Data");

        if (firstLogger == secondLogger) {
            System.out.println("Singleton Pattern Implemented Successfully");
        } else {
            System.out.println("Multiple Objects Created");
        }

        System.out.println("HashCode 1 : " + firstLogger.hashCode());
        System.out.println("HashCode 2 : " + secondLogger.hashCode());
    }
}