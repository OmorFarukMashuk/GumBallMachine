
public class SoldState implements State {

	GumBallMachine gumBallMachine;

	public SoldState(GumBallMachine gumBallMachine) {
		// TODO Auto-generated constructor stub
		this.gumBallMachine = gumBallMachine;

	}
	

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Please wait, we are already giving you a gumball");

	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you already turned the crank");
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn't get you another gumball");
		
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
//		gumBallMachine.releaseBall();
		if(gumBallMachine.getCount() > 0) {
			gumBallMachine.releaseBall();
			gumBallMachine.setState(gumBallMachine.getNoQuarterState());
			if(gumBallMachine.getCount() == 0)gumBallMachine.setState(gumBallMachine.getSoldOutState()); 
		}
//		else {
//			System.out.println("Oops, out of gumballs");
//			gumBallMachine.setState(gumBallMachine.getSoldOutState());
//		}
		

		
	}

}
