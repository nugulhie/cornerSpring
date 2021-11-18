package com.corner.gnu.cornerArchive.domain.projects;

import com.corner.gnu.cornerArchive.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Projects{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column(length = 100, nullable = false)
    private String projectTitle;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String projectDescription;

    @Column(length = 50, nullable = false)
    private String projectAuthor;

    @Column(length = 50, nullable = false)
    private String projectGitlink;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String projectBackground;

    @Builder
    public Projects(String projectTitle,String projectAuthor, String projectDescription, String projectBackground, String projectGitlink){
        this.projectTitle = projectTitle;
        this.projectAuthor = projectAuthor;
        this.projectGitlink = projectGitlink;
        this.projectDescription = projectDescription;
        this.projectBackground = projectBackground;
    }

    public void update(String projectTitle, String projectGitlink){
        this.projectTitle = projectTitle;
        this.projectGitlink = projectGitlink;
    }


    @Override
    public String toString(){
        return String.format("Projects[id=%d, Title='%s', Author='%s', GitLink='%s', Description='%s'", pid, projectTitle, projectAuthor, projectGitlink, projectDescription);
    }
}
