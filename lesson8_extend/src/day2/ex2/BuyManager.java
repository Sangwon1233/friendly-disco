package day2.ex2;

public class BuyManager extends Manager {
	public BuyManager(String name) {
		super(name);
	}
	
	@Override
	void work() {
		System.out.println("구매 업무를 합니다");
		
	}
	
	
}