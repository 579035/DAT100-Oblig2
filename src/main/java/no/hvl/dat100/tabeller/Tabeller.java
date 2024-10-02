package no.hvl.dat100.tabeller;

public class Tabeller {
	
	
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i : tabell) {
			System.out.print(i);
		}
		System.out.print(" ]");
	}

	public static String tilStreng(int[] tabell) {
		String tabellTxt = "[";
		for (int i = 0; i<tabell.length;i++) {
			tabellTxt = tabellTxt+tabell[i]; {
			if (i<tabell.length-1)
				tabellTxt = tabellTxt+",";
			}
		}
		tabellTxt = tabellTxt+"]";
		return tabellTxt;
	}

	public static int summer(int[] tabell) {
		
		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		return sum;
		
	}

	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnesTall = false;
			for (int i : tabell) {
				if (i==tall) {
					finnesTall=true;
				}
			}
		return finnesTall;
	}

	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i<tabell.length; i++) {
			if (tabell[i]==tall) {
				return i;
			}
		}
		return -1;
	}

	public static int[] reverser(int[] tabell) {
		
		int[] tabR = new int [tabell.length];
		int j = tabell.length;
		for (int i = 0; i<tabell.length;i++) {
			tabR[j-1] = tabell[i];
			j--;	
		}

		return tabR;
	}

	public static boolean erSortert(int[] tabell) {
		int j = 0;
		boolean sortert = false;
		for (int i = 0; i<tabell.length-1; i++) {
			if (tabell[i]>tabell[i+1]) {
				j+=1;
			}
		}
		if (j<=0) {
			sortert = true;
		}
		return sortert;

	}

	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		int[] tabell3 = new int [tabell1.length+tabell2.length];
		for (int i = 0; i<tabell1.length; i++) {
			tabell3[i] = tabell1[i];
		}
		
		for (int i = 0; i<tabell2.length;i++) {
			tabell3[tabell1.length+i] = tabell2[i];
		}

		return tabell3;
	}
}
