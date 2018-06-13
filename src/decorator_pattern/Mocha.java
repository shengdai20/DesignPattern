package decorator_pattern;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	public String getDescription() {
		System.out.println("mochaDescription");
		return beverage.getDescription() + ",Mocha";
	}
	public double cost() {
		System.out.println("mochaCost");
		return 0.20 + beverage.cost();
	}
}
