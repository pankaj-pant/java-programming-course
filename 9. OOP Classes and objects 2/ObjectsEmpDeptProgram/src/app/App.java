package app;

/* Task:
Create classes Department and Employee.

The Department class has two fields (int number, String name), 
a parametric constructor, and getters/setters for the both fields.

The Employee class has three fields (String name, String email, 
Department department), a parametric constructor, getters/setters 
for all the fields, and the toString method.


Example output:
John Doe (john@abc.com), Sales department
Hank Marvin (hank@abc.com), Music department
Joan Baez (joan@abc.com), Music department

John Doe (john@abc.com), Music department
Hank Marvin (hank@abc.com), Music department
Joan Baez (joan@abc.com), Music department */

public class App {

    public static void main(String[] args) {
           Department firstDepartment = new Department(10, "Sales");
           Department secondDepartment = new Department(20, "Music");
           
           Employee[] employeeArray = {
                   new Employee("John Doe", "john@abc.com", firstDepartment),
                   new Employee("Hank Marvin", "hank@abc.com", secondDepartment),
                   new Employee("Joan Baez", "joan@abc.com", secondDepartment)};
           
           for (Employee employee : employeeArray) {
               System.out.println(employee);
           }
           
           employeeArray[0].setDepartment(secondDepartment);
           System.out.println();
           
           for (Employee employee : employeeArray) {
               System.out.println(employee);
           }
       }
   
}

class Department {

   private int number;
   
   private String name;
   
   public Department(int number, String name) {
       this.number = number;
       this.name = name;
   }
   
   public int getNumber(){
       return number;
   }
   
   public String getName() {
       return name;
   }
   
   public void setNumber(int number) {
       this.number = number;
   }
   
   public void setName(String name) {
       this.name = name;
   }
}

class Employee {

   private String name;
   
   private String email;
   
   private Department department;
   
   public Employee(String name, String email, Department department) {
       this.name = name;
       this.email = email;
       this.department = department;
   }
   
   public String getName() {
       return name;
   }
   
   public String getEmail() {
       return email;
   }
   
   public Department getDepartment() {
       return department;
   }
   
   public void setName(String name) {
       this.name = name;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }
   
   public void setDepartment(Department department) {
       this.department = department;
   }
   
   public String toString() {
       return name + " (" + email + "), " + department.getName() + " department";
   }
   
}
