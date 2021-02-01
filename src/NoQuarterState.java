
public class NoQuarterState implements State {
	
	GumBallMachine gumBallMachine;
	
	public NoQuarterState(GumBallMachine gumBallMachine) {
		// TODO Auto-generated constructor stub
		this.gumBallMachine = gumBallMachine;
	}



	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
		System.out.println("You inserted a quarter");
		gumBallMachine.setState(gumBallMachine.getHasQuarterState());


	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");


	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there is no quarter");


	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");


	}

}
