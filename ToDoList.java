import java.util.Scanner;

public class ToDoList extends ToDoListDb{
    String task;
    public static void main(String[] args) throws Exception {
        int choice,delChoice;
        int i=0;
        Scanner scan=new Scanner(System.in);
        ToDoList A=new ToDoList();
        System.out.println("MENU\n1. for entering new task\n2. for removing a task\n3. for updating a task\n4. exit");
        System.out.print("Enter your choice :");
        choice=scan.nextInt();
        scan.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter new task to be added :");
                A.task=scan.nextLine();
                A.insert(A.task);
                break;
            case 2:
                A.display();
                System.out.println("Enter the task you want to delete :");
                delChoice=scan.nextInt();
                break;
            case 3:
                A.display();
                System.out.println("Enter the task you want to edit");
                break;
            case 4:
                A.display();
                break;
            case 5:
                System.out.println("Exiting...");
            default:
                System.out.println("Default");
        }
        System.out.println();
    }
}