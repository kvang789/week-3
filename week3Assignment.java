package assignments;

public class week3Assignment {

	public static void main(String[] args) {

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 50};

		System.out.println(ages[ages.length - 1] - ages[0]);


		double sum = 0;
		for (int number : ages) {
			sum += number;

			//System.out.println(sum);
		}

		double average = (sum / ages.length);
		System.out.println("This is the average age: " + average);

		int subtract = 0;
		for (int i = 0; i < ages.length; i++) {

		}
		//new array
		String[] names = new String[6];

		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";

		double sumOfLetters = 0;
		for (String name : names) {
			int nameLength = name.length(); //to find the length of string
			sumOfLetters += nameLength;

			//System.out.println(sumOfLetters);

		}

		double averageNumberLetter = sumOfLetters / names.length; //gives you average
		//added number of letters of each name and divided by the total number of names
		System.out.println("Average number of letters: " + averageNumberLetter);

		String concatenateNames = "";
		for (String name : names ) {

			concatenateNames = concatenateNames + name + " ";


		}
		concatenateNames.trim(); //trim the whitespace at the end of Bob
		System.out.println(concatenateNames.trim());

		String firstElement = names[0];
		String lastElement = names[names.length - 1];
		//System.out.println(firstElement);	
		//System.out.println(lastElement);


		int [] nameLengths = new int[names.length];


		for (int i = 0; i < names.length; i++) {
			String name = names[i];

			int lengthOfEachName = name.length();
			nameLengths[i] =  lengthOfEachName;


			System.out.println(names[i] + nameLengths[i]);
		}

		int sumOfName = 0;
		for (int name : nameLengths) {
			sumOfName += name;

		}
		System.out.println("Sum of all elements in array: " + sumOfName);
		
		//System.out.println(wordConcatenated("Hello", 3));; //test for #7
	
	}
		
		//7. write a method that takes a String, word, and int, n, as arguments 
		//and returns the word concatenated to itself n number of times
	public static String wordConcatenated(String word, int n) {
		return (word.repeat(n));
	}

		//8. write a method that takes two Strings, firstName and lastName, and returns a full name with space between
	
	public static String fullName(String firstName, String lastName) {
		 return "firstName" + " " + "lastName";
		 
	}
		//9. write a method that takes an array of int and returns true if the sum of all the
		//ints in the array is great than 100
	public static boolean arrayisgreaterthanhundred(int[] array) {
		int sumOfAllInts = 0;
		for (int n : array) {
			sumOfAllInts += n;
			if (sumOfAllInts > 100);
			
		}
		return true;
}

	//10. write a method that takes an array of double and returns the average of all elements in the array
	public static double averageAllElement(double[] array) {
		double sum = 0;
		for (double n : array) {
			sum += n;
		}
		return sum / array.length;
		
	}
	//11. write a method that takes two arrays of double and returns true if the average of 
	//the elements in the first array is greater than the average of the elements in the second array
	public static boolean averageFirstArrayGreaterThanAverageSecondArray(double[] firstArray, double[] secondArray) {
		double sumFirstArray = 0;
		double sumSecondArray = 0;
		for (double a : firstArray) {
			for (double b : secondArray) {
				sumFirstArray += a;
				sumSecondArray += b;
				return sumFirstArray /firstArray.length > (sumSecondArray / secondArray.length);
			}

		}


		return false;

	}
	// Question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {		
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}
		return false;
		
		
	}
	
	//Question 13: Find the smallest size shoe
	public static int smallestShoeSize(int[] sizes) {
		int smallest = sizes[0];
		for (int size : sizes) {
			if (size < smallest) {
				smallest = size;
			}
		}
		return smallest;
	
}	
	
}
		
		



