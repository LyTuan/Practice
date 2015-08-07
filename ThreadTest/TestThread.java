package ThreadTest;

public class TestThread {
	public  static void main(String avgs[]){
		RunnableDemo T1 = new RunnableDemo("Thread-1");
		T1.start();
		RunnableDemo T2 = new RunnableDemo("Thread-2");
		T2.start();
	}
}
