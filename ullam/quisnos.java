public class TaskManager {

    // An array to store tasks
    private String[] tasks;

    // Constructor to initialize the task array
    public TaskManager(String[] tasks) {
        this.tasks = tasks;
    }

    // Method to display all tasks
    public void DisplayTasks() {
        System.out.println("Tasks:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }

    // Main method to run the example
    public static void main(String[] args) {
        // Create a list of tasks
        String[] myTasks = {"Complete Java assignment", "Attend team meeting", "Review pull request"};

        // Create an instance of TaskManager
        TaskManager manager = new TaskManager(myTasks);

        // Display the tasks
        manager.DisplayTasks();
    }
}
