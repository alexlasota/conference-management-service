package com.alexlasota.al_conference_management_service.service;

import com.alexlasota.al_conference_management_service.mapper.ResearchPaperMapper;
import com.alexlasota.al_conference_management_service.model.ResearchPaper;
import com.alexlasota.al_conference_management_service.model.ResearchPaperDTO;
import com.alexlasota.al_conference_management_service.repository.ResearchPaperRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResearchPaperService {

    private final ResearchPaperRepository repository;
    private final ResearchPaperMapper mapper;

    public ResearchPaperService(ResearchPaperRepository repository, ResearchPaperMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    public List<ResearchPaperDTO> getAllConferences(){
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public ResearchPaperDTO saveConference(ResearchPaperDTO researchPaperDTO){
        ResearchPaper researchPaper = mapper.toEntity(researchPaperDTO);
        researchPaper.setStatus("Created");
        return mapper.toDto(repository.save(researchPaper));
    }
}