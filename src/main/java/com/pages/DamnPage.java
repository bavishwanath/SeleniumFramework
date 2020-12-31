package com.pages;

public class DamnPage extends HomePage{
	
	String saml = super.name;
	

	public static void main(String[] args) {
		DamnPage dm = new DamnPage();
		
		System.out.println(dm.saml );
		dm.saml = "TENET";
		System.out.println(dm.saml );
		
		System.out.println("gty");
		
		
	}

	
}
