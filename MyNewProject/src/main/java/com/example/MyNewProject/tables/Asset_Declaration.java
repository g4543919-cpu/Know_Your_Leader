package com.example.MyNewProject.tables;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
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
    private Election_Result electionResult;

}
