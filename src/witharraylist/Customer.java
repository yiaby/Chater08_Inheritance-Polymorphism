package witharraylist;

public class Customer {

	protected int customerID;  		//고객 ID
	protected String customerName;	//고객 이름
	protected String customerGrade;	//고객 등급
	int bonusPoint;					//보너스 포인트
	double bonusRatio;				//적립 비율
	
	public Customer() {
		initCustomer();//고객 등급과 보너스 포인트 적립룰 지정함수 호출
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; //보너스 포인트 계산
		return price;
	}
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "입니다.";
	}
}
