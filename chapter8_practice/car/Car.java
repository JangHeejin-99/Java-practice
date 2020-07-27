package chapter8_practice.car;

public abstract class Car {
	public abstract void turnOn();
	public abstract void go();
	public abstract void stop();
	public abstract void turnOff();
	
	final public void run() {
		turnOn();
		go();
		stop();
		turnOff();
	}
}
