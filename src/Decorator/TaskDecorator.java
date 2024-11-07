package Decorator;
import Facade.TaskComponent;

public abstract class TaskDecorator implements TaskComponent {
    protected TaskComponent task;

    public TaskDecorator(TaskComponent task) {
        this.task = task;
    }

    public String getType() {
        return task.getType();
    }
    @Override
    public String getTitle() {
        return task.getTitle();
    }

    @Override
    public String getDescription() {
        return task.getDescription();
    }

    @Override
    public boolean isCompleted() {
        return task.isCompleted();
    }

    @Override
    public void setTitle(String title) {
        task.setTitle(title);
    }

    @Override
    public void setDescription(String description) {
        task.setDescription(description);
    }

    @Override
    public void setCompleted(boolean completed) {
        task.setCompleted(completed);
    }
}