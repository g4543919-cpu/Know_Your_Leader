package com.example.MyNewProject.tables;

import com.example.MyNewProject.enums.Result_Status;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private Date dob;
    private String gender;
    private String biofraphy;
    @CreationTimestamp
    private Date createdAt;

    private String party;
    @OneToMany(mappedBy = "candidate")
    private List<Election_Result> electionResult;


}
