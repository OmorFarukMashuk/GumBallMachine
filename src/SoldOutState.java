
public class SoldOutState implements State {
	GumBallMachine gumBallMachine;

	public SoldOutState(GumBallMachine gumBallMachine) {
		// TODO Auto-generated constructor stub
		this.gumBallMachine = gumBallMachine;

	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert a quarter, the machine is sold out");



	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't eject, you haven't inserted a quarter yet");


	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but the machine is sold out");



	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");

	}

}
