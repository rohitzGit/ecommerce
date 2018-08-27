package com.navz.project.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//Entity class
@Entity
@Table(name = "CompanyRevenue")
public class CompanyRevenue extends KeyEntity {

	@Column(name = "Revenue_Month", nullable = false)
	private String _month;
	
	@Column(name = "revenue", nullable = false)
	private volatile double revenue;
	
	@Column(name = "expense")
	private volatile double expense;
	
	@Column(name = "margins")
	private volatile double margins;

	public String get_month() {
		return _month;
	}

	public void set_month(String _month) {
		this._month = _month;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Double getExpense() {
		return expense;
	}

	public void setExpense(Double expense) {
		this.expense = expense;
	}

	public Double getMargins() {
		return margins;
	}

	public void setMargins(Double margins) {
		this.margins = margins;
	}

}
