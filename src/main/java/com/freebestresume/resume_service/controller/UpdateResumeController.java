package com.freebestresume.resume_service.controller;

import com.freebestresume.resume_service.dto.EducationDto;
import com.freebestresume.resume_service.dto.PersonalDto;
import com.freebestresume.resume_service.dto.WorkExperienceDto;
import com.freebestresume.resume_service.service.UpdateResumeService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UpdateResumeController {

    private UpdateResumeService updateResumeService;

    public UpdateResumeController(UpdateResumeService updateResumeService) {
        this.updateResumeService = updateResumeService;
    }

    @PutMapping("resumes/{resume-id}/personal")
    public void updatePersonal(@PathVariable("resume-id") String resumeId,
                               @Valid @RequestBody PersonalDto personalDto) {
        this.updateResumeService.updatePersonal(resumeId, personalDto);
        System.out.print(personalDto);
    }


    @PutMapping("resumes/{resume-id}/educations")
    public void updateEducations(@PathVariable("resume-id") String resumeId,
                                 @Valid @RequestBody List<EducationDto> educationDtoList) {
        this.updateResumeService.updateEducations(resumeId, educationDtoList);
    }

    @PutMapping("resumes/{resume-id}/work-experiences")
    public void updateWorkExperiences(@PathVariable("resume-id") String resumeId,
                                      @Valid @RequestBody List<WorkExperienceDto> workExperienceDtoList) {
        this.updateResumeService.updateWorkExperiences(resumeId, workExperienceDtoList);
    }






}
