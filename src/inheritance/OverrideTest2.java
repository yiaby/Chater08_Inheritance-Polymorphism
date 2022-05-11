package inheritance;

public class OverrideTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);	//VIP 고객 생성
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + "님이 지불해야하는 금액은" + vc.calcPrice(10000) + "원 입니다.");
	}
	/*
	 * [출력 결과]=>나몰라님이 지불해야하는 금액은9000원 입니다.
	 * ※가상메서드(virtual method)
	 * =>재정의된 메서드는 실제 인스턴스에 해당하는 메서드가 호출
	 */
}
