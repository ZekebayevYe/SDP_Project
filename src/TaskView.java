import java.util.Scanner;

public class TaskView {
    TaskViewModel viewModel;
    public TaskView(TaskViewModel viewModel){
        this.viewModel = viewModel;
    }

    public void showTask(){
        System.out.println("task: "+ viewModel.getTitle());
        System.out.println("description: "+ viewModel.getDescription());
        System.out.println("status: "+(viewModel.isCompleted() ? "completed" : "not completed"));
    }

    public void menu() {
        System.out.println("1.new task");
        System.out.println("2.show tasks");
        System.out.println("3.exit");
    }
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            System.out.println("choose your option");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter title for a task");
                    String title = sc.nextLine();
                    System.out.println("Enter description");
                    String description = sc.nextLine();
                    System.out.println("Enter status: true is completed and false is not");
                    boolean isCompleted = sc.nextBoolean();
                    viewModel.createTask(title, description, isCompleted);
                    break;
                case 2:
                    viewModel.getTasks();
                    break;
                case 3:
                    sc.close();
                    return;
                default:
                    System.out.println("invalid option");
                    break;
            }

        }
    }

}
