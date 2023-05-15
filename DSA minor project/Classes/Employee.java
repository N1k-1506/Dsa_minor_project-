package Classes;

public class Employee {

    String name;
    int empId;
    public double salary;
    public String jobPosition ;
    public Date hireDate;
    public String contactNumber;
    Address address;
   
    public Employee(String name,int empId,double salary,String jobPosition,String contactNumber,Date hireDate,Address address){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
        this.jobPosition=jobPosition;
        this.contactNumber=contactNumber;
        this.hireDate=hireDate;
        this.address=address;
    
    }
    public void EmployeeDetails() {

        System.out.println("\n\nName: "+this.name+"\nempId:"+this.empId+"\nSalary: "+this.salary+"\nJob Position: "+this.jobPosition+"\nHire Date: "+hireDate.Day+"/"+hireDate.Month+"/"+hireDate.Year+"\nContact Number: "+contactNumber+"\nAddress: \n"+address.street+"\n"+this.address.city+"\n"+this.address.state);
    
    }
    Employee(){
    }

}