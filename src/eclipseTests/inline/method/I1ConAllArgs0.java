package I1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class I1ConAllArgs0 {
	@SuppressWarnings("unused")
	public void someMethod() {
		/*1: InlineMethod(anotherMethod) :1*/
		int oldName = anotherMethod();
		/*:1:*/
	}
	public int anotherMethod(){
		String oldName="inlined";
		System.out.println(oldName);
		return oldName.length();
	}


}
