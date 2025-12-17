public class Developer extends Employee {
   String programmingLanguage;

   public Developer(String name, int employeeId, double salaray, String programmingLanguage) {
    super(name, employeeId, salaray);
    this.programmingLanguage = programmingLanguage;
   }

   @Override
    public void displayDetails(){
        System.out.println(name);
        System.out.println(employeeId);
         System.out.println(salaray);
         System.out.println(programmingLanguage);
    }
   

}
