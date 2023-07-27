package com.Sb101;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class OnlinEpayment {
	
	public <T extends Payment>  void doTransactions(List<T> payments) {
		for(Payment payment:payments) {
			payment.doPayment();
		}
	}
	
	public static void main(String[] args){
			
			OnlinEpayment demo= new OnlinEpayment();
			
			 List<CardPayment> cardPayments = List.of(
		                new CardPayment(8000),
		                new CardPayment(7000)
		                );
			  demo.doTransactions(cardPayments);
			  
			  List<CashPayment> cashPayments = List.of(
		                new CashPayment(6000),
		                new CashPayment(9000)
		        );

		        // Call doTransactions method with the List of CashPayment objects
		        demo.doTransactions(cashPayments);
		    }

			
			
	}


