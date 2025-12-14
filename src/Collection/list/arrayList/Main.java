package Collection.list.arrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n====== TASK MANAGER ======");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Update task");
            System.out.println("4. Mark task completed");
            System.out.println("5. Show all tasks");
            System.out.println("6. Search tasks");
            System.out.println("7. Clear all tasks");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1 ) {
                System.out.println("Enter title");
                var title = sc.nextLine();
                System.out.println("Enter description");
                var description = sc.nextLine();
                taskManager.addTask(title,description);
            }
            else if (choice == 2 ) {
                System.out.println("Enter removeId");
                var removeId = sc.nextInt();
                sc.nextLine();
                taskManager.removeTask(removeId);
            }
            else if (choice == 3 ) {
                System.out.println("Enter updateId");
                var updateId = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter newTitle");
                var newTitle = sc.nextLine();
                System.out.println("Enter newDescription");
                var newDescription = sc.nextLine();
                taskManager.updateTask(updateId,newTitle,newDescription);
            }
            else if (choice == 4 ) {
                System.out.println("Enter Id");
                var id = sc.nextInt();
                sc.nextLine();
                taskManager.markCompleted(id);
            }
            else if (choice == 5 ) {
                if(taskManager.isEmpty()) System.out.println("No tasks available.");
                else taskManager.getAllTasks();
            }
            else if (choice == 6 ) {
                System.out.println("Enter keywords");
                var keywords = sc.nextLine();
                taskManager.searchTask(keywords);

            }
            else if (choice == 7 ) {
                taskManager.clearAll();

            }
            else if (choice == 8) {
                return;
            }
        }
    }
}
