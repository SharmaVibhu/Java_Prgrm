abstract class Shape
{  
abstract void draw();  
}  
class Rectangle extends Shape
{  
void draw(){System.out.println(" rectangle");}  
}  
class Circle extends Shape
{  
void draw(){System.out.println(" circle");}  
}  
  
public class Abstract2{  
public static void main(String args[])
{  
Shape s=new Circle();  
s.draw();  
}  
}  