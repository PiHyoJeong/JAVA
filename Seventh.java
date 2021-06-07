package java_01JUN21;

public class Seventh {

	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 6 ; i+=5) {
			for(int j = 1 ; j < 10 ; j++) {
				for(int k = i ; k <i+4  ; k++) {
					System.out.print(k + " *" + j + "=" + k*j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
