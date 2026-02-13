package com.example.MyNewProject.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AssetDTO {
    private BigDecimal declared_assets;
    private BigDecimal declared_liabilities;
}
