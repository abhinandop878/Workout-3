package p1;

import java.util.Scanner;

public class Student {
    String name,standard;
    int rollNo;
    Scanner input=new Scanner(System.in);
    public Student(){
        System.out.println("Enter Roll no:");
        this.rollNo=input.nextInt();
        System.out.println("Enter name:");
        this.name=input.next();
        System.out.println("Enter Standard:");
        this.standard=input.next();
    }
    public void print(){
        System.out.println("Student Package 1");
        System.out.println("Rollno:"+this.rollNo+" Name:"+this.name+" Standard:"+this.standard);
    }
}
