import java.util.*;

public class Lorem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.print("How many words do you want? ");
		int count = input.nextInt();
		System.out.println();


		for (int i=0;i<count;i++) {
			System.out.print(genWord() + " ");
		}

		System.out.println();
	}

    public static String genWord(){
		String [] lorem = {"Lorem", "Ipsum", "Donec", "Sed", "odio", "dui", "Vivamus", "sagittis", "lacus", "vel", "augue", "laoreet", "rutrum", 
							  "faucibus", "facilisis", "Maecenas", "mattis", "magna", "diam", "eget", "risus", "varius", "blandit", "sit", "amet"};

        return lorem[genNum(lorem.length)];
    }

	public static int genNum(int numElements) {

		double num = (int)(Math.floor(Math.random()*numElements-1)+1);

		return (int)num;
	}
}
