public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Motivity");
		StringBuilder s=new StringBuilder("Motivity");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		System.out.println(sb.append(" Labs"));
		System.out.println(sb.equals(s));
		System.out.println(sb.indexOf("n"));
		System.out.println(sb.substring(2));
		
	}

}
