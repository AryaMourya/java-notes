package notes.lec2;

public class conditions {
    public static void main(String[] args){
        /*
           Syntax of if statement in Java
           if(condition in boolean expression  T/F){
               // code to be executed if condition is true
           } else {
               // code to be executed if condition is false
           }
        */
       int salary = 25000; 
       if (salary < 20000) {
           salary = salary + 5000;
       } else {
           salary = salary + 2000;
       }
       System.out.println("New salary: " + salary);

       // Multiple if-else statements
       if (salary > 10000) {
        salary += 2000;
       } else if (salary > 20000) {
        salary += 3000;
       } else if (salary > 30000) {
        salary += 4000;
       } else {
        salary += 5000;
       }
       System.out.println("New salary after multiple conditions: " + salary);

    }   
}
