public class Challenge {
	public static int howManySeconds(int hours) {
		int second = 3600;
		int result = second * hours;
		return result;
  }
	public static void main(String[] args){
		System.out.println(howManySeconds(2));
	}
}
