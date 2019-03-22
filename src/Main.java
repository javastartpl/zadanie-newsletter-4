import java.util.ArrayList;
import java.util.List;

public class Main {
    static String priorityValue;

    public static void main(String[] args) {

        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task("Zmywanie naczyn", PRIORITY.LOW));
        tasksList.add(new Task("Nauka programowania", PRIORITY.URGENT));
        tasksList.add(new Task("Zakupy", PRIORITY.MEDIUM));
        tasksList.add(new Task("Oplaty rachunkow", PRIORITY.HIGH));

        for (Task task : tasksList) {
            printTask(task);
            System.out.println(task);
        }
    }

    private static void printTask(Task task) {
        switch (task.priority) {
            case LOW -> priorityValue = "Niski";
            case MEDIUM -> priorityValue = "Sredni";
            case HIGH -> priorityValue = "Wysoki!";
            case URGENT -> priorityValue = "Pilne!";
        }
    }
}
