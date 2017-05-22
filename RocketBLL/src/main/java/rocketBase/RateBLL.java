package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		

		for (java.util.Iterator<RateDomainModel> it = rates.iterator(); it.hasNext();){
			RateDomainModel rt = (RateDomainModel) it.next();
			if(rt != null && (rt.getiMinCreditScore() == GivenCreditScore)){
				dInterestRate = rt.getdInterestRate();
			}
		}
		
		if(dInterestRate == 0.0){
			
			throw new RateException(null);
		}
		
		return dInterestRate;
		
		
	}
	
	
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
