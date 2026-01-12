package Encapsulation;

public class Policy {
	private int policyId;
	 private double premium;
	 public void setPolicyId(int policyId) {
	 this.policyId = policyId;
	 }
	 public void calculatePremium(int age) {
	 if(age < 25) premium = 3000;
	 else if(age <= 40) premium = 5000;
	 else premium = 7000;
	 }
	 public double getPremium() {
	 return premium;
	 }

}
