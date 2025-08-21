package day05;

class TimerProgram{
	String[] tasks = {
		"Breakfast time",
		"Join Class Class Now it's ",
		"Now it's time for Lunch",
		"Practice Coding Questions",
		"Teak Break",
		"Go and Watch My Learning Videos"
		};
	
	void timerSetting() {
		String[] timerTimings = {"8:00","9:00","10:00","11:00","12:00","13:00","14:00","15:00","16:00","17:00","18:00"};
		for(int i = 0;i < tasks.length;i++) {
			
			System.out.println("Current time is "+timerTimings[i]);
			System.out.println("Your task at "+tasks[i]+"\n");
		}
		System.out.println("Yeahh!! You have completed all tasks for today. Enjoy your time...");
	}
}

public class TimerProgramMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerProgram tp = new TimerProgram();
		tp.timerSetting();
	}
}

