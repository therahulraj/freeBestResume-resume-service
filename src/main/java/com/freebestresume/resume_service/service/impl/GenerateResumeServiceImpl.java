package com.freebestresume.resume_service.service.impl;

import com.freebestresume.resume_service.entity.Resume;
import com.freebestresume.resume_service.latex.DemoTemplate;
import com.freebestresume.resume_service.repository.ResumeRepository;
import com.freebestresume.resume_service.service.GenerateResumeService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Service
public class GenerateResumeServiceImpl implements GenerateResumeService {

    private ResumeRepository resumeRepository;

    public GenerateResumeServiceImpl(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }


    @Override
    public void generateResume(String resumeId) {
        Resume resume = this.resumeRepository.findResumeById(resumeId);
        DemoTemplate demoTemplate = new DemoTemplate(resume);
        StringBuffer stringBuffer = demoTemplate.createTemplate();
        System.out.print(System.getProperty("user.dir"));
        File texDir = new File(System.getProperty("user.dir"));

        File texFile = new File(texDir + File.separator + "pdfLatex" + ".tex");
        System.out.println(stringBuffer.toString());
        try (FileWriter texWriter = new FileWriter(texFile)) {
            texWriter.write(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] command;

        Runtime runtime = Runtime.getRuntime();

//        try {
////            Process p = runtime.exec(command, null, texDir);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }


}
