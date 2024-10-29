package com.alexlasota.al_conference_management_service.model;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResearchPaperDTO {
    private Long id;
    private String title;
    private String abstractText;
    private String author;
    private String topic;
    private String status;
    private Set<String> coAuthors;
}