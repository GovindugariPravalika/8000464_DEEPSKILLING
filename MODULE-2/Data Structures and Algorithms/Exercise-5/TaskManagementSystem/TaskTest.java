public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList taskList =
                new TaskLinkedList();

        taskList.addTask(
                101,
                "Design Database",
                "Pending");

        taskList.addTask(
                102,
                "Develop API",
                "In Progress");

        taskList.addTask(
                103,
                "Testing",
                "Pending");

        taskList.displayTasks();

        System.out.println("\nSearching Task:");

        Task task =
                taskList.searchTask(102);

        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task Not Found");
        }

        System.out.println();

        taskList.deleteTask(102);

        taskList.displayTasks();
    }
}