public class Challenge {
	public static int triArea(int base, int height) {
		int area = (base * height) / 2;
		return area;
	}
	public static void main (String[] args) {
		int area = triArea(3, 2);
		System.out.println(area);
	}
}
