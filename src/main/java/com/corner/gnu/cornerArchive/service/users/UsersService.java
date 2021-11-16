package com.corner.gnu.cornerArchive.service.users;

import com.corner.gnu.cornerArchive.domain.users.Users;
import com.corner.gnu.cornerArchive.domain.users.UsersRepository;
import com.corner.gnu.cornerArchive.web.dto.UsersResponseDto;
import com.corner.gnu.cornerArchive.web.dto.UsersSaveRequestDto;
import com.corner.gnu.cornerArchive.web.dto.UsersUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UsersService {
    private final UsersRepository usersRepository;

    @Transactional
    public Long save(UsersSaveRequestDto requestDto){
        return usersRepository.save(requestDto.toEntity()).getUid();
    }

    @Transactional
    public Long update(Long uid, UsersUpdateRequestDto requestDto){
        Users users = usersRepository.findById(uid).orElseThrow(()-> new IllegalArgumentException("해당 사용자가 없습니다. UID = " + uid));
        users.update(requestDto.getPhoneNumber(), requestDto.getCollege());
        return uid;
    }
    public UsersResponseDto findByUid(Long uid){
        Users entity = usersRepository.findById(uid).orElseThrow(()-> new IllegalArgumentException("해당 사용자가 없습니다. UID = "+ uid));
        return new UsersResponseDto(entity);
    }
}
