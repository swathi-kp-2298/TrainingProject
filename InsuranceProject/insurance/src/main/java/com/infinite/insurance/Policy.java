package com.infinite.insurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentDetails")
public class Policy {
	
	@Id
	@Column(name="PolicyId")
	private String policyId;
	
	@Column(name="PolicyName")
    private String policyName ;
	
	@Column(name="PolicyType")
    private String policyType ;
	
	@Column(name="PremiumAmount")
    private double premiumAmount ;
	
	@Column(name="PayMode")
    private String payMode;
	
	@Column(name="Term")
    private String term ;
	
	@Column(name="InstallmentAmountPerPayMode")
    private double installmentAmountPerPayMode;
	
	@Column(name="MaturedAmount")
    private double maturedAmount;

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public double getInstallmentAmountPerPayMode() {
		return installmentAmountPerPayMode;
	}

	public void setInstallmentAmountPerPayMode(double installmentAmountPerPayMode) {
		this.installmentAmountPerPayMode = installmentAmountPerPayMode;
	}

	public double getMaturedAmount() {
		return maturedAmount;
	}

	public void setMaturedAmount(double maturedAmount) {
		this.maturedAmount = maturedAmount;
	}
	
	
}
