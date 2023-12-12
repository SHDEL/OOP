package packA;
public class Programmer{
    private String name;
    protected int salary;
    private int experience;

    public Programmer(String n , int exp, int sal){
        name = n;
        experience = exp;
        salary = sal;
    }
    public Programmer(String n){
        name = n;
    }
    public Programmer(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }
    public int getSalary(){
        return salary;
    }
    public void setExperience(int exp){
        this.experience = exp;
    }
    public int getExperience(){
        return experience;
    }
    
    @Override
    public String toString() {
        return "Programmer [name= " + getName() + "," + " salary=" + getSalary() + "," + " experience=" + getExperience() + "]";
    }
    public void sayHi(){
        System.out.println(" hi from " + this.name);
    }
    
    
}
