public class Challenge {
	public static boolean profitableGamble(double prob, double prize, double pay) {
		if (prob * prize > pay)
			return true;
		else
			return false;
	}
}
