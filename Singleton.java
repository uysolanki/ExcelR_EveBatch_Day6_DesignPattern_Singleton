package day6.DesignPatterns.singleton;

public class Singleton {
	
	private static Singleton singleton=null;
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		if(singleton==null)//true only once and false hereafter
		{
			singleton=new Singleton();
		}
		return singleton;
	}
}
