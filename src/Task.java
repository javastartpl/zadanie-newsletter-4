public class Task {
    String task;
    PRIORITY priority;

    Task(String task, PRIORITY priority) {
        this.task = task;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Zadanie " + task +
                " ma priorytet " + Main.priorityValue;
    }
}
