package com.example.MyNewProject.dto;

import com.example.MyNewProject.enums.Election_Type;
import lombok.Data;

@Data
public class ElectionDto {
    private  int year;
    private Election_Type electionType;

}
