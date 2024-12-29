package com.freebestresume.resume_service.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Education {

    @NotEmpty
    @Size(max = 50)
    private String instName;

    @Size(max = 50)
    private String instLocation;

    @Size(max = 50)
    private String degreeName;

    @Size(max = 50)
    private String fieldOfStudy;

    @Size(max = 30)
    private String endDate;

    @Size(max = 30)
    private String grade;

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public String getInstLocation() {
        return instLocation;
    }

    public void setInstLocation(String instLocation) {
        this.instLocation = instLocation;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
