public class Challenge {
	public static int convert(int minutes) {
		int second = 60;
		int result = minutes * second;
		return result;
  }
	public static void main(String[] args) {
		int minute = convert(5);
		System.out.println(minute);
	}
}
