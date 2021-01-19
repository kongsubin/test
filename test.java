import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String[] list = {"i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili"};
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String array[] = str.split(" ");
		String result ="";

		for(int i=0; i<array.length; i++) {
			if(Arrays.asList(list).contains(array[i])){
				if(i == 0) {
					char temp = array[i].charAt(0);
					result += Character.toString(temp);
				}
			}else {
				char temp = array[i].charAt(0);
				result += Character.toString(temp);
			}
			
		}
		System.out.println(result.toUpperCase());
	}

}
