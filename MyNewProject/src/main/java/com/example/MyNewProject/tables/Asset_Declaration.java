package com.example.MyNewProject.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
//@Data not used becouse getting problem in to string in ai summary becouse it creare erelastion ship to string stack overflo
@Getter
@Setter
public class Asset_Declaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(precision = 15, scale = 2)
    private BigDecimal declared_assets;
    @Column(precision = 15, scale = 2)
    private BigDecimal declared_liabilities;
    @JoinColumn
    @ManyToOne
    @JsonIgnore
    private Election_Result electionResult;

}
