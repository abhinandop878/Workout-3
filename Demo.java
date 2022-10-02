import p1.Faculty;
import p1.Student;
public class Demo {
    public static void main(String[] args) {
        p1.Faculty t1=new p1.Faculty(1,"Abhinand","CE");
        p1.Faculty t2=new p1.Faculty(2,"Riya","CS");
        p1.Student k1=new p1.Student();
        p1.Student k2=new p1.Student();
        t1.print();
        t2.print();
        k1.print();
        k2.print();
        p2.Faculty f1=new p2.Faculty();
        p2.Faculty f2=new p2.Faculty();
        f1.print();
        f2.print();
        p2.Student b1=new p2.Student(1,"Havin","5th");
        p2.Student b2=new p2.Student(1,"Kripa","4th");
        b1.print();
        b2.print();
    }
}
