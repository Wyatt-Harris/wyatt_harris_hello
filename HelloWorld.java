public class HelloWorld { 
    String name; 
   //Constructor
    public HelloWorld(String name) { 
        this.name = name; 
    } 
    //Method to print greeting
    public void greet() {
     System.out.println("Hello, " + name + "!");
     }
      //Main method
     public static void main(String[] args) {
        HelloWorld student = new HelloWorld("Wyatt"); 
        student.greet();
     } 

}