package BO;

import java.util.List;

import Model.Bloodavailable;

public interface bloodBO {

	public List<Bloodavailable> availability(Bloodavailable obj);
	public void requirement (Bloodavailable obj);
	public List<Bloodavailable> listAllRequiredBloodDetails();
	public void Donation(Bloodavailable obj);

}