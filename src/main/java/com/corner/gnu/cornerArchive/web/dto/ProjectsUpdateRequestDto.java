package com.corner.gnu.cornerArchive.web.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProjectsUpdateRequestDto {
    private String projectDescription;
    private String projectGitlink;

    @Builder
    public ProjectsUpdateRequestDto(String projectDescription, String projectGitlink){
        this.projectDescription = projectDescription;
        this.projectGitlink = projectGitlink;
    }
}
