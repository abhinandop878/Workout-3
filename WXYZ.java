import java.util.Scanner;
class Student{
    protected int rollNo,percentage;
    static int count=0;
    String Grade="A";
    protected Student(int rollNo,int percentage){
        this.rollNo=rollNo;
        this.percentage=percentage;
        if (this.percentage>75){
            count++;
        }
    }
    protected void show(){
        System.out.println("ROLLNO:"+this.rollNo+"\nPERCENTAGE:"+this.percentage);
    }

}
class CollegeStudent extends Student{
    protected String semester;
    protected CollegeStudent(String semester,int rollNo,int percentage){
        super(rollNo, percentage);
        this.semester=semester;
    }
    protected void show(){
        super.show();
        System.out.println("SEMESTER:"+this.semester);
    }
}
class SchoolStudent extends Student{
    protected String classname;
    protected SchoolStudent(String classname,int rollNo,int percentage){
        super(rollNo,percentage);
        this.classname=classname;
    }
    protected void show(){
        super.show();
        System.out.println("CLASS NAME:"+this.classname);
    }
}

public class WXYZ {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,r,f=0;
        Student obj[]=new Student[5];
        System.out.println("Enter College Student Details");
        for (i=0;i<2;i++)
        {
            System.out.println("Enter Semester, Rollno and Percentage:");
            obj[i]=new CollegeStudent(input.next(),input.nextInt(),input.nextInt());
        }
        System.out.println("Enter School Student Details");
        for (i=2;i<5;i++){
            System.out.println("Enter Class Name, Rollno and Percentage:");
            obj[i]=new SchoolStudent(input.next(),input.nextInt(),input.nextInt());
        }
        for (i=0;i<5;i++){
            obj[i].show();
        }
        System.out.println("\nEnter a Rollno to Search:");
        r=input.nextInt();
        for (i=0;i<5;i++){
            if(obj[i].rollNo==r){
                obj[i].show();
                f=1;
            }
        }
        if(f!=1){
            System.out.println("\nNo Matching Record Found!");
        }
        System.out.println("\nTotal of Student having A Grade:"+Student.count);

    }
}
