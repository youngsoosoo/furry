package com.friend.furry.service;

import com.friend.furry.security.dto.MemberJoinDTO;

public interface MemberService {
    //회원이 존재하는 경우 발생시킬 예외 클래스
    static class MidExistException extends Exception{

    }

    void join(MemberJoinDTO memberJoinDTO) throws MidExistException;
}