package strategy;

import strategy.behavior.fly.FlyRocketPowered;
import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuak();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
