package com.alexlasota.al_conference_management_service.controller;

import com.alexlasota.al_conference_management_service.model.ResearchPaperDTO;
import com.alexlasota.al_conference_management_service.service.ResearchPaperService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conference")
public class ResearchPaperController {

    private final ResearchPaperService researchPaperService;

    public ResearchPaperController(ResearchPaperService researchPaperService) {
        this.researchPaperService = researchPaperService;
    }

    @GetMapping
    public List<ResearchPaperDTO> getAllConference(){
        return researchPaperService.getAllConferences();
    }

    @PostMapping
    public ResearchPaperDTO addConference(@RequestBody ResearchPaperDTO researchPaperDTO){
        return researchPaperService.saveConference(researchPaperDTO);
    }
}