public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,
                        "Laptop",
                        "Electronics"),

                new Product(102,
                        "Mobile",
                        "Electronics"),

                new Product(103,
                        "Mouse",
                        "Accessories"),

                new Product(104,
                        "Tablet",
                        "Electronics")
        };

        System.out.println("Linear Search Result:");

        Product linearResult =
                SearchOperations.linearSearch(
                        products,
                        "Mouse"
                );

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        System.out.println();

        Product[] sortedProducts = {

                new Product(101,
                        "Laptop",
                        "Electronics"),

                new Product(102,
                        "Mobile",
                        "Electronics"),

                new Product(103,
                        "Mouse",
                        "Accessories"),

                new Product(104,
                        "Tablet",
                        "Electronics")
        };

        System.out.println("Binary Search Result:");

        Product binaryResult =
                SearchOperations.binarySearch(
                        sortedProducts,
                        "Mouse"
                );

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }
    }
}