package GenericTest;

public class GenericParameterTest {
	public static <T extends Comparable<T>> T maxium(T number1, T number2,T number3){
		T max =number1;
		if(number2.compareTo(max)>0){
			max = number2;
		}
		if(number3.compareTo(max)>0){
			max = number3;
		}
		return max;
	}
	public static void main(String avgs[]){
		System.out.println("The max of 1, 2 va -1 la: "+maxium ("1","2","-1"));
		System.out.println("The Max of orange, apple, pear is:"+maxium("Orange","Apple","Pear"));
		
	}
}
