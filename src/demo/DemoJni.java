package demo;

public class DemoJni {
	
	public native static String sayHello(String name);
	
	static {
		try {
			System.loadLibrary("sayHello");
		} catch (Exception e) {
			System.err.println("load native library [sayHello] failed.");
			e.printStackTrace();
		}
		System.out.println("load native library [sayHello] succeed.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Heloo " + sayHello("Dean."));
		
	}

}