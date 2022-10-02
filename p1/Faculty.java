package p1;

public class Faculty {
    String name,department;
    int ID;
    public Faculty(int ID,String name,String department){
        this.ID=ID;
        this.name=name;
        this.department=department;
    }
    public void print(){
        System.out.println("Faculty Package 1");
        System.out.println("ID:"+this.ID+" Name:"+this.name+" Department:"+this.department);
    }
}
