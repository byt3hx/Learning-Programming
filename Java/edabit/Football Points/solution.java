public class Program {
  public static int footballPoints(int wins, int draws, int loses) {
		int win = 3;
		int draw = 1;
		int lose = 0;
		int result = (win * wins) + (draw * draws) + (lose * loses);
		return result;
  }
	public static void main (String[] args) {
		int results = footballPoints(3, 4, 2);
		System.out.println(results);
	}
}
