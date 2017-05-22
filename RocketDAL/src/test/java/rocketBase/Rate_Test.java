package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void test1(){
		ArrayList<RateDomainModel> rts = RateDAL.getAllRates();
		assert(rts.size() > 0);
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		assertEquals(rates.get(0).getdInterestRate(),7.00,0.01);
		assertEquals(rates.get(1).getdInterestRate(),6.00,0.01);
		assertEquals(rates.get(2).getdInterestRate(),6.25,0.01);
		assertEquals(rates.get(3).getdInterestRate(),5.25,0.01);
		assertEquals(rates.get(4).getdInterestRate(),5.50,0.01);


	}
}
