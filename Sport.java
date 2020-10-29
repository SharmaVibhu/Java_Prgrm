class Batsman{
String name;
int jersey_number;
int highest_run;
int no_of_six;
static String country;
}
public class Sport{
public static void main(String[] args)
{
Batsman virat = new Batsman();
virat.name = "Virat Kohli";
virat.jersey_number=18;
virat.highest_run=170;
virat.no_of_six=50;
Batsman.country= "India";
System.out.println("Batsman :" + virat.name);
System.out.println("jersey_number :" + virat.jersey_number);
System.out.println( "highest_run:" + virat.highest_run);
System.out.println("no_of_six:" + virat.no_of_six);
System.out.println("country:" + Batsman.country );
System.out.println();
Batsman sachin = new Batsman();
sachin.name = "Sachin Tendulkar";
sachin.jersey_number=10;
sachin.highest_run=200;
sachin.no_of_six=100;
System.out.println("Batsman :" + sachin.name);
System.out.println("jersey_number :" + sachin.jersey_number);
System.out.println( "highest_run:" + sachin.highest_run);
System.out.println("no_of_six:" + sachin.no_of_six);
System.out.println("country:" + Batsman.country );
}
}
