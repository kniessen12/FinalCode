package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	RateDomainModel x = new RateDomainModel();
	
	public RateException(RateDomainModel x){
		this.x = x;
	}
	
	public RateDomainModel getRateDomainModel(){
		return x;
	}
}

