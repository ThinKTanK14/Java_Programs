package method;

public class method {
    

static void doSomeThing()
{
    System.out.println("Inside method");
    System.out.println("Still Inside method");
}
public static void main(String[] args) {
    System.out.println("Before calling method.");
    doSomeThing();
    System.out.println("After calling methord");
}
}