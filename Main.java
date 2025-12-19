public class Main {
    public static void main(String[] args) {




        Employee e1=new Employee("kuswanth",123,25000);
        e1.displayDetails();
       Manager manager = new Manager("Alice", 101, 80000.0, 5);
       manager.displayDetails();
       
       Developer developer = new Developer("Bob", 102, 60000.0, "Java");
        developer.displayDetails();

    }
}
