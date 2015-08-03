import java.util.*;

public class InputWordGen {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int wordAmount = 20;
		String [] words = new String[wordAmount];
		String word;
		int wordPlace = 0;
		System.out.println("Enter up to 20 words. When done entering, type 0: ");

		for (int i=1;i<21;i++) {
			System.out.print(i + " > ");
			word = input.next();
			if (word.equals("0")) {
				break;
			}
			words[wordPlace] = word;
			wordPlace++;
		}

		String [] printWords = new String[wordPlace];

		for (int k=0;k<words.length;k++) {
			if (words[k] == null) {
				break;
			}
			printWords[k] = words[k];
		}

		System.out.print("How many words do you want? ");
		int count = input.nextInt();
		System.out.println();


		for (int i=0;i<count;i++) {
			System.out.print(genWord(printWords) + " ");
		}

		System.out.println();
	}

    public static String genWord(String[] array){
        return array[genNum(array.length)];
    }

	public static int genNum(int numElements) {

		double num = (int)(Math.floor(Math.random()*numElements-1)+1);

		return (int)num;
	}
}
