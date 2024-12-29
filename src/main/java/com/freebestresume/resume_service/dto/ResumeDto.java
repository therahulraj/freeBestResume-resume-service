package com.freebestresume.resume_service.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

public class ResumeDto {

    private String id;

    @Valid
    private PersonalDto personal;

    @Valid
    @Size(max = 5)
    private List<EducationDto> educations;

    @Valid
    @Size(max = 5)
    private List<WorkExperienceDto> workExperiences;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PersonalDto getPersonal() {
        return personal;
    }

    public void setPersonal(PersonalDto personal) {
        this.personal = personal;
    }

    public List<EducationDto> getEducations() {
        return educations;
    }

    public void setEducations(List<EducationDto> educations) {
        this.educations = educations;
    }

    public List<WorkExperienceDto> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperienceDto> workExperiences) {
        this.workExperiences = workExperiences;
    }
}
