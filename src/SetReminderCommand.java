public class SetReminderCommand implements TaskCommand {
    private TaskComponent task;
    private String reminderTime;
    private TaskComponent decoratedTask;

    public SetReminderCommand(TaskComponent task, String reminderTime) {
        this.task = task;
        this.reminderTime = reminderTime;
    }

    @Override
    public void execute() {
        decoratedTask = new Reminder(task, reminderTime);
    }

    @Override
    public void undo() {
        task = decoratedTask;
    }
}

