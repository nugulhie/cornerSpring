package com.corner.gnu.cornerArchive.domain.projects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pid;
    private String projectTitle;
    private String projectDescription;
    private String projectAuthor;
    private String projectGitlink;
    private String projectBackground;

    protected Projects(){}

    public Projects(String projectTitle,String projectAuthor, String projectDescription, String projectBackground, String projectGitlink){
        this.projectAuthor = projectAuthor;
        this.projectBackground = projectBackground;
        this.projectGitlink = projectGitlink;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
    }

    public Long getPid() {
        return pid;
    }

    public String getProjectAuthor() {
        return projectAuthor;
    }

    public String getProjectBackground() {
        return projectBackground;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public String getProjectGitlink() {
        return projectGitlink;
    }

    public String getProjectTitle() {
        return projectTitle;
    }
    @Override
    public String toString(){
        return String.format("Projects[id=%d, Title='%s', Author='%s', GitLink='%s', Description='%s'", pid, projectTitle, projectAuthor, projectGitlink, projectDescription);
    }
}
