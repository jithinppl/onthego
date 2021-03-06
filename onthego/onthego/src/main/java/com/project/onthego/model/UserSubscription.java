package com.project.onthego.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.project.onthego.service.Memento;

@Entity
public class UserSubscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Subid;
	private int Card_id;
	private int plan_Id;
	private float Discount;
	private Date Subs_Start_Dt;
	private Date Subs_End_Dt;
	private String state;
	private String reference;

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}

	public int getSubid() {
		return Subid;
	}

	public void setSubid(int subid) {
		Subid = subid;
	}

	public int getCard_id() {
		return Card_id;
	}

	public void setCard_id(int card_id) {
		Card_id = card_id;
	}

	public int getPlan_Id() {
		return plan_Id;
	}

	public void setPlan_Id(int plan_Id) {
		this.plan_Id = plan_Id;
	}

	public float getDiscount() {
		return Discount;
	}

	public void setDiscount(float discount) {
		Discount = discount;
	}

	public Date getSubs_Start_Dt() {
		return Subs_Start_Dt;
	}

	public void setSubs_Start_Dt(Date subs_Start_Dt) {
		Subs_Start_Dt = subs_Start_Dt;
	}

	public Date getSubs_End_Dt() {
		return Subs_End_Dt;
	}

	public void setSubs_End_Dt(Date subs_End_Dt) {
		Subs_End_Dt = subs_End_Dt;
	}

	private int Created_By;
	private Date Created_Date;
	private int Updated_By;
	private Date Updated_Date;

	public int getCreated_By() {
		return Created_By;
	}

	public void setCreated_By(int created_By) {
		Created_By = created_By;
	}

	public Date getCreated_Date() {
		return Created_Date;
	}

	public void setCreated_Date(Date created_Date) {
		Created_Date = created_Date;
	}

	public int getUpdated_By() {
		return Updated_By;
	}

	public void setUpdated_By(int updated_By) {
		Updated_By = updated_By;
	}

	public Date getUpdated_Date() {
		return Updated_Date;
	}

	public void setUpdated_Date(Date updated_Date) {
		Updated_Date = updated_Date;
	}
}
