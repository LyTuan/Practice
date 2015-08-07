package GenericTest1;

import javax.sound.midi.MidiDevice.Info;

public class MainGeneric {
	public static void main(String avgs[]){
		GenericClassTest<String> mg1 = new GenericClassTest<String>();
		mg1.set("cat");
		System.out.println(mg1.get());
		GenericClassTest <Integer> mg2 = new GenericClassTest<Integer>();
		mg2.set(new Integer(4));
		System.out.println(mg2.get());
		
		
	}
}
