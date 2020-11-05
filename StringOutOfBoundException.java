public class StringOutOfBoundException {
		public static void main(String[] args) {
			String s="MotivityLabs";
			try
			{
				char ch=s.charAt(25);
				System.out.println(ch);
			}
			catch(StringIndexOutOfBoundsException se)
			{
				System.out.println("enter vallid index number");
			}
		}
}