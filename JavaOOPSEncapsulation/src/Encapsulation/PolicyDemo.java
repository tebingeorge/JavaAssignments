package Encapsulation;

public class PolicyDemo {
	public static void main(String[] args) {
		 Policy p = new Policy();
		 p.setPolicyId(1);
		 p.calculatePremium(30);
		 System.out.println("Premium: " + p.getPremium());
	}

}
