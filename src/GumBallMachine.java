
public class GumBallMachine {

	State noQuarterState;
	State soldState;
	State soldOutState;
	State hasQuarterState;

	State state = soldOutState;
	int count = 0;

	public GumBallMachine(int numberOfGumBalls) {
		// TODO Auto-generated constructor stub
		noQuarterState = new NoQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		hasQuarterState = new HasQuarterState(this);

		this.count = numberOfGumBalls;

		if (numberOfGumBalls > 0) {
			state = noQuarterState;
		}

	}

	@Override
	public String toString() {

		System.out.println("\nGumball Machine");
		System.out.println("Inventory: " + this.count);
		if (this.count > 0) {
			System.out.println("Machine is waiting for quarter");
		} else {
			System.out.println("Machine is sold out");
		}

		return "";
	}

	public void insertQuarter() {
		state.insertQuarter();

	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getState() {
		return state;
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}

}
