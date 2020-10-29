class Sample
{
     void disp(char c)
    {
         System.out.println(c);
    }
     void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
    void disp(int c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
public class DisplayOverloading 
{
   public static void main(String args[])
   {
       Sample obj = new Sample();
       obj.disp('a');
       obj.disp(10,10);
       obj.disp('a',10);
   }
}