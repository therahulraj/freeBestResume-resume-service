package com.freebestresume.resume_service.controller;

import com.freebestresume.resume_service.service.GenerateResumeService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GenerateResumeController {

    private GenerateResumeService generateResumeService;

    public GenerateResumeController(GenerateResumeService generateResumeService) {
        this.generateResumeService = generateResumeService;
    }

    @PostMapping("/resumes/{resume-id}/generate-resume")
    public void generateResume(@PathVariable("resume-id") String resumeId) {
        this.generateResumeService.generateResume(resumeId);

    }



}
