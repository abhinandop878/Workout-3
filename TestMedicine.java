import java.util.Random;
import java.util.Scanner;
class Medicine{
    protected String Name,address;
    protected Medicine(String Name, String address){
        this.Name=Name;
        this.address=address;
    }
    protected void displayLabel(){
        System.out.println("Name:"+this.Name);
        System.out.println("Address:"+this.address);
    }
}
class Tablet extends Medicine{
    protected Tablet(String Name,String address){
        super(Name,address);
    }
    protected void displayLabel(){
        super.displayLabel();
        System.out.println("Store in a cool place");
    }

}
class Syrup extends Medicine{
    protected Syrup(String Name,String address){
        super(Name,address);
    }
    protected void displayLabel(){
        super.displayLabel();
        System.out.println("Store in a Warm place");
    }

}
class ointment extends Medicine{
    protected ointment(String Name,String address){
        super(Name,address);
    }
    protected void displayLabel(){
        super.displayLabel();
        System.out.println("For external use only");
    }

}
public class TestMedicine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int p=0,q=0,r=0,n,c=0;
        do {
            n = (int) (Math.random() * (4 - 1) + 1);
            switch (n){
                case 1:
                    if(p==1)
                    {
                        break;
                    }
                    else{
                        p=1;
                        System.out.println("TYPE:Tablet");
                        System.out.println("Enter Tablet name and address:");
                        Tablet obj1=new Tablet(input.next(),input.next());
                        obj1.displayLabel();
                        c++;
                        break;
                    }
                case 2:
                    if(q==1)
                    {
                        break;
                    }
                    else{
                        q=1;
                        System.out.println("TYPE:Syrup");
                        System.out.println("Enter Syrup name and address:");
                        Syrup obj2=new Syrup(input.next(),input.next());
                        obj2.displayLabel();
                        c++;
                        break;
                    }
                case 3:
                    if(r==1)
                    {
                        break;
                    }
                    else{
                        r=1;
                        System.out.println("TYPE:ointment");
                        System.out.println("Enter ointment name and address:");
                        ointment obj3=new ointment(input.next(),input.next());
                        obj3.displayLabel();
                        c++;
                        break;
                    }

            }
        }while (c!=3);

    }
}