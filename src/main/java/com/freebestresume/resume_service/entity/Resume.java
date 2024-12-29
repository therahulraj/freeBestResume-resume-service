package com.freebestresume.resume_service.entity;

import com.freebestresume.resume_service.dto.EducationDto;
import com.freebestresume.resume_service.dto.WorkExperienceDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "resumes")
public class Resume {

    @Id
    private String id;

    @Valid
    private Personal personal;

    @Valid
    @Size(max = 5)
    private List<Education> educations;

    @Valid
    @Size(max = 5)
    private List<WorkExperience> workExperiences;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }
}
