package com.corner.gnu.cornerArchive.service.projects;

import com.corner.gnu.cornerArchive.domain.projects.Projects;
import com.corner.gnu.cornerArchive.domain.projects.ProjectsRepository;
import com.corner.gnu.cornerArchive.web.dto.ProjectsResponseDto;
import com.corner.gnu.cornerArchive.web.dto.ProjectsSaveRequestDto;
import com.corner.gnu.cornerArchive.web.dto.ProjectsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectsService {
    private final ProjectsRepository projectsRepository;

    @Transactional
    public Long save(ProjectsSaveRequestDto requestDto) {
        return projectsRepository.save(requestDto.toEntity()).getPid();
    }

    @Transactional
    public Long update(Long pid, ProjectsUpdateRequestDto requestDto) {
        Projects projects = projectsRepository.findById(pid).orElseThrow(() -> new IllegalArgumentException("해당 프로젝트가 없습니다. PID =" + pid));
        projects.update(requestDto.getProjectDescription(), requestDto.getProjectGitlink());
        return pid;
    }

    public ProjectsResponseDto findByPid(Long pid){
        Projects entity = projectsRepository.findById(pid).orElseThrow(()->new IllegalArgumentException("해당 프로젝트가 없습니다. PID = "+ pid));

        return new ProjectsResponseDto(entity);
    }

    public List<ProjectsResponseDto> readAllProjects(){
        List<ProjectsResponseDto> entity = new ArrayList<>();
        List<Projects> projectArray = projectsRepository.findAll();
        for(int i=0; i<projectArray.size();i++){
            entity.add(new ProjectsResponseDto(projectArray.get(i)));
        }
        return entity;
    }

}
