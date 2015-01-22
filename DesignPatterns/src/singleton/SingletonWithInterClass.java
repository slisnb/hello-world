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
	 * ���ڶ��������л�ǰ���һ����
	 * @return
	 */
	public Object readObj(){
		return getInstance();
	}
}
