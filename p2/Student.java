package p2;
public class Student {
        String name,standard;
        int rollNo;
        public Student(int rollNo,String name,String standard){
            this.name=name;
            this.standard=standard;
            this.rollNo=rollNo;
        }
        public void print(){
            System.out.println("Student");
            System.out.println("Roll NO:"+rollNo+" Name:"+name+" Standard:"+standard);
        }
}
