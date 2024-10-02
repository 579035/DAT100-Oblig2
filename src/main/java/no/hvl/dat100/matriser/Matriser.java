package no.hvl.dat100.matriser;

public class Matriser {

	public static void skrivUt(int[][] matrise) {
		
		for (int [] i : matrise) {
			System.out.print("[ ");
			for (int j : i) {
				System.out.print(j+" ");
			}
			System.out.println("]");
		}
	}

	public static String tilStreng(int[][] matrise) {
		String matriseTxt ="";
		
		for (int[] i : matrise) {
			String tabellTxt="";
			for (int j : i) {
				tabellTxt = tabellTxt+j+" ";
			}
			matriseTxt=matriseTxt+tabellTxt+"\n";
		}
		return matriseTxt;
	}

	public static int[][] skaler(int tall, int[][] matrise) {
		
		
		int [][] temp = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
		    temp[i] = matrise[i].clone();
		}
		
		for (int i = 0; i<temp.length;i++) {
			for (int j = 0; j<temp[i].length;j++) {
				temp[i][j]=temp[i][j]*tall;
			}
		}
		return temp;
	}

	public static boolean erLik(int[][] a, int[][] b) {

		if (a==b) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static int[][] speile(int[][] matrise) {

		int [][] temp = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
		    temp[i] = matrise[i].clone();
		}
		
		for (int i = 0; i <temp.length;i++) {
			for (int j = 0; j< temp[i].length;j++) {
				temp[i][j]=matrise[j][i];
			}
		}
		
		return temp;
	}

	public static int[][] multipliser(int[][] a, int[][] b) {
		
		int[][] ab = new int[a.length][b[0].length];
		for (int i = 0; i<ab.length;i++) {
			for(int j = 0; j<ab[i].length;j++) {
				ab[i][j] = multipliserCelle(a, b, i, j);
			}
		}
		
		return ab;

	}
	
	public static int multipliserCelle(int[][] a, int[][] b, int rad, int kolonne) {
		int celle =0;
		
		for (int i = 0; i<b.length;i++) {
			celle += a[rad][i] * b[i][kolonne];
		}
		
		return celle;
	}
}
