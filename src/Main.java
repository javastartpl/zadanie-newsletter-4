import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Task> tasksList = createTasks();

        Consumer<Task> tasksListWithPriorityInformation = (task) -> System.out.println("Zadanie " + task.getTask() +
                " ma priorytet " + printTask(task));

        tasksList.iterator().forEachRemaining(tasksListWithPriorityInformation);
    }

    private static List<Task> createTasks() {
        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task("Zmywanie naczyn", Priority.LOW));
        tasksList.add(new Task("Nauka programowania", Priority.URGENT));
        tasksList.add(new Task("Zakupy", Priority.MEDIUM));
        tasksList.add(new Task("Oplaty rachunkow", Priority.HIGH));
        return tasksList;
    }

    private static String printTask(Task task) {
        String priorityValue = null;
        switch (task.getPriority()) {
            case LOW -> priorityValue = "Niski";
            case MEDIUM -> priorityValue = "Sredni";
            case HIGH, URGENT -> priorityValue = "Pilne!";
        }
        return priorityValue;
    }
}
