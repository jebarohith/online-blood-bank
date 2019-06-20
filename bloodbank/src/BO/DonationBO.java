package BO;

import java.util.List;

import Model.BloodDonation;
import Model.Bloodavailable;


public interface DonationBO {

	public boolean checkdet(String hosp,String city,String date,String slot);
	public void Donation(BloodDonation obj);
	public void feedback (BloodDonation obj);
	public List<BloodDonation> listAllfeedback();
	
}