class First
{
   public void methodFirst()
   {
     System.out.println("Class First method");
   }
}
class Second extends First
{
public void methodSecond()
{
System.out.println("class Second method");
}
}
class Third extends Second
{
   public void methodThird()
   {
     System.out.println("class Third method");
   }
}
public class MultiLevelInheritence
{
   public static void main(String args[])
   {
     Third obj = new Third();
     obj.methodFirst(); 
     obj.methodSecond();
     obj.methodThird(); 
  }
}