package com.corner.gnu.cornerArchive.web.dto;

import com.corner.gnu.cornerArchive.domain.projects.Projects;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProjectsSaveRequestDto {
    private String projectTitle;
    private String projectDescription;
    private String projectAuthor;
    private String projectGitlink;
    private String projectBackground;

    @Builder
    public ProjectsSaveRequestDto(String projectTitle, String projectDescription, String projectAuthor, String projectGitlink, String projectBackground){
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.projectAuthor = projectAuthor;
        this.projectGitlink = projectGitlink;
        this.projectBackground = projectBackground;
    }

    public Projects toEntity(){
        return Projects.builder()
                .projectTitle(projectTitle)
                .projectDescription(projectDescription)
                .projectAuthor(projectAuthor)
                .projectGitlink(projectGitlink)
                .projectBackground(projectBackground)
                .build();
    }
}
