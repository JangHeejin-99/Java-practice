package chapter7_practice.arrayList;

public class VIPCustomer extends Customer {
	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo()+"�׸��� "+super.customerName+"���� ������ "+agentID+"�Դϴ�.";
	}
	
	public int getAgentId() {
		return agentID;
	}
}
