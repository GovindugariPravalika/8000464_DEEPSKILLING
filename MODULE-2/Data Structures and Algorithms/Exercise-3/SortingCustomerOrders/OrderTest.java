public class OrderTest {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101,
                        "Rahul",
                        12000),

                new Order(102,
                        "Priya",
                        5000),

                new Order(103,
                        "Kiran",
                        18000),

                new Order(104,
                        "Anjali",
                        9000)
        };

        System.out.println("Orders Before Sorting:");

        OrderSorter.displayOrders(orders);

        System.out.println("\nAfter Bubble Sort:");

        OrderSorter.bubbleSort(orders);

        OrderSorter.displayOrders(orders);

        Order[] quickOrders = {

                new Order(101,
                        "Rahul",
                        12000),

                new Order(102,
                        "Priya",
                        5000),

                new Order(103,
                        "Kiran",
                        18000),

                new Order(104,
                        "Anjali",
                        9000)
        };

        System.out.println("\nAfter Quick Sort:");

        OrderSorter.quickSort(
                quickOrders,
                0,
                quickOrders.length - 1
        );

        OrderSorter.displayOrders(quickOrders);
    }
}