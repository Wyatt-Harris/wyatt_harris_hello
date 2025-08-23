public class HelloWorld { 
    String name; 
    private int age;
   //Constructor
    public HelloWorld(String name) { 
        this.name = name; 
    } 

    //Overloaded constructor
    public HelloWorld(String name, int age){
        this.name = name;
        this.age = age;
    }

    //introduce method to include age
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    //Method to print greeting
    public void greet() {
     System.out.println("Hello, " + name + "!");
     }

     //customized greet method
     public void greet(String message) {
        System.out.println(message);
     }

      //Main method
     public static void main(String[] args) {
        HelloWorld student = new HelloWorld("Wyatt"); 
        HelloWorld student1 = new HelloWorld("Mallorie", 18);
        student1.introduce();
        student.greet();
        student1.greet("Hello friend!");

     } 

}