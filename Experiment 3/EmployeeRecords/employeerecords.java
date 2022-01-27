package EmployeeRecords;
import java.util.*;

public class employeerecords 
{
    public static void main(String[] args) 
    {
            employee e1 = new employee(), e2 = new employee(), e3 = new employee(), e4 = new employee(), e5 = new employee();
            
            System.out.println("Enter the details of employee 1");
            e1.read();
            System.out.println("Enter the details of employee 2");
            e2.read();
            System.out.println("Enter the details of employee 3");
            e3.read();
            System.out.println("Enter the details of employee 4");
            e4.read();
            System.out.println("Enter the details of employee 5");
            e5.read();
    
            System.out.println("DETAILS");
            e1.display();
            e2.display();
            e3.display();
            e4.display();
            e5.display();
    }
}
    
class employee 
{
        int empno;
        String name, phone;
    
        Scanner sc = new Scanner(System.in);
    
        void read() 
        {        
            System.out.print("Employee no: ");
            empno = sc.nextInt();
           
            System.out.print("Name: ");
            name = sc.next();
    
            System.out.print("Phone: ");
            phone = sc.next();
    
            System.out.print("\n");
        }
    
        void display() 
        {
            System.out.println("Employee no: " + this.empno);
    
            System.out.println("Name: " + this.name);
    
            System.out.println("Phone: " + this.phone + "\n");
        }
    
}
