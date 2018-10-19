import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		String name = "";
		int choice = 0;
		Scanner reader = new Scanner(System.in);
		
		String namePrompt = "Please enter your name";
		// init string arrays
		String[] choices = new String[] {"1) Door 1","2) Door 2","3) Door 3","Exit App"};
		String[] opts = new String[] {"A new car", "A gold fish", "Nothing!", "THanks for playing"};
		
		//while loops to repeat propmt 
		//IsValidIn method checks if input "name" is valid
		while(!IsValidIn(name)) {
			Prnt(namePrompt);
			name = InStr();
		}
		
		//repeat earlier method for "choice" 
		while(!IsValidIn(choice)) {
			Prnt("Hello " + name + "! Please choose an option below!");
			PrntArr(choices);
			choice = InInt();
		}
		
		//takes in int choice and prints that element in arr. 
		GetResult(choice, opts);
		
	}
	
	//quicker way to print to console
	public static void Prnt(String str) {
		System.out.println(str);
	}
	
	//get user input string
	public static String InStr() {
		Scanner reader = new Scanner(System.in);
		return reader.nextLine();
	}
	
	//get user input int
	public static int InInt() {
		Scanner reader = new Scanner(System.in);
		return reader.nextInt();
	}
	
	//validate input 
	public static boolean IsValidIn(String input) {
		if(input.isEmpty() || input == null) {
			return false;
		}
		return true;
	}
	
	//validate input (overloaded takes int param)
		public static boolean IsValidIn(int input) {
			if(input < 1 || input > 4) {
				return false;
			}
			return true;
		}
		
	public static void PrntArr(String[] arr) {
		for(int k = 0; k < arr.length; k++) {
			Prnt(arr[k]);
		}
	}
	
	public static void GetResult(int input, String[] arr) {
		Prnt(arr[input - 1]);
	}
	
}
		