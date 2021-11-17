import com.adambots.*;

public class HelloWorld {

    public String sayThis = "Hello, World";
    private int aNumber = 10;
    private Integer anotherNumber = 10;

    private float realNumber = 11.24f;
    public double largePrecision = Math.PI;

    char aLetter = 'a';
    boolean trueOrFalse = true;

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World ");
        
        var test = "text";

        // Utils.print("Hello, World!");
        // HelloWorld hw = new HelloWorld();

        HelloWorld obj = new HelloWorld("Hello, Old World!");
        // obj.sayThis = "Hello, New World!";
        
        obj.saySomething();

        // HelloWorld obj2 = new HelloWorld("Hello, Old World!");
        // obj2.saySomething();
    }

    public HelloWorld(String sayThis){
        this.sayThis = sayThis;

    }

    public HelloWorld(){

    }

    public void saySomething(){
        System.out.println(sayThis);
    }
}