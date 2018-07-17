package com.neusoft.bean;

import java.sql.Timestamp;

public class Deal {
	int oid;
	int lid;
	String openid;
	double total;
	int cid;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	double actual;
	String status;
	Timestamp ordertime;
	int qid;
	String transactionid;
	String nickname;
	String tel;
	int branchid;

	public Deal(int lid, String openid, double total, double actual, String status,
			Timestamp ordertime, int qid, String transactionid, String nickname, String tel, int branchid) {
		super();
		this.lid = lid;
		this.openid = openid;
		this.total = total;
		this.actual = actual;
		this.status = status;
		this.ordertime = ordertime;
		this.qid = qid;
		this.transactionid = transactionid;
		this.nickname = nickname;
		this.tel = tel;
		this.branchid = branchid;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getActual() {
		return actual;
	}
	public void setActual(double actual) {
		this.actual = actual;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
}
