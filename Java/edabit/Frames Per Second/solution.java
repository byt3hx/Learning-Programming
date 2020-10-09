public class Challenge {
	public static int frames(int min, int fps) {
		int result = min * (fps * 60);
		return result;
	}
	public static void main(String args) {
		System.out.println(frames(1,1));
	}
}
