package Generic;

public class GenericMethod {
	public static <T>boolean isEquals(Generic <T> g1, Generic <T>g2){
		return g1.get().equals(g2.get());
	}
	public static void main(String avgs[]){
		Generic <String>g1 = new Generic <>();
		g1.set("Pankai");
		Generic <String>g2 = new Generic <>();
		g2.set("Pankai");
		boolean isEquals = GenericMethod.isEquals(g1, g2);
		System.out.println(isEquals);
	}
}
