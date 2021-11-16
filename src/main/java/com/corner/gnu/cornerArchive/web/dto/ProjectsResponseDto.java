package com.corner.gnu.cornerArchive.web.dto;

import com.corner.gnu.cornerArchive.domain.projects.Projects;
import lombok.Getter;

@Getter
public class ProjectsResponseDto {
    private Long pid;
    private String projectTitle;
    private String projectAuthor;
    private String projectDescription;
    private String projectGitLink;
    private String projectBackground;

    public ProjectsResponseDto(Projects entity){
        this.pid = entity.getPid();
        this.projectTitle = entity.getProjectTitle();
        this.projectAuthor = entity.getProjectAuthor();
        this.projectDescription = entity.getProjectDescription();
        this.projectGitLink = entity.getProjectGitlink();
        this.projectBackground = entity.getProjectBackground();
    }
}
