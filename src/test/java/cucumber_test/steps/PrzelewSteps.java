package cucumber_test.steps;

import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class PrzelewSteps {

	@Zakładając("^mam rachunek \"(.*)\" z saldem (\\d+\\.\\d+) PLN$")
	public void setupAccount(String accountType, double amount){
		//...
	}
	
	@Gdy("^przeleję (\\d+\\.\\d+) PLN z rachunku \"(.*)\" na rachunek \"(.*)\"$")
	public void transfer(double amount, String sourceAccount, String destAccount){
		//...
	}
	
	@Wtedy("^powinienem miec saldo (\\d+\\.\\d+) PLN na moim rachunku \"(.*)\"$")
	public void balance(double balance, String account){
		//...
	}
	
}

