package GenericTest;

public class GenericMethodTest {
	public static <T>void printArray(T[] array){
		for(T element: array){
			System.out.print(element);
			System.out.print(" ");
		}
		System.out.println();
	}
	public static void main(String avgs[]){
		Integer []array ={1,3,4,5,6};
		String []array1 ={"mot","hai","ba","bon"};
		Double []array2 ={1.2,3.6,6.1}; 
		int []array3 ={1,2,3,4};
		char []array4={'H','e','l','l','o'};
		System.out.println("The elements of array are:");
		printArray(array);
		System.out.println("The elements of array1 are:");
		printArray(array1);
		System.out.println("The elements of array2 are:");
		printArray(array2);
		System.out.println("The elements of array3 are:");
		
	}
}	
