package com.example.MyNewProject.controller;

import com.example.MyNewProject.dto.ElectionResultRequestDTO;
import com.example.MyNewProject.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;
    public AdminController(AdminService adminService){
        this.adminService=adminService;
    }
    @PostMapping("/electionresults")
    public String createElectionResult(ElectionResultRequestDTO dto){
        adminService.createElectionResult(dto);
        return "Election Result Created Succefully";
    }
}
