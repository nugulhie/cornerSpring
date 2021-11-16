package com.corner.gnu.cornerArchive.domain.projects;

import lombok.*;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column()
    private String projectTitle;

    @Column()
    private String projectDescription;

    @Column()
    private String projectAuthor;

    @Column()
    private String projectGitlink;

    @Column()
    private String projectBackground;

    @Builder
    public Projects(String projectTitle,String projectAuthor, String projectDescription, String projectBackground, String projectGitlink){
        this.projectAuthor = projectAuthor;
        this.projectBackground = projectBackground;
        this.projectGitlink = projectGitlink;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
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
