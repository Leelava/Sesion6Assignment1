package Session6Assignment1;
// Program to use an array and print only even numbers
public class Even_Integer_Array {

	public static void main(String[] args) {
		int even[]=new int[10]; // Array even with size 10;
		int i;
		System.out.println("The array elements (even numbers )are");
		for (i =0; i<even.length ; i++)//loop to populate array with 10 elements
		{
			even[i] = 2*(i+1); // expression to generate even numbers
			System.out.print(" " +even[i]);// print all the elements of array "even".
		}

	}

}
