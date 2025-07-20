class Employee implements Cloneable {
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

 
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    public void display() {
    	System.out.println("Id: " + id);
        System.out.println("Name: " +name);
        System.out.println("Salary: "+salary);
    }
}

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        
         
            Employee original = new Employee(101, "Alice", 50000);

      
            Employee cloned = (Employee) original.clone();

       
            original.setName("Bob");
            original.setSalary(60000);

      
            System.out.println("Original Employee:");
            original.display();

            System.out.println("Cloned Employee:");
            cloned.display();
       
    }
}