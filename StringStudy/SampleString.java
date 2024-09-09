package StringStudy;

public class SampleString {

	public static void main(String[] args) {

		String s = "goutam";
		String s1 = "veLocIty";

		int a = s.length();

		String x = s.toUpperCase(); // 0-v;1-e;2-l.....7-y
		boolean d = s.isEmpty();
		System.out.println(d);

		boolean b = s.equalsIgnoreCase(s1);
		System.out.println(b);

		boolean c = s.contains("loC");
		System.out.println(c);

		char y = s.charAt(1);
		
		System.out.println(s.concat(s1));

	}

}
