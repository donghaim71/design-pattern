package strategy.duck;

import strategy.behavior.fly.FlyWithWings;
import strategy.behavior.quak.Quak;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		super.flyBehavior = new FlyWithWings();
		super.quakBehavior = new Quak();
	}

	@Override
	public void display() {
		System.out.println("저는 물오리 입니다");
	}

}
