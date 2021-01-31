
public class GumBallMachine {
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	int state = SOLD_OUT;
	int count = 0;

	@Override
	public String toString() {
		
		System.out.println("\nGumball Machine");
		System.out.println("Inventory: " + this.count);
		if (this.count > 0) {
			state = NO_QUARTER;
			System.out.println("Machine is waiting for quarter");
		} else {
			System.out.println("Machine is sold out");
		}

		return "";
	}

	public GumBallMachine(int count) {
		// TODO Auto-generated constructor stub

		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}

	}

	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter. The machine is sold out");

		} else if (state == SOLD) {
			System.out.println("Please wait, We are already giving you a gunmball");

		}
	}

	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");

		} else if (state == SOLD_OUT) {
			System.out.println("You can't eject, You haven't inserted a quarter");

		}
		

	}

	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball");
			state = NO_QUARTER;
		} else if (state == NO_QUARTER) {
			System.out.println("You turned, but there is no quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned, but there is no gumball");

		} else if (state == HAS_QUARTER) {
			System.out.println("You turned...");
			state = SOLD;
			dispense();

		}
		


	}

	public void dispense() {
		if (state == SOLD) {
			System.out.println("A gumball comes rolling out the slot");
			count--;
			if (count == 0) {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;

			} else {
				state = NO_QUARTER;
			}
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");

		} else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");

		}

	}

}
