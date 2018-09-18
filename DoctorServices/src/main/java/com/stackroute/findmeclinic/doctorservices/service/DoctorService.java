package com.stackroute.findmeclinic.doctorservices.service;




import com.stackroute.findmeclinic.doctorservices.exception.DoctorAlreadyExistException;
import com.stackroute.findmeclinic.doctorservices.exception.DoctorNotFoundException;
import com.stackroute.findmeclinic.doctorservices.model.Doctor;
import com.stackroute.findmeclinic.doctorservices.model.DoctorAddress;

public interface DoctorService {

	
	public Doctor createDoctorDetails(Doctor doctor) throws DoctorAlreadyExistException ;
	
	public boolean addDoctorDetails(String doctorLicenceId,DoctorAddress doctorAddress);
	
	public Doctor updateDoctorDetails(Doctor doctor) throws DoctorNotFoundException;
	
	public Doctor getDoctorDetail(String doctorLicenceId) throws DoctorNotFoundException;
	
	
}