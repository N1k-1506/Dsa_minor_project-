
import java.util.Scanner;
public class Test extends Employee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of employees");
        int n=sc.nextInt();
        sc.nextLine();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++){
            System.out.println("\nEnter the details of "+(i+1)+" employee: \n");
            System.out.print("Enter Name: ");
            String name=sc.nextLine();
            System.out.print("Enter Employee Id: ");
            int empId=sc.nextInt();
            System.out.print("Enter Salary: ");
            double salary=sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Job Position: ");
            String jobPosition=sc.nextLine();
            System.out.print("Enter Contact Number ([countrycode-number] in this format):");
            String contactNumber=sc.nextLine();
            System.out.print("Enter Date of hiring (in [DD MM YYYY] format separated by space): ");
            Date hireDate=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
            sc.nextLine();
            System.out.println("Enter the address of the Employee (in 3 lines):");
            Address address=new Address(sc.nextLine(),sc.nextLine(),sc.nextLine()); 
            e[i]=new Employee(name, empId, salary, jobPosition, contactNumber, hireDate, address);
            
        }
   
    }   
    public static void arrangeEmployeeBySalary(Employee e[]){
        int n=e.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(e[i].salary<e[j].salary){
                    Employee temp=e[i];
                    e[i]=e[j];
                    e[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            e[i].EmployeeDetails();
        }
    
    } 
    public static void getEmployeesByJobPosition(Employee e[], String jp){
        for(int i=0;i<e.length;i++){
            String temp=e[i].jobPosition;
            if(temp.equals(jp)){
                e[i].EmployeeDetails();
            }
        }
    
    }
public static void getEmployeesByHireDate(Employee[] e, Date d1, Date d2) {
        for (int i = 0; i < e.length; i++) {
            if (isBetween(e[i].hireDate, d1, d2)) {
                e[i].EmployeeDetails();
            }
        }
    }
    
    
    
    public static boolean isBetween(Date hireDate, Date after, Date before) {
        if (hireDate.year > after.year && hireDate.year < before.year) {
            return true;
        } else if (hireDate.year == after.year && hireDate.month > after.month) {
            return true;
        } else if (hireDate.year == after.year && hireDate.month == after.month && hireDate.day >= after.day) {
            return true;
        } else if (hireDate.year == before.year && hireDate.month < before.month) {
            return true;
        } else if (hireDate.year == before.year && hireDate.month == before.month && hireDate.day <= before.day) {
            return true;
        }
        return false;
    }
        
    public static int foreignEmployeeCount(Employee e[]) {
        int count = 0;
        for (int i = 0; i < e.length; i++) {
            String str = e[i].contactNumber;
            if (str != null && !str.startsWith("+91")) {
                count++;
            }
        }
        return count;
    }
    
    public static void getEmployeesBySalary(Employee e[], double s1, double s2){
        for(int i=0;i<e.length;i++){
            if(e[i].salary>=s1 && e[i].salary<=s2){
                e[i].EmployeeDetails();
            }
        }
    }  
}

