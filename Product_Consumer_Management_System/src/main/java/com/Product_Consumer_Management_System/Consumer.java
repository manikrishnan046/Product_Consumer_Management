package com.Product_Consumer_Management_System;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Consumer {
	@Id
	private int cId;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcCont() {
		return cCont;
	}

	public void setcCont(int cCont) {
		this.cCont = cCont;
	}

	private String cName;
	private int cCont;

	@Override
	public String toString() {
		return "Consumer[cId=" + cId + "cName=" + cName + "cCont=" + cCont + "]";
	}

}
