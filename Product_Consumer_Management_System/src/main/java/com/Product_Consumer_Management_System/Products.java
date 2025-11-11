package com.Product_Consumer_Management_System;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Products {
	@Id
	private int pId;
	private String pName;
	private int pPrice;

	public int getpId() {
		return pId;
	}

	@OneToOne
	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	@Override
	public String toString() {
		return "Products[pId=" + pId + "pName=" + pName + "pPrice=" + pPrice + "]";
	}

}
