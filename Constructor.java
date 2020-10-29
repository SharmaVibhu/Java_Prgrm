class Employee{
int empid;
String empname;
int salary;
int age;
static String company = "Motivity";
Employee(int empid,String empname,int salary,int age){
this.empid=empid;
this.empname=empname;
this.salary=salary;
this.age=age;
}
void display(){
System.out.println("Employee id =" +empid);
System.out.println("Employee name =" +empname);
System.out.println("Employee salary =" +salary);
System.out.println("Employee company =" +company);
}
}
class Constructor{
public static void main(String[] args){
Employee mahesh = new Employee(2021, "mahesh" , 45000, 41);
mahesh.display();
Employee ram = new Employee(2023, "Ram" , 48000, 35);
ram.display();
}
}