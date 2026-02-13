package com.example.MyNewProject.tables;

import com.example.MyNewProject.enums.Result_Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Election_Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int votes_received;
    @Enumerated(EnumType.STRING)
    private Result_Status resultStatus;
    @ManyToOne
    @JoinColumn
    private  Candidate candidate;
    @ManyToOne
    @JoinColumn
    private Election election;
    @ManyToOne
    @JoinColumn
    private Constituency constituency;
    @OneToMany(mappedBy = "electionResult",cascade = CascadeType.ALL)
    private List<Asset_Declaration> assetDeclarations;
    @OneToMany(mappedBy = "electionResult",cascade = CascadeType.ALL)
    private List<Criminal_Case> criminalCases ;

}
