package Generic;
/**
 * 
 * @author Ly Tuan
 *	Nguyen mau ham
 */
public class Generic<T> {
	private T t;
	public T get(){
		return t;
	}
	public void set(T t){
		this.t = t;
	}
//	public static void main(String avgs[]){
//		Generic <String> type = new Generic();
//		type.set("adam");
//		System.out.println(type.get());
//		Generic type1 = new Generic();
//		type1.set(10);
//		System.out.println(type1.get());
//		type1.set("ava");
//		System.out.println(type1.get());
//		
//	}
}
