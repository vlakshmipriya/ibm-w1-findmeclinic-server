package com.stackroute.findMeClinic.doctorAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.findMeClinic.doctorAuth.model.Doctor;

@Repository
public interface DoctorAuthRepository extends JpaRepository<Doctor, String>{

	public Doctor findDoctorBydoctorPhoneNumber(String doctorPhoneNumber);
	
}