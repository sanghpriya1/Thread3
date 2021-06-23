
public class App {
	private int count = 0;
	public synchronized void increment() {
		count++;
	}
	public static void main(String[] args) {
		App app = new App();
		app.dowork();
	}
	public void dowork() {
		Thread t1 = new Thread(new Runnable() {

			
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();
				
				}
				
			}
			
		}
		
				
				
				);
		Thread t2 = new Thread(new Runnable() {

			
			public void run() {
				for(int i = 0; i < 10000; i++) {
					increment();

				}
				
			}
			
		}
				
				
				);
		t1.start();
		t2.start();
		System.out.println("Count is " + count);
		
	}
}
