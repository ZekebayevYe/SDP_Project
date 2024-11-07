package Decorator;
import Facade.TaskComponent;


public class Reminder extends TaskDecorator {
    private String reminderTime;

    public Reminder(TaskComponent task, String reminderTime) {
        super(task);
        this.reminderTime = reminderTime;
    }

    public String getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(String reminderTime) {
        this.reminderTime = reminderTime;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " (Decorator.Reminder: " + reminderTime + ")";
    }
}