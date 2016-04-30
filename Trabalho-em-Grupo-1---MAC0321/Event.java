abstract public class Event{
	long priority;
	
	abstract void action();
	abstract public String description();
	long priority(){
		return priority;
	}
}