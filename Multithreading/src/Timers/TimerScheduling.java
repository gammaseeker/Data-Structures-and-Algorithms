package Timers;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class TimerScheduling {

	private static int ctr;
	
	public static void main(String[] args)
	{
		Timer timer = new Timer();
		
			timer.schedule(new TimerTask(){

				@Override
				public void run() {
					ctr++;
					System.out.println("Counter: " + ctr);
					
				}
					}, 500, 1000);
		
		
	}
	
}
