public class RemovePriorityCommand implements TaskCommand {
    private TaskComponent task;
    private TaskComponent originalTask;

    public RemovePriorityCommand(TaskComponent task) {
        this.task = task;
        this.originalTask = task;
    }

    @Override
    public void execute() {
        if (task instanceof Priority) {
            task = ((Priority) task).task;
        }
    }

    @Override
    public void undo() {
        task = originalTask;
    }
}
