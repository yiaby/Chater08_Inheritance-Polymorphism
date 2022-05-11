package inheritance;

public class VIPCustomer extends Customer {
	private int agentID; 		//VIP고객 상담원 아이디
	double saleRatio;			//할인율
	/*
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;			==>묵시적으로 호출될 디폴트 생성자 Customer()가 정의되지 않았기 때문에 오류발생
		saleRatio = 0.1;                
		System.out.println("VIPcustonmer() 생성자 호출");
	}
	*/
	public VIPCustomer(int customerID, String customerName, int agentID) {
	   super(customerID, customerName); //==>상위 클래스 생성자 호출
	    customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		//System.out.println("VIPcustonmer(int, String, int) 생성자 호출");
	}
	@Override//재정의 한 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//보너스 포인트 직접 적립
		return price - (int)(price * saleRatio); //할인된 가격을 계산하여 반환
	}
	public int getAgentID() {
		return agentID;
	}
	//super로 부모클래스의 메소드 호출하기(여기서는 생략 가능):하위클래스에서 상위클래스와 같은 이름의 메서드일경우, 동일한 상위클래스의 메서드를 가리킬때 사용
	public String VIPCustomerInfo() {
		return super. showCustomerInfo() + "담당 삼당원의 아이디는" + agentID + "입니다.";
		
	}
	
}
