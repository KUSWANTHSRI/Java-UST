public class Employee {
    
  private  String name;

  private  int employeeId;
    public String getName() {
    return name;
}

  public void setName(String name) {
    this.name = name;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public double getSalaray() {
    return salaray;
  }

  public void setSalaray(double salaray) {
    this.salaray = salaray;
  }

    private  double salaray;

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


