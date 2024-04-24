import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.*;

public class ToDoListDb{
    public static String URL = "jdbc:mysql://localhost:3306/java_project";
    public static String USERNAME = "root";
    public static String PASSWORD = "hilubabz";
    void display(){

    }
    String task;
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement =connection.createStatement();
        int choice,delChoice;
        int i = 0;
        Statement count  = connection.prepareStatement("select * from tasks");
        ResultSet rs = count.executeQuery("select * from tasks");
        while(rs.next()){
            i++;
            
            System.out.println(rs.getString("task"));
        
        }
        System.out.println(i);
        Scanner scan=new Scanner(System.in);
        ToDoListDb A=new ToDoListDb();
        System.out.println("MENU\n1. for entering new task\n2. for removing a task\n3. for updating a task\n4. exit");
        System.out.print("Enter your choice :");
        choice=scan.nextInt();
        scan.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter new task to be added :");
                A.task=scan.nextLine();
                statement.executeUpdate("insert into tasks values("+i+",'"+A.task+"');");  
                i++;
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
    public void insert(String A) throws Exception{
        
                      
        
    }
}
