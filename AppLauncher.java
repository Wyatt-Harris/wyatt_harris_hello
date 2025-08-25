import java.util.Scanner;
public class AppLauncher {
    //Main method
    public static void main(String[] args) {
        // ASCII art splash of a cat
        System.out.println("      /\\     /\\"); 
        System.out.println("     {  `---'  }");
        System.out.println("     {  O   O  }");
        System.out.println("     ~~>  V  <~~");
        System.out.println("      \\  \\|/  /");
        System.out.println("       `-----'____");
        System.out.println("       /     \\    \\_");
        System.out.println("      {       }\\  )_\\_   _");
        System.out.println("      |  \\_/  |/ /  \\_\\_/ )");
        System.out.println("       \\__/  /(_/     \\__/");
        System.out.println("         (__/");
        System.out.println();

        try(Scanner scn = new Scanner(System.in)) {
        String name;
        int age;

            // First student
            while (true) {
                System.out.print("Enter a name: ");
                name = scn.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Name cannot be empty. Please try again.");
                } else {
                    break;
                }
            }
            HelloWorld student = new HelloWorld(name);

            // Second student
            while (true) {
                System.out.print("Enter a name: ");
                name = scn.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Name cannot be empty. Please try again.");
                    continue;
                }
                System.out.print("Enter an age: ");
                try {
                    age = Integer.parseInt(scn.nextLine());
                    if (age < 0) {
                        System.out.println("Age cannot be negative. Please try again.");
                        continue;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid age. Please enter a valid number.");
                    continue;
                }
                break;
            }
            HelloWorld student1 = new HelloWorld(name, age);

            student1.introduce();
            student.greet();
            student1.greet("Hello friend!");
        }
    }
}