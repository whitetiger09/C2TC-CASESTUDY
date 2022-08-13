package com.tns.application;

import com.tns.framwork.ShopFactory;
import com.tns.framwork.PrimeAcc;
import com.tns.framwork.NormalAcc;

public class Main {

	public static void main(String[] args) {

//		a. Assign instance of GSShopFactory to ShopFactory reference.
			ShopFactory shopObj = new GSShopFactory();

//		b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
			PrimeAcc primeAccObj = new GSPrimeAcc(1234, "prime_account_name", 1000f, true);
//			PrimeAcc primeAcc = shopFactory.getPrimeAcc(0, "prime", 0, true);
//			PrimeAcc primeAccObj = new GSPrimeAcc();

//		c. Instantiate GSNormalAcc and refer it through reference NormalAcc.
			NormalAcc normalAccObj = new GSNormalAcc(5678, "normal_account_name", 10000f, NormalAcc.getDeliveryCharges());

//		d. Invoke bookProduct() method.
			primeAccObj.bookProduct(5000.0f);
			normalAccObj.bookProduct(5000.0f);

//		e. Invoke toString() method.
//			System.out.println(primeAccObj.toString());
			primeAccObj.toString();
			normalAccObj.toString();
		}
	}

