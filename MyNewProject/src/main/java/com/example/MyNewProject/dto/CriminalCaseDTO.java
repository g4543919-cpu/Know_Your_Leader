package com.example.MyNewProject.dto;

import com.example.MyNewProject.enums.SeverityLevel;
import lombok.Data;

@Data
public class CriminalCaseDTO {
    private String case_description;
    private SeverityLevel severityLevel;
}
