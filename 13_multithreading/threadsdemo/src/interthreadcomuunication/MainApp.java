package interthreadcomuunication;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c=new Customer();
		new Thread(){
			public void run(){
				c.withdraw(15000);				
			}
		}.start();
		new Thread(){
			public void run(){
				c.deposit(10000);
			}
		}.start();
		
	}

}
