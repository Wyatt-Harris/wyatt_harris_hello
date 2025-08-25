/**
 * HelloWorld class
 */
public class HelloWorld { 
    /** The person's name */
    String name; 

    /** The person's age */
    private int age;

    /**
     * Constructs a HelloWorld object with the specified name.
     * @param name The name of the person.
     */
    public HelloWorld(String name) { 
        this.name = name; 
    } 

    /**
     * Constructs a HelloWorld object with the specified name and age
     * with @param name and @param age
     */
    public HelloWorld(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * Prints an introduction message including the person's name and age.
     */
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    /**
     * Prints a greeting message.
     */
    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * Prints a custom greeting message.
     * @param message The custom message to print.
     */
    public void greet(String message) {
        System.out.println(message);
    } 
}