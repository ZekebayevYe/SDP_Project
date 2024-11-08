package Decorator;

public class Priority extends TaskDecorator {
    private String priority;

    public Priority(TaskComponent task, String priority) {
        super(task);
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Decorator.Priority: " + priority + ")";
    }
}