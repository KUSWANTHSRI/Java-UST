public class Employee {
    
    String name;

    int employeeId;
    double salaray;

    public Employee(String name, int employeeId, double salaray) {
        this.name = name;
        this.employeeId = employeeId;
        this.salaray = salaray;
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(employeeId);
         System.out.println(salaray);
    }
}


