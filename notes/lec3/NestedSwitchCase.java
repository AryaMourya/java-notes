package notes.lec3;

import java.util.Scanner;


public class NestedSwitchCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int emp = in.nextInt();
        String department = in.next();

        switch (emp) {
            case 1:
                System.out.println("Arya");
                break;
            case 2:
                System.out.println("Sansa");
                break;
            case 3:
             switch (department) {
                case "IT":
                    System.out.println("IT Department");
                    break;
                case "HR":
                    System.out.println("HR Department");
                    break;
                default:
                    System.out.println("Unknown Department");
            }
                    break;
            default:
                System.out.println("Unknown Employee");
                System.out.println("Enter a valid employee number");
                break;
        }
    }
}
