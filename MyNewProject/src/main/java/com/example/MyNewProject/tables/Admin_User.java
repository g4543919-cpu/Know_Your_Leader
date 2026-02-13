package com.example.MyNewProject.tables;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Admin_User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String UserName;
    private String Password;
    @ElementCollection
    private List<String> role;
}
