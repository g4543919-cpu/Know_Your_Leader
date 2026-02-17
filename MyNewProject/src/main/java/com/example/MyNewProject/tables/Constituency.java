package com.example.MyNewProject.tables;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Constituency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String district;
    private String state;
    @OneToMany(mappedBy = "constituency")
    private List<Election_Result>electionResults;

}
