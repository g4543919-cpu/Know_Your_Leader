package com.example.MyNewProject.repository;

import com.example.MyNewProject.tables.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepo extends JpaRepository<Candidate,Integer> {

}
