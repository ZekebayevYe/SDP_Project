package MVVM;
import Command.EditTaskCommand;
import Command.Command;
import Facade.TaskComponent;
import Facade.TaskFacade;
import Observer.Observer;
import java.util.Scanner;

public class TaskView implements Observer {
    private TaskFacade taskFacade;
    private TaskViewModel taskViewModel;
    private boolean isSubscribed = false; // Флаг подписки

    public TaskView(TaskFacade taskFacade) {
        this.taskFacade = taskFacade;
        this.taskViewModel = TaskViewModel.getInstance();
    }

    public void menu() {
        System.out.println("1. New Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Set Priority for a Task");
        System.out.println("4. Set Reminder for a Task");
        System.out.println("5. Edit Task Title and Description");
        System.out.println("6. Toggle Notifications Subscription");
        System.out.println("7. Exit");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.println("Choose your option:");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter type of a task (e.g., work, chore):");
                    String type = sc.nextLine();
                    System.out.println("Enter title for a task:");
                    String title = sc.nextLine();
                    System.out.println("Enter description:");
                    String description = sc.nextLine();
                    System.out.println("Enter status: true if completed, false if not:");
                    boolean isCompleted = sc.nextBoolean();
                    taskFacade.createAndAddTask(type, title, description, isCompleted);
                    break;
                case 2:
                    taskFacade.showAllTasks();
                    break;
                case 3:
                    System.out.println("Enter task index to set priority:");
                    int priorityIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter priority level (e.g., High, Medium, Low):");
                    String priority = sc.nextLine();
                    taskFacade.setPriority(priorityIndex, priority);
                    break;
                case 4:
                    System.out.println("Enter task index to set reminder:");
                    int reminderIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter reminder time:");
                    String reminderTime = sc.nextLine();
                    taskFacade.setReminder(reminderIndex, reminderTime);
                    break;
                case 5: // Edit Task Title and Description
                    System.out.println("Enter task index to edit:");
                    int editIndex = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new title for the task:");
                    String newTitle = sc.nextLine();
                    System.out.println("Enter new description:");
                    String newDescription = sc.nextLine();

                    TaskComponent task = taskViewModel.getTask(editIndex);
                    if (task instanceof TaskModel) {
                        Command editCommand = new EditTaskCommand((TaskModel) task, newTitle, newDescription);
                        editCommand.execute();
                        System.out.println("Task title and description edited successfully.");
                    } else {
                        System.out.println("Invalid task index.");
                    }
                    break;
                case 6: // Подписка/отписка на уведомления
                    if (isSubscribed) {
                        taskViewModel.removeObserver(this);
                        isSubscribed = false;
                        System.out.println("You have unsubscribed from notifications.");
                    } else {
                        taskViewModel.addObserver(this);
                        isSubscribed = true;
                        System.out.println("You have subscribed to notifications.");
                    }
                    break;
                case 7:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    @Override
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}
