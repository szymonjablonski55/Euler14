
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

		int maks = 1000000; 
		int  roz = 0, max = 1, j = 0;
		for (int i = 2; i < maks; i++) {
			roz = chainroz(i);
			if (roz > max) {
				max = roz;
				j = i;
			}
		}
		System.out.println("numer dla najdłuższego chain'a: " + j);
	}

	private static int chainroz(int n) {

		long num = n;
		List<Long> list = new ArrayList<>();
		int roz = 0;
		while (num != 1) {
			list.add(num);
			
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = 3 * num + 1;
			}
		}
		roz = list.size();
		return roz;
	}

}
