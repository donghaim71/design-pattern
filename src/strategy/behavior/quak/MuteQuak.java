package strategy.behavior.quak;

public class MuteQuak implements QuakBehavior {

	@Override
	public void quak() {
		System.out.println("<< 조용~ >>");
	}

}
