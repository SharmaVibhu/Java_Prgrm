class Parent
{
   public void parent()
   {
     System.out.println("Parent class method");
   }
}

class Child extends Parent
{
   public void child()
   {
     System.out.println("Child class method");
   }
}
public class SingleLevelInheritence2
{
   public static void main(String args[])
   {
     Child obj = new Child();
     obj.parent(); 
     obj.child(); 
  }
}