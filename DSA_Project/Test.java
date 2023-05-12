import java.util.Arrays;
import java.util.Scanner;
public class Test extends Employee {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of employees");
        int n=sc.nextInt();
        sc.nextLine();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of "+(i+1)+" employee: \n");
            System.out.print("Enter Name: ");
            name=sc.nextLine();
            System.out.print("Enter Employee Id: ");
            empId=sc.nextInt();
            System.out.print("Enter Salary: ");
            salary=sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Job Position ");
            jobPosition=sc.nextLine();
            System.out.print("Enter Contact Number (wiht Country code)):");
            contactNumber=sc.nextLine();
            System.out.print("Enter Date of hiring (in DD MM YYYY format)");
            hireDate=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt());
            sc.nextLine();
            System.out.print("Enter the address of the Employee (street,city,state)):");
            address=new Address(sc.nextLine(),sc.nextLine(),sc.nextLine()); 
            e[i]=new Employee(name, empId, salary, jobPosition, contactNumber, hireDate, address);
            
        }
        sc.close();
    }
    public static void arrangeEmployeeBySalary(Employee e[]){
        int n=e.length;
        for(int i=0;i<n;i++){
            double temp=0;
            for(int j=i;j<n;j++){
                if(e[i].salary<e[j].salary){
                    temp=e[i].salary;
                    e[i].salary=e[j].salary;
                    e[j].salary=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            EmployeeDetails();
        }
    
    }
    public static void getEmployeesByJobPosition(Employee e[], String jp){
        for(int i=0;i<e.length;i++){
            String temp=e[i].jobPosition;
            if(temp==jp){
                EmployeeDetails();
            }
        }
    
    }
    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2){
        
        for(int i=0;i<e.length;i++){
            int y=e[i].hireDate.Year;
            if(y>=d1.Year && y<=d2.Year){
                int m=e[i].hireDate.Month;
                if(m>=d1.Month && m<=d2.Month){
                    int d=e[i].hireDate.Day;
                    if(d>=d1.Day && d<=d2.Day){
                        EmployeeDetails();
                    }
                }
            }
        }

    }
    public static int foreignEmployeeCount(Employee e[]){
        int count=0;
        for(int i=0;i<e.length;i++){
            String str=e[i].contactNumber;
            char ch[]=str.toCharArray();
            if(ch[1]=='9' && ch[2]=='1'){
                count++;
            }
        }
        return count;
    }
    public static void getEmployeesBySalary(Employee e[], double s1, double s2){
        for(int i=0;i<e.length;i++){
            if(e[i].salary>=s1 && e[i].salary<=s2){
                EmployeeDetails();
            }
        }
    }

    public static void EmployeeDetails(){
        System.out.println("Name: "+name+"\nempId:"+empId+"\nSalary: "+salary+"\nJob Position: "+jobPosition+"\nHire Date: "+hireDate+"\nContact Number: "+contactNumber+"\nAddress: "+address);
    }

        
        
        
    
   
}

