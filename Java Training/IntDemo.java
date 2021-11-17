

public class IntDemo implements Greeting{

    public static void main(String[] args) {

        IntDemo iDemo = new IntDemo();

        iDemo.saySomething("Mr. B");

        // Greeting iDemo2 = new IntDemo();
        // iDemo2.saySomething("Test");
        Greeting iDemo2 = new Greeting(){

            @Override
            public void saySomething(String name) {
                System.out.println("Hello World, " + name);
            }
            
        };

        iDemo2.saySomething("Mr. B again");

        Greeting iDemo3 = i -> System.out.println("Hello World, " + i);

        // iDemo3.saySomething("Mr. B really?");

        // Greeting iDemo4 = (i) -> { 
        //     System.out.println("Hello World, " + i); 
        // };
        
        // iDemo4.saySomething("Mr. B really, really?");

    }

    @Override
    public void saySomething(String name) {
        // TODO Auto-generated method stub
        System.out.println("Hello World, " + name);
        
    }

    // @Override
    // public void saySomething(String name) {
        
    //     System.out.println("Hello World, " + name);
    // }

}