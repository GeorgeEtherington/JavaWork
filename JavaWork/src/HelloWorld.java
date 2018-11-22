
public class HelloWorld
{
    public HelloWorld ()
    {
        sayHello ();
    }

    private void sayHello ()
    {
        System.out.println ("hello, world");
    }

    public static void main (String args[])
    {
        new HelloWorld();
    }
}