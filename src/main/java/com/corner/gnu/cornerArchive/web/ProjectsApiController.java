package com.corner.gnu.cornerArchive.web;

import com.corner.gnu.cornerArchive.service.projects.ProjectsService;
import com.corner.gnu.cornerArchive.web.dto.ProjectsResponseDto;
import com.corner.gnu.cornerArchive.web.dto.ProjectsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ProjectsApiController {
    private final ProjectsService projectsService;

    @PostMapping("/api/v1/projects")
    public long save(@RequestBody ProjectsSaveRequestDto requestDto){
        return projectsService.save(requestDto);
    }
    @GetMapping("/api/v1/projects/{pid}")
    public ProjectsResponseDto findByPid(@PathVariable Long pid){
        return projectsService.findByPid(pid);
    }

}
