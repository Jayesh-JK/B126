public class OP
{
public void sum()
{
System.out.println("Sum Method");
}
public void sub()
{
System.out.println("Subtraction Method");
}
public void mul()
{
System.out.println("Multification Method");
}
public void div()
{
System.out.println("Division Method");
}

public static void main(String args[])
{
System.out.println("Main Method");
OP c=new OP();  // new obj creation
c.sum();
c.sub();
c.mul();
c.div();
}
}
