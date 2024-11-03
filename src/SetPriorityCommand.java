public class SetPriorityCommand implements TaskCommand {
    private TaskComponent task;
    private String priority;
    private TaskComponent decoratedTask;

    public SetPriorityCommand(TaskComponent task, String priority) {
        this.task = task;
        this.priority = priority;
    }

    @Override
    public void execute() {
        decoratedTask = new Priority(task, priority);
    }

    @Override
    public void undo() {
        task = decoratedTask;
    }
}
