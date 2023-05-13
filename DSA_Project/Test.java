
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
        System.out.println("Do you want to use a function (y/n):");
        String temp=sc.next();
        String co="y";
        while(temp.equals(co)){
            System.out.println("Choose the method you want to use: \n1:arrangeEmployeeBySalary\t2:getEmployeesByJobPosition\t3:getEmployeesByHireDate\t4:foreignEmployeeCount\t5:getEmployeesBySalary");
            int t=sc.nextInt();
            sc.nextLine();
            switch (t) {
                case 1:
                    arrangeEmployeeBySalary(e);
                    break;
                case 2:
                    System.out.println("Enter the job position to search for:");
                    String jp=sc.nextLine(); 
                    System.out.println("Employess whose job position is "+jp+" are: ");
                    getEmployeesByJobPosition(e, jp);
                    break;
                case 3:
                    System.out.println("Give the hiredates for which you want to search: ");
                    System.out.println("Enter the date 1:(in dd mm yyyy format with spaces): ");
                    Date d1=new Date(sc.nextInt(),sc.nextInt() ,sc.nextInt());
                    System.out.println("Enter the date 2:(in dd mm yyyy format with spaces):");
                    Date d2=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    System.out.println("Employees whose hireDate lies between ");
                    d1.displayDate();
                    System.out.print(" and ");
                    d2.displayDate();
                    System.out.print("are as follows : ");
                    getEmployeesByHireDate(e, d1, d2);
                    break;
                case 4:
                    int f=foreignEmployeeCount(e);
                    if(f>0){
                        System.out.println("No. of foreign Employees: "+f);
                    }
                    else{
                        System.out.println("No foreign Employees ");

                    }
                    break;
                case 5:
                    System.out.println("Enter the lower and higher salary cap (separated by space):");
                    double s1=sc.nextDouble(),s2=sc.nextDouble();
                    getEmployeesBySalary(e,s1,s2);
                    break;
            }
            System.out.println("Do you want to use function again (y/n):");
            temp=sc.next();        
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
    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2){
        
        for(int i=0;i<e.length;i++) {
            int y = e[i].hireDate.getYear();
            if(y >= d1.getYear() && y <= d2.getYear()) {
                int m = e[i].hireDate.getMonth();
                if(m >= d1.getMonth() && m <= d2.getMonth()) {
                    int d = e[i].hireDate.getDay();
                    if(d >= d1.getDay() && d <= d2.getDay()) {
                        e[i].EmployeeDetails();
                    }
                }
            }
        }
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

