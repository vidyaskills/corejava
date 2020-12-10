package threadgroup;

public class ThreadGroupDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupDemo runnable=new ThreadGroupDemo();
		ThreadGroup tg1=new ThreadGroup("Parent Thread Group");
		Thread t1=new Thread(tg1,runnable,"one");
		t1.start();
		Thread t2=new Thread(tg1,runnable,"two");
		t2.start();
		Thread t3=new Thread(tg1,runnable,"three");
		t3.start();
		System.out.println("Thread Group Name :"+tg1.getName());
		tg1.list();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}

}
