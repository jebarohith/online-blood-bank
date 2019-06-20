package BO;

import Model.registration;

public interface RegistrationBO {

	public void newregistration(registration obj);
	public String getpasswordbyloginId(String loginid);
	
}