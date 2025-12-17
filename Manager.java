public class Manager extends Employee {

    int teamsize;
    public Manager(String name ,int id,double salary,int teamsize){
        super(name,id,salary);
        this.teamsize=teamsize;

    }
     public void displayDetails(){
        System.out.println(name);
        System.out.println(employeeId);
         System.out.println(salaray);
         System.out.println(teamsize);
    }

    
}
