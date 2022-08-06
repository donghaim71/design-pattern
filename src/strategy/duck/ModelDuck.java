package strategy.duck;

import strategy.behavior.fly.FlyNoWay;
import strategy.behavior.quak.Quak;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		super.flyBehavior = new FlyNoWay();
		super.quakBehavior= new Quak();
	}

	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다");
	}

}
