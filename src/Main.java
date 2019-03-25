import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    private static String priorityValue;

    public static void main(String[] args) {

        List<Task> tasksList = createTasks();

        Consumer<Task> tasksListWithPriorityInformation = (task) -> System.out.println("Zadanie " + task.getTask() +
                " ma priorytet " + printTask(task));

        tasksList.iterator().forEachRemaining(tasksListWithPriorityInformation);
    }

    private static List<Task> createTasks() {
        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task("Zmywanie naczyn", PRIORITY.LOW));
        tasksList.add(new Task("Nauka programowania", PRIORITY.URGENT));
        tasksList.add(new Task("Zakupy", PRIORITY.MEDIUM));
        tasksList.add(new Task("Oplaty rachunkow", PRIORITY.HIGH));
        return tasksList;
    }

    private static String printTask(Task task) {
        switch (task.priority) {
            case LOW -> priorityValue = "Niski";
            case MEDIUM -> priorityValue = "Sredni";
            case HIGH -> priorityValue = "Wysoki!";
            case URGENT -> priorityValue = "Pilne!";
        }
        return priorityValue;
    }
}
