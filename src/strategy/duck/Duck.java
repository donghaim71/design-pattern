package strategy.duck;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.quak.QuakBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuakBehavior quakBehavior;
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuakBehavior(QuakBehavior qb) {
		this.quakBehavior = qb;
	}
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuak() {
		quakBehavior.quak();
	}
	
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
}
