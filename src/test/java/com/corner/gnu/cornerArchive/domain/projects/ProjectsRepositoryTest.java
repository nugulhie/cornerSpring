package com.corner.gnu.cornerArchive.domain.projects;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectsRepositoryTest {

    @Autowired
    ProjectsRepository projectsRepository;

    @After
    public void cleanup(){
        projectsRepository.deleteAll();
    }

    @Test
    public void testingApI(){
        String title = "테스트";
        String description = "테스트";
        String author = "테스트";
        String gitlink = "테스트";
        String background = "테스트";
        projectsRepository.save(Projects.builder()
                .projectTitle(title)
                .projectAuthor(author)
                .projectDescription(description)
                .projectGitlink(gitlink)
                .projectBackground(background).build());
        List<Projects> projectsList = projectsRepository.findAll();
        Projects projects = projectsList.get(0);
        assertThat(projects.getProjectTitle()).isEqualTo(title);
        assertThat(projects.getProjectBackground()).isEqualTo(background);
    }

}
