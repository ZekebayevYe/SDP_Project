import java.util.Scanner;

public class TaskView {
    private TaskFacade taskFacade;

    public TaskView(TaskFacade taskFacade) {
        this.taskFacade = taskFacade;
    }

    public void menu() {
        System.out.println("1. New Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Set Priority for a Task");
        System.out.println("4. Set Reminder for a Task");
        System.out.println("5. Exit");
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
                    System.out.println("Enter reminder time: ");
                    String reminderTime = sc.nextLine();
                    taskFacade.setReminder(reminderIndex, reminderTime);
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
