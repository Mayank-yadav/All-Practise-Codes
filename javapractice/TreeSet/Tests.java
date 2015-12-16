
 
import java.util.Comparator;
import java.util.*;
 
public class Tests {
 
    public static void main(String a[]){
        TreeSet<Employee> treeSet1 = new TreeSet<Employee>(new CompareName());
        treeSet1.add(new Employee("Ram",100));
        treeSet1.add(new Employee("Kamal",400));
        treeSet1.add(new Employee("shashank",324));
        treeSet1.add(new Employee("Deepak",243));
        for(Employee e:treeSet1){
            System.out.println(e);
        }
        System.out.println("------------------");
        TreeSet<Employee> treeSet2 = new TreeSet<Employee>(new CompareSalary());
        treeSet2.add(new Employee("Ram",100));
        treeSet2.add(new Employee("Kamal",400));
        treeSet2.add(new Employee("shashank",324));
        treeSet2.add(new Employee("Deepak",243));
        for(Employee e:treeSet2){
            System.out.println(e);
        }
    }
}
 
class CompareName implements Comparator<Employee>{
 
   @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}   
 
class CompareSalary implements Comparator<Employee>{
 
  
   @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class Employee{
     
    private String name;
    private int salary;
     
    public Employee(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}