class Student{
int id;
float percentage;
static String clg;
}
class Employee{
int employee_id;
int salary;
static String company_name;
}
public class Variable{
public static void main(String[] args)
{
Student rahul = new Student();
rahul.id=10;
rahul.percentage=76.7f;
Student.clg="Galgotias University";
System.out.println(rahul.id + " " + rahul.percentage + " " +  Student.clg);

Employee shiva = new Employee();
shiva.employee_id=01;
shiva.salary=20000;
Employee.company_name="Motivity";
System.out.println(shiva.employee_id + " " + shiva.salary + " " +  Employee.company_name);
}
}
