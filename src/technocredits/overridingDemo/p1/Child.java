package technocredits.overridingDemo.p1;

public class Child extends Parent {
	
	@Override
	Parent m1(){
		return new Parent();
	}
}
