package witharraylist;

public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer(int custmomerID, String customerName) {
		super(custmomerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	//재정의 한 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
