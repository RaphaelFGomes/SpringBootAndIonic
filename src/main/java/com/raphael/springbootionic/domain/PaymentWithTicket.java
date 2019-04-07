package com.raphael.springbootionic.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.raphael.springbootionic.domain.enums.PaymentState;

@Entity
public class PaymentWithTicket extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Date expiredDate;
	private Date paymentDate;
	
	public PaymentWithTicket () {
		
	}

	public PaymentWithTicket(Integer id, PaymentState state, Request request, Date expiredDate, Date paymentDate) {
		super(id, state, request);
		this.expiredDate = expiredDate;
		this.paymentDate = paymentDate;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}
