public class Demo {

    public static void main(String[] args) {
        
        HelloWorld obj1 = new HelloWorld();
        HelloWorld obj2 = new HelloWorld();

        obj1.sayThis = "Hello, World from Demo!";
        obj2.sayThis = "Hello, World from Nowhere!";

        obj1.saySomething();
        obj2.saySomething();
    }
}
