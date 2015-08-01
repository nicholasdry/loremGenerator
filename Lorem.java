import java.util.*;

public class Lorem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String [] lorem = {"Lorem", "Ipsum", "Donec", "Sed", "odio", "dui", "Vivamus", "sagittis", "lacus", "vel", "augue", "laoreet", "rutrum", 
							  "faucibus", "facilisis", "Maecenas", "mattis", "magna", "diam", "eget", "risus", "varius", "blandit", "sit", "amet"};
		
		System.out.print("How many words do you want? ");
		int count = input.nextInt();
		System.out.println();

		long startTime = System.currentTimeMillis();

		for (int i=0;i<count;i++) {
			int place = genNum(count);
			System.out.print(lorem[place] + " ");
		}

		System.out.println();

		long endTime = System.currentTimeMillis();

		long totalTime = endTime - startTime;

		double totalSeconds = totalTime*.001;

		System.out.printf("Time to Generate: %1.2f", totalSeconds);
		System.out.println();

	}

	public static int genNum(int count) {

		double num = (int)(Math.floor(Math.random()*20)+1);

		return (int)num;
	}
}