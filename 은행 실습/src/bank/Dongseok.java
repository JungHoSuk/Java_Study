package bank;

public class Dongseok extends Bank{
	@Override
	public int showBalance() {
		setMoney(getMoney() / 2);
		return super.showBalance();
	}
}
