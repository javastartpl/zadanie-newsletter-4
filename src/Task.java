class Task {
    private String task;
    PRIORITY priority;

    Task(String task, PRIORITY priority) {
        this.task = task;
        this.priority = priority;
    }

    String getTask() {
        return task;
    }
}