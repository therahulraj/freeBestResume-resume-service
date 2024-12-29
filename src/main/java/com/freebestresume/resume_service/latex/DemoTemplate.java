package com.freebestresume.resume_service.latex;

import com.freebestresume.resume_service.constant.CommonVariables;
import com.freebestresume.resume_service.dto.ResumeDto;
import com.freebestresume.resume_service.entity.Resume;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class DemoTemplate {

    StringBuffer stringBuffer;
    final Resume resume;

    public DemoTemplate(Resume resume) {
        this.stringBuffer = new StringBuffer();
        this.resume = resume;
    }

    public StringBuffer createTemplate() {
        StringBuffer stringBuffer1 = new StringBuffer();
        //Preamble
        stringBuffer1.append("\\documentclass[a4paper,10pt]{article}\n");
        stringBuffer1.append("\\usepackage[margin=1in]{geometry}\n");
        stringBuffer1.append("\\usepackage{parskip}\n");
        stringBuffer1.append("\\usepackage{enumitem}\n");
        stringBuffer1.append("\\usepackage{xcolor}\n");
        stringBuffer1.append("\\usepackage{hyperref}\n");
        stringBuffer1.append("\\usepackage{titlesec}\n");

        stringBuffer1.append("\\definecolor{maincolor}{rgb}{0.1, 0.3, 0.7}\n");
        stringBuffer1.append("\\definecolor{linkcolor}{rgb}{0.0, 0.2, 0.5}\n");

        stringBuffer1.append("\\hypersetup{\n" +
                "    colorlinks=true,\n" +
                "    urlcolor=linkcolor\n" +
                "}");
        stringBuffer1.append("\\titleformat{\\section}{\\large\\bfseries\\color{maincolor}}{}{0em}{}[\\titlerule]\n");
        stringBuffer1.append("\\titleformat{\\subsection}{\\bfseries\\color{maincolor}}{}{0em}{}\n");

        stringBuffer1.append("\\setlength{\\parindent}{0pt}\n");

        stringBuffer1.append("\\begin{document}\n");

        stringBuffer1.append("% Header\n" +
                            "\\begin{center}");


        if (this.resume.getPersonal() != null) {
            String firstName = StringUtils.hasLength(this.resume.getPersonal().getFirstName())
                    ? this.resume.getPersonal().getFirstName() : CommonVariables.BLANK_STRING;
            String lastName = StringUtils.hasLength(this.resume.getPersonal().getLastName())
                    ? this.resume.getPersonal().getLastName() : CommonVariables.BLANK_STRING;
            String phoneNumber = StringUtils.hasLength(this.resume.getPersonal().getPhoneNumber())
                    ? this.resume.getPersonal().getPhoneNumber() : CommonVariables.BLANK_STRING;
            String email = StringUtils.hasLength(this.resume.getPersonal().getEmail())
                    ? this.resume.getPersonal().getEmail() : CommonVariables.BLANK_STRING;

            String github = StringUtils.hasLength(this.resume.getPersonal().getGithub())
                    ? this.resume.getPersonal().getGithub() : CommonVariables.BLANK_STRING;

            String linkedIn = StringUtils.hasLength(this.resume.getPersonal().getLinkedIn())
                    ? this.resume.getPersonal().getLinkedIn() : CommonVariables.BLANK_STRING;

            if (StringUtils.hasLength(this.resume.getPersonal().getFirstName())) {
                stringBuffer1.append("    \\textbf{\\Large "+ firstName +" " + lastName +"} \\\\[5pt]\n" +
                        "    \\small \\href{mailto:" + email + "}{" + email + "} $\\cdot$ " + phoneNumber +" $\\cdot$ \\href{" + linkedIn +"}{" + linkedIn +"} \\\\\n" +
                        "    \\small \\href{" + github +"}{" + github +"} $\\cdot$ City, State");
            }

        }

        stringBuffer1.append("\\end{center}");

        stringBuffer1.append("\\end{document}");



        return stringBuffer1;

    }

//    public static void main(String[] args) {
//        System.out.print(DemoTemplate.createTemplate().toString());;
//
//
//    }

}
