package com.example.MyNewProject.service;

import com.example.MyNewProject.dto.ElectionResultRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class AdminService {



    @Transactional
    public void createElectionResult(ElectionResultRequestDTO dto) {

    }
}
