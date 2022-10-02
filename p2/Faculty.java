package p2;

import java.util.Scanner;

public class Faculty {
    String name,department;
    int ID;
    Scanner input=new Scanner(System.in);
    public Faculty(){
        System.out.println("Enter ID:");
        this.ID=input.nextInt();
        System.out.println("Enter Name:");
        this.name=input.next();
        System.out.println("Enter Department:");
        this.department=input.next();
    }
    public void print(){
        System.out.println("Faculty");
        System.out.println("ID:"+this.ID+" Name:"+this.name+" Department:"+this.department);
    }
}
