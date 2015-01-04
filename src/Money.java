
class Money implements Expression{

	protected int amount;
	protected String currency;
	
	public Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount){
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount){
		return new Money(amount, "CHF");
	}
	
	public boolean equals(Object object){
		Money money = (Money)object;
		return (this.amount == money.amount) && this.currency().equals(money.currency());
	}
	
	public Money times(int multiplier){
		return new Money(amount * multiplier, currency);
	}
	
	public String currency(){
		return currency;
	}
	
	public String toString(){
		return amount + " "  + currency;
	}
	
	
	public Expression plus(Money addend){
		return new Money(amount + addend.amount, currency);
	}
}
