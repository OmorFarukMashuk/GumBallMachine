
public class HasQuarterState implements State {
	
	GumBallMachine gumBallMachine;

	public HasQuarterState(GumBallMachine gumBallMachine) {
		// TODO Auto-generated constructor stub
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert another quarter");


	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		gumBallMachine.setState(gumBallMachine.getNoQuarterState());
		

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned...");
		gumBallMachine.setState(gumBallMachine.getSoldState());

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");


	}

}
