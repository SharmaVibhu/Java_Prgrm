import java.util.Scanner;

class Scanner_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name in String, age in Integer and salary in Double:");

    String name = sc.nextLine();

    int age = sc.nextInt();

    double salary = sc.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}