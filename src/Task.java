class Task {
    private String task;
    private Priority priority;

    Task(String task, Priority priority) {
        this.task = task;
        this.priority = priority;
    }

    String getTask() {
        return task;
    }

    public Priority getPriority() {
        return priority;
    }
}