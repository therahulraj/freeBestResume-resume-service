package com.freebestresume.resume_service.service.impl;

import com.freebestresume.resume_service.constant.CommonVariables;
import com.freebestresume.resume_service.dto.EducationDto;
import com.freebestresume.resume_service.dto.PersonalDto;
import com.freebestresume.resume_service.dto.WorkExperienceDto;
import com.freebestresume.resume_service.repository.ResumeRepository;
import com.freebestresume.resume_service.service.UpdateResumeService;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpdateResumeServiceImpl implements UpdateResumeService {

    private ResumeRepository resumeRepository;

    public UpdateResumeServiceImpl(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    public void updatePersonal(String resumeId, PersonalDto personalDto) {
        this.resumeRepository.updateResumeProperty(resumeId, CommonVariables.RESUME_PERSONAL, personalDto);
    }

    public void updateEducations(String resumeId, List<EducationDto> educationDtoList) {
        this.resumeRepository.updateResumeProperty(resumeId, CommonVariables.RESUME_EDUCATIONS, educationDtoList);
    }

    public void updateWorkExperiences(String resumeId, List<WorkExperienceDto> workExperienceDtoList) {
        this.resumeRepository.updateResumeProperty(resumeId, CommonVariables.RESUME_WORK_EXPERIENCES, workExperienceDtoList);
    }
}
