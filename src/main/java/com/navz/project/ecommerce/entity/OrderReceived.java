package com.navz.project.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OrderReceived")
public class OrderReceived extends KeyEntity {
	
	private int orderReceived;
	private String dataReceived;

	public int getOrderReceived() {
		return orderReceived;
	}

	public void setOrderReceived(int orderReceived) {
		this.orderReceived = orderReceived;
	}

	public String getDataReceived() {
		return dataReceived;
	}

	public void setDataReceived(String dataReceived) {
		this.dataReceived = dataReceived;
	}

}
