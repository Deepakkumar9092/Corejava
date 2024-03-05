package com.exceptionhandling;

import java.security.cert.CertificateException;

public class NoDataFound extends CertificateException{
	
	public NoDataFound() {
		
	}
	public NoDataFound(String msg) {
		super(msg);
	}
}
