public class Challenge {
	public static int nextEdge(int side1, int side2) {
		int maxRange = side1 + side2 -1;
		return maxRange;
  }
	public static void main(String[] args) {
		int edge = nextEdge(8,10);
		System.out.println(edge);
	}
}
