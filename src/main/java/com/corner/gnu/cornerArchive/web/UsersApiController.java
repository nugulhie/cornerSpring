package com.corner.gnu.cornerArchive.web;

import com.corner.gnu.cornerArchive.service.users.UsersService;
import com.corner.gnu.cornerArchive.web.dto.UsersResponseDto;
import com.corner.gnu.cornerArchive.web.dto.UsersSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class UsersApiController {
    private final UsersService usersService;

    @PostMapping("/api/v1/users")
    public long save(@RequestBody UsersSaveRequestDto requestDto){
        return usersService.save(requestDto);
    }
    @GetMapping("/api/v1/users/{uid}")
    public UsersResponseDto findById(@PathVariable Long uid){
        return usersService.findByUid(uid);
    }
}
