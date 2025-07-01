// Task.java
public class Task {
    private static int counter = 0;
    private final int id;
    private String title;
    private String description;
    private boolean isDone;

    public Task(String title, String description) {
        this.id = ++counter;
        this.title = title;
        this.description = description;
        this.isDone = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isDone() { return isDone; }

    public void markDone() { this.isDone = true; }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " - " + (isDone ? "Done" : "Pending");
    }
}
