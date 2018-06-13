package decorator_pattern;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		System.out.println("whipDescription");
		return beverage.getDescription() + ",Whip";
	}
	public double cost() {
		System.out.println("whipCost");
		return 0.10 + beverage.cost();
	}
}