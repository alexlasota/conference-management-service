package com.alexlasota.al_conference_management_service.repository;

import com.alexlasota.al_conference_management_service.model.ResearchPaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResearchPaperRepository extends JpaRepository<ResearchPaper, Long> {
}
