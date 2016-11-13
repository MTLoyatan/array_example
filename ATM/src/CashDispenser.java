
public class CashDispenser {
	// the default initial number of bills in the cash dispe
	private final static int INITIAL_COUNT = 500;
	private int count; // number of $20 bills remaining
	// no-argument CashDispenser constructor initializes coun
	public CashDispenser()
	{
	count = INITIAL_COUNT; // set count attribute to defau
	} // end CashDispenser constructor
	// simulates dispensing of specified amount of cash
	public void dispenseCash( int amount )
	{
	int billsRequired = amount / 20; // number of $20 bill
	count -= billsRequired; // update the count of bills
	} // end method dispenseCash
	// indicates whether cash dispenser can dispense desired
	public boolean isSufficientCashAvailable( int amount )
	{
	int billsRequired = amount / 20; // number of $20 bill
	if ( count >= billsRequired
	)
	return true; // enough bills available
	else
	return false; // not enough bills available
	} // end method isSufficientCashAvailable

}
