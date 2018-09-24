package com.stackroute.findmeclinic.doctorservices.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


  @Document
public class Doctor {

	
   @Id

   @Email
	private String doctorEmail;
	private String doctorFirstName;
	private String doctorLastName;
	private String doctorName;
    private String doctorPhoneNumber;
	private Date doctorDob;
	private String doctorGender;
	private String doctorQualification;
	private String doctorSpeciality;
	private String doctorLocality;
	private String address;
	private String doctorExperience;
	private List<DoctorAddress> doctorAddress;

	public Doctor() {
		
	}

	

	
	public Doctor(String doctorEmail, String doctorFirstName, String doctorLastName, String doctorName, String doctorPhoneNumber,
			String doctorGender, String locality,String doctorQualification, String doctorSpeciality, String doctorExperience,
			List<DoctorAddress> doctorAddress,String doctorLocality, String address ) {
		super();
		this.doctorEmail = doctorEmail;
		this.doctorFirstName = doctorFirstName;
		this.doctorLastName = doctorLastName;
		this.doctorName = doctorName;
		this.doctorPhoneNumber=doctorPhoneNumber;
		this.doctorGender = doctorGender;
		this.doctorQualification = doctorQualification;
		this.doctorSpeciality = doctorSpeciality;
		this.doctorExperience = doctorExperience;
		this.doctorAddress = doctorAddress;
	this.address=address;
	this.doctorLocality=doctorLocality;
	}




	public Date getDoctorDob() {
		return doctorDob;
	}




	public void setDoctorDob(Date doctorDob) {
		this.doctorDob = doctorDob;
	}




	public String getDoctorLocality() {
		return doctorLocality;
	}




	public void setDoctorLocality(String doctorLocality) {
		this.doctorLocality = doctorLocality;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getDoctorName() {
		return doctorName;
	}




	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}




	


	



	public String getDoctorPhoneNumber() {
		return doctorPhoneNumber;
	}




	public void setDoctorPhoneNumber(String doctorPhoneNumber) {
		this.doctorPhoneNumber = doctorPhoneNumber;
	}



/*
	public String getLocality() {
		return locality;
	}




	public void setLocality(String locality) {
		this.locality = locality;
	}*/




	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public String getDoctorFirstName() {
		return doctorFirstName;
	}

	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}

	public String getDoctorLastName() {
		return doctorLastName;
	}

	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public String getDoctorQualification() {
		return doctorQualification;
	}

	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}

	public String getDoctorExperience() {
		return doctorExperience;
	}

	public void setDoctorExperience(String doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	public List<DoctorAddress> getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(List<DoctorAddress> doctorAddress) {
		this.doctorAddress = doctorAddress;
	}




	@Override
	public String toString() {
		return "Doctor [doctorEmail=" + doctorEmail + ", doctorFirstName=" + doctorFirstName + ", doctorLastName="
				+ doctorLastName + ", doctorName=" + doctorName + ", doctorPhoneNumber=" + doctorPhoneNumber
				+ ", doctorDob=" + doctorDob + ",doctorGender=" + doctorGender
				+ ", doctorQualification=" + doctorQualification + ", doctorSpeciality=" + doctorSpeciality
				+ ", doctorLocality=" + doctorLocality + ", address=" + address + ", doctorExperience="
				+ doctorExperience + ", doctorAddress=" + doctorAddress + "]";
	}





	
	
	
	
	
	
}
