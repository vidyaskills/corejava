package synchronizationdemo;

public class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run(){
		this.t.printTable(5);
	}
}
