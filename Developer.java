public class Developer extends Employee {
 private  String programmingLanguage;


 

   public Developer(String name, int employeeId, double salaray, String programmingLanguage) {
    super(name, employeeId, salaray);
    this.programmingLanguage = programmingLanguage;
   }
      public String getProgrammingLanguage() {
    return programmingLanguage;
   }

   public void setProgrammingLanguage(String programmingLanguage) {
    this.programmingLanguage = programmingLanguage;
   }
   
   @Override
    public void displayDetails(){
            super.displayDetails();
         System.out.println(programmingLanguage);
    }



}
