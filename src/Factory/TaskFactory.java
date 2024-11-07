package Factory;

import MVVM.TaskModel;

public class TaskFactory {
    public static TaskModel createTask(String type, String title, String description, boolean isCompleted) {
        TaskModel task;
        switch (type.toLowerCase()) {
            case "work":
                task = new WorkTask(type, title, description, isCompleted);
                break;
            case "chore":
                task = new ChoreTask(type, title, description, isCompleted);
                break;
            default:
                task = new otherTask("other", title, description, isCompleted);
        }
        return task;
    }
}

class WorkTask extends TaskModel {
    public WorkTask(String type, String title, String description, boolean isCompleted) {
        super(type, title, description, isCompleted);
    }
}

class ChoreTask extends TaskModel {
    public ChoreTask(String type, String title, String description, boolean isCompleted) {
        super(type, title, description, isCompleted);
    }
}
class otherTask extends TaskModel {
    public otherTask(String type, String title, String description, boolean isCompleted) {
        super(type, title, description, isCompleted);
    }
}