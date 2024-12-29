package com.freebestresume.resume_service.service;

import com.freebestresume.resume_service.dto.EducationDto;
import com.freebestresume.resume_service.dto.PersonalDto;
import com.freebestresume.resume_service.dto.WorkExperienceDto;

import java.util.List;

public interface UpdateResumeService {

    void updatePersonal(String resumeId, PersonalDto personalDto);

    void updateEducations(String resumeId, List<EducationDto> educationDtoList);

    void updateWorkExperiences(String resumeId, List<WorkExperienceDto> workExperienceDtoList);

}
