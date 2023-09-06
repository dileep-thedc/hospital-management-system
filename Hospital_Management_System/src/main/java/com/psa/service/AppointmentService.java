package com.psa.service;

import java.util.List;

import com.psa.entity.Appointment;

public interface AppointmentService {
	    List<Appointment> getAllAppointments();
	    Appointment getAppointmentById(Long id);
	    Appointment createAppointment(Appointment appointment);
	    Appointment updateAppointment(Long id, Appointment appointment);
	    void deleteAppointment(Long id);
	


}
