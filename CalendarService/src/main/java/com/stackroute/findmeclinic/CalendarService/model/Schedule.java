package com.stackroute.findmeclinic.CalendarService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Document
public class Schedule {

    @Id
    private String scheduleId;
    private String description;
    private String workPlace;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String createdBy;
    private Date scheduleCreationDate;
    private long timePerpatient;
    private List<Slot> slots;

    public Schedule(String scheduleId, String description, String workPlace, LocalDateTime startDate, LocalDateTime endDate, long timePerpatient, String createdBy, Date scheduleCreationDate) {
        this.scheduleId = scheduleId;
        this.description = description;
        this.workPlace = workPlace;
        this.startDate = startDate;
        this.endDate = endDate;
        this.setTimePerpatient(timePerpatient);
        this.createdBy=createdBy;
        this.scheduleCreationDate = scheduleCreationDate;
    }



    public Schedule(){}



    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }




    public Date getScheduleCreationDate() {
        return scheduleCreationDate;
    }

    public void setScheduleCreationDate(Date scheduleCreationDate) {
        this.scheduleCreationDate = scheduleCreationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setSlots(List<Slot> slots) {
        this.slots = slots;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }



	public long getTimePerpatient() {
		return timePerpatient;
	}



	public void setTimePerpatient(long timePerpatient) {
		this.timePerpatient = timePerpatient;
	}
}
