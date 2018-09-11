import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;

public class Jiggle {

	public static void main(String[] args) throws AWTException {
		
		Jiggle jiggle = new Jiggle();
		
	}
	
	public Jiggle(){
		Timer timer;
		timer = new Timer();
		int seconds = 1;
	    timer.schedule(new Jiggle4Me(), seconds);
	}

	
	class Jiggle4Me extends TimerTask {
	    public void run() {
	    	Robot robot;
			try {
				robot = new Robot();
				robot.mouseMove(MouseInfo.getPointerInfo().getLocation().x - 500,MouseInfo.getPointerInfo().getLocation().y - 1);
				robot.mouseMove(MouseInfo.getPointerInfo().getLocation().x + 100,MouseInfo.getPointerInfo().getLocation().y + 1);
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	  }
}
