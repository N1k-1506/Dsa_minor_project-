package Classes;

public class Date {
    public int Day;
    public int Month;
    public int Year;
    public Date(int D,int M,int Y){
        Day=D;
        Month=M;
        Year=Y;
    }
    public void displayDate(){
        System.out.print(Day+"/"+Month+"/"+Year+" ");
    }

}

