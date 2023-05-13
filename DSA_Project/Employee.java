
public class Employee {

    String name;
    int empId;
    double salary;
    String jobPosition ;
    Date hireDate;
    String contactNumber;
    Address address;
   
    Employee(String name,int empId,double salary,String jobPosition,String contactNumber,Date hireDate,Address address){
        this.name=name;
        this.empId=empId;
        this.salary=salary;
        this.jobPosition=jobPosition;
        this.contactNumber=contactNumber;
        this.hireDate=hireDate;
        this.address=address;
    
    }
    public void EmployeeDetails() {
        System.out.println("\n\nName: "+this.name+"\nempId:"+this.empId+"\nSalary: "+this.salary+"\nJob Position: "+this.jobPosition+"\nHire Date: "+hireDate.Day+"/"+hireDate.Month+"/"+hireDate.Year+"\nContact Number: "+contactNumber+"\nAddress: \n"+this.address.getStreet()+"\n"+this.address.getCity()+"\n"+this.address.getState());
    
    }
    Employee(){
    }

}

class Date{
    int Day;
    int Month;
    int Year;
    Date(int D,int M,int Y){
        Day=D;
        Month=M;
        Year=Y;
    }
    
    public int getYear(){
        return Year;
    }
    public int getMonth(){
        return Month;
    }
    public int getDay(){
        return Day;
    }
    public void displayDate(){
        System.out.print(Day+"/"+Month+"/"+Year+" ");
    }

}
class Address{
    String street, city;
    String state;
    
    Address(String st,String c,String St){
        street=st;
        city=c;
        state=St;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }


}