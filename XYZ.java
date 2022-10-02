import java.util.Scanner;
class Faculty{
     protected int facultyId,salary;
     protected String type;
     Scanner input=new Scanner(System.in);
     protected void display(){
         System.out.println("Faulty ID:"+this.facultyId);
         System.out.println("Type:"+this.type);
         System.out.println("Salary:"+this.salary);
     }
}
class FullTimeFaculty extends Faculty{
    protected int basic,allowance;
    protected void fullSalary(){
        this.type="FUll TIME FACULTY";
        System.out.println("Enter Faculty Id:");
        this.facultyId=input.nextInt();
        System.out.println("Enter Basic:");
        this.basic=input.nextInt();
        System.out.println("Enter Allowance:");
        this.allowance=input.nextInt();
        this.salary=this.basic+this.allowance;
    }
}
class PartTimeFaculty extends Faculty{
    protected int hour,rate;
    protected void partSalary(){
        this.type="PART TIME FACULTY";
        System.out.println("Enter Faculty ID:");
        this.facultyId=input.nextInt();
        System.out.println("Enter Hour:");
        this.hour=input.nextInt();
        System.out.println("Enter Rate:");
        this.rate=input.nextInt();
        this.salary=this.hour*this.rate;
    }

}
public class XYZ {
    public static void main(String[] args){
        FullTimeFaculty obj1=new FullTimeFaculty();
        System.out.println("Enter details of FULL TIME FACULTY");
        obj1.fullSalary();
        obj1.display();
        FullTimeFaculty obj2=new FullTimeFaculty();
        System.out.println("Enter details of FULL TIME FACULTY");
        obj2.fullSalary();
        obj2.display();
        PartTimeFaculty ob1=new PartTimeFaculty();
        System.out.println("Enter details of PART TIME FACULTY");
        ob1.partSalary();
        ob1.display();
        PartTimeFaculty ob2=new PartTimeFaculty();
        System.out.println("Enter details of PART TIME FACULTY");
        ob2.partSalary();
        ob2.display();
    }
}
