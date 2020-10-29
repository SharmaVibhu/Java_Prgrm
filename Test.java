class Vehicle{
String car_name;
int registration_number;
int highest_speed;
int gear;
int price;
String brand;
static String manufactured;
}
public class Test{
public static void main(String[] args)
{
Vehicle creta = new Vehicle();
creta.car_name= "Creta";
creta.registration_number=1001;
creta.highest_speed=180;
creta.gear=6;
creta.price=760000;
creta.brand="Hyundai";
Vehicle.manufactured="Europe";
System.out.println("Car:" + creta.car_name);
System.out.println("registration_number:" + creta.registration_number);
System.out.println("highest_speed:" + creta.highest_speed);
System.out.println( "gear:" + creta.gear);
System.out.println("price:" + creta.price);
System.out.println("brand:" + creta.brand );
System.out.println("manufactured:" + Vehicle.manufactured);
System.out.println();

Vehicle nexon = new Vehicle();
nexon.car_name= "Nexon";
nexon.registration_number=1002;
nexon.highest_speed=150;
nexon.gear=6;
nexon.price=700000;
nexon.brand="suzuki";
Vehicle.manufactured="Europe";
System.out.println("Car:" + nexon.car_name);
System.out.println("registration_number:" + nexon.registration_number);
System.out.println("highest_speed:" + nexon.highest_speed);
System.out.println( "gear:" + nexon.gear);
System.out.println("price:" + nexon.price);
System.out.println("brand:" + nexon.brand );
System.out.println("manufactured:" + Vehicle.manufactured);
}
}
