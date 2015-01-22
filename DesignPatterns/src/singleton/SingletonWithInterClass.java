package singleton;

public class SingletonWithInterClass {
	private SingletonWithInterClass() {
		super();
	}
	private static class SingletonFactory{
         private static SingletonWithInterClass singleton=new SingletonWithInterClass();
	}
	public static SingletonWithInterClass getInstance(){
		return SingletonFactory.singleton;
	}
	/**
	 * 用于对象在序列化前后的一致性
	 * @return
	 */
	public Object readObj(){
		return getInstance();
	}
}
