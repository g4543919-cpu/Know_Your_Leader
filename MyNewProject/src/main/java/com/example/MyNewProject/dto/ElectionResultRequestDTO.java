package com.example.MyNewProject.dto;

import com.example.MyNewProject.enums.Result_Status;

import java.util.List;

public class ElectionResultRequestDTO {
    private int  candidateId;
    private  int electionId;
    private  int constituencyId;
    private int votes_received;
    private Result_Status resultStatus;
    private List<AssetDTO> assets;
    private List<CriminalCaseDTO> criminalCases;
}
