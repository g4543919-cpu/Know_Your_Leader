package com.example.MyNewProject.service;

import com.example.MyNewProject.repository.CandidateRepo;
import com.example.MyNewProject.tables.Candidate;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {

    private final CandidateRepo candidateRepo;
    public CandidateService(CandidateRepo candidateRepo){
        this.candidateRepo=candidateRepo;
    }

    public Candidate getCandidateById(int id) {
        return candidateRepo.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Candidadate Does Not Exist"));
    }


}
