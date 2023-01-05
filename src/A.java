import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class A {
public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

	//1. using new keyword
	A a1=new A();
	
	//2.using cloning
	Object a2 = a1.clone();
	
	//3.using Class class
	A a3 = A.class.newInstance();
	
	//4.using constructor class
	A a4 = A.class.getConstructor().newInstance();
	//or
	Constructor a5 = Constructor.class.newInstance();
}
}
