import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

interface studentFee{
    Scanner input=new Scanner(System.in);
    public void getFee() throws InputMismatchException;
}
public class Students implements studentFee {
    int fees,f=0;
    String name;
    public void getFee() throws InputMismatchException{
        System.out.println("Enter Name:");
        this.name = input.next();
        try {
            System.out.println("Enter Fees:");
            this.fees = input.nextInt();
            if (this.fees < 0) {
                this.f=1;
                throw new InputMismatchException("Invalid !, Fee Can not be negative value!");
            }
        }
        catch (InputMismatchException e){
            this.f=1;
            System.out.println(e);
        }
    }
    public void display(){
        System.out.println("Name:"+this.name+" Fees:"+this.fees);
    }
    public static void main(String[] args) {
        Students obj1=new Students();
        obj1.getFee();
        if (obj1.f!=1){
            obj1.display();
        }
        else {
            System.out.println("End!");
        }

    }
}
