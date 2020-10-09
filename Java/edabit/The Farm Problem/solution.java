public class Challenge {
	public static int animals(int chickens, int cows, int pigs) {
		int chicken = 2;
		int cow = 4;
		int pig = 4;
		int result = (chicken * chickens) + (cow * cows) + (pig * pigs);
		return result;
	}
	public static void main(String[] args) {	
		
		int results = animals(5, 2, 8);
		System.out.println(results);
	}
}
