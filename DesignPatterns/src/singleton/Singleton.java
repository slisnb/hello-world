package singleton;

import java.util.Vector;

public class Singleton {
	private static Singleton singleton = null;
	private Vector propertyies=null;
	private Singleton() {
		super();
	}
	public static Singleton getInstance(){
		if(singleton==null){
			syncInit();
		}
		return singleton;
	}
	private static synchronized void syncInit() {
		if(singleton==null){
			singleton = new Singleton();
		}
	}
	public Vector getProperties() {
		return propertyies;
	}
   public void updateProperties(){
	   Singleton singleton=new Singleton();
	   propertyies = singleton.getProperties();
   }
}
