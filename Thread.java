package Sample;

class Multi extends CurrentThread {
	public void run()
	{ System.out.println("thread is running");
	}
	public String setName(String string) 
	{
		return string;

}

public String getName() { return "swathi"; }

public void start() { System.out.println("thread is running");

} 
} public class Thread{

public static void main(String args[])
{ 
	Multi t1=new Multi(); 
	t1.start();
	System.out.println("Name of t1:"+t1.getName());
	t1.setName("MyThread");
System.out.println("After changing name of t1:"+t1.setName("Ammu"));
}
}
