package com.corner.gnu.cornerArchive.web;

import com.corner.gnu.cornerArchive.service.projects.ProjectsService;
import com.corner.gnu.cornerArchive.web.dto.ProjectsResponseDto;
import com.corner.gnu.cornerArchive.web.dto.ProjectsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value="/api/v1")
public class ProjectsApiController {

    private final ProjectsService projectsService;

    @PostMapping("/projects")
    public long save(@RequestBody ProjectsSaveRequestDto requestDto){
        return projectsService.save(requestDto);
    }
    @GetMapping("/projects/{pid}")
    public ProjectsResponseDto findByPid(@PathVariable Long pid){
        return projectsService.findByPid(pid);
    }
    @GetMapping("/projects")
    public ResponseEntity findAllProjects(){return ResponseEntity.ok(projectsService.readAllProjects());}

}
