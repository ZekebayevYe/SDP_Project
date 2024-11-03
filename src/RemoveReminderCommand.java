public class RemoveReminderCommand implements TaskCommand {
    private TaskComponent task;
    private TaskComponent originalTask;

    public RemoveReminderCommand(TaskComponent task) {
        this.task = task;
        this.originalTask = task;
    }

    @Override
    public void execute() {
        if (task instanceof Reminder) {
            task = ((Reminder) task).task;
        }
    }

    @Override
    public void undo() {
        task = originalTask;
    }
}
