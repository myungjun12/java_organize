package ncs.test13;

public class AmountNotEnough extends Exception {
	//양이 충분하지 않을 때 표시하는 에러를 개발자가 만들어준 것 
	
	public AmountNotEnough(String msg) {
		//if new throws
		super(msg);
	}
}
