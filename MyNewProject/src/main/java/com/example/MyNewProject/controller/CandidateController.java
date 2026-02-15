package com.example.MyNewProject.controller;

import com.example.MyNewProject.service.CandidateService;
import com.example.MyNewProject.tables.Asset_Declaration;
import com.example.MyNewProject.tables.Candidate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    private final CandidateService candidateService;
    public CandidateController(CandidateService candidateService){
        this.candidateService=candidateService;
    }

    @GetMapping("/{id}")
    public Candidate getCandidateById(@PathVariable int id){
        return candidateService.getCandidateById(id);
    }
    @GetMapping("/search")
    public List<Candidate> searchCandidate(@RequestParam String name){
        return  candidateService.getCandidateByName(name);
    }
    @GetMapping("/party")
    public List<Candidate>  getCandidatebyParty(@RequestParam String partyname){
        return  candidateService.getCandidateByParty(partyname);
    }
    @GetMapping("/compare")
    public  List<Candidate> compareCandidate(@RequestParam int id1,@RequestParam int id2){
        return  candidateService.compareCandidate(id1,id2);
    }
    @GetMapping("/assets/{idCandidate}")
    public List<Asset_Declaration>  getAssets(@PathVariable int idCandidate){
        return  candidateService.getAssets(idCandidate);
    }
    @GetMapping("/profile/{id}")
    public ResponseEntity<byte[]> downloadCandidateProfile(@PathVariable int id) {
        byte[] pdf = candidateService.downloadCandidateProfile(id);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=candidate_profile.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }

    @GetMapping("/nandp/{name}/{party}")
    public List<Candidate> getByNamePartyConstituency(
            @PathVariable String name,
            @PathVariable String party
            ){
        return candidateService.getByNamePartyConstituency(name,party);
    }




}
