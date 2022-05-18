package aray;

class GFG {

	 void printGP(int a, int r, int n) {
		int curr_term;
		for (int i = 0; i < n; i++) {
			curr_term = a * (int) Math.pow(r, i);
			System.out.print(curr_term + " ");
		}
		System.out.println();
	}
}

class Tester5 {
	public static void main(String[] args) {
		GFG k = new GFG();
		GFG p = new GFG();
		int a = 1, r = 2, n1 = 5, n2 = 7;
		k.printGP(a, r, n1);
		p.printGP(a, r, n2);
	}

}
