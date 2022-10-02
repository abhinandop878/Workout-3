import java.util.Scanner;
abstract class Car{
    protected int noOfWheels;
    protected Car(int noOfWheels){
        this.noOfWheels=noOfWheels;
    }
    protected abstract void ignition();
    protected void  changeGear(){
        System.out.println("Car Gear has Changed!");
    }

}
class Sedan extends Car{
    protected Sedan(int noOfWheels){
        super(noOfWheels);
    }
    protected void ignition(){
        System.out.println("No of Wheels:"+this.noOfWheels);
        System.out.println("Ignition Started!");
    }
}
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number of wheels:");
        Sedan obj=new Sedan(input.nextInt());
        obj.ignition();
        obj.changeGear();
    }
}
