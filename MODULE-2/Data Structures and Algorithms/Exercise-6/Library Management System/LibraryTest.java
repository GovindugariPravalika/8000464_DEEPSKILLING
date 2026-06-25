public class LibraryTest {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101,
                        "Java",
                        "James Gosling"),

                new Book(102,
                        "Python",
                        "Guido van Rossum"),

                new Book(103,
                        "C++",
                        "Bjarne Stroustrup"),

                new Book(104,
                        "Data Structures",
                        "Mark Allen")
        };

        System.out.println("Linear Search Result:");

        Book linearResult =
                LibrarySearch.linearSearch(
                        books,
                        "Python");

        if (linearResult != null) {
            System.out.println(linearResult);
        } else {
            System.out.println("Book Not Found");
        }

        // Sorted array for Binary Search
        Book[] sortedBooks = {

                new Book(103,
                        "C++",
                        "Bjarne Stroustrup"),

                new Book(104,
                        "Data Structures",
                        "Mark Allen"),

                new Book(101,
                        "Java",
                        "James Gosling"),

                new Book(102,
                        "Python",
                        "Guido van Rossum")
        };

        System.out.println("\nBinary Search Result:");

        Book binaryResult =
                LibrarySearch.binarySearch(
                        sortedBooks,
                        "Python");

        if (binaryResult != null) {
            System.out.println(binaryResult);
        } else {
            System.out.println("Book Not Found");
        }
    }
}