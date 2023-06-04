package com.example.fastcampusmysql.domain.member.service;

import com.example.fastcampusmysql.domain.member.dto.RegisterMemberCommand;
import com.example.fastcampusmysql.domain.member.entity.Member;
import com.example.fastcampusmysql.domain.member.entity.MemberNameHistory;
import com.example.fastcampusmysql.domain.member.repository.MemberRepopsitory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class MemberWriteService {

    final private MemberRepopsitory memberRepopsitory;
    public Member create(RegisterMemberCommand command){
        /*
            목표 - 회원정보(이메일, 생년월일, 닉네임)  등록
            요구사항 _ 닉네임은 10자 이상 X
            파라미터 - memberRegisterCommand
            val member = Membe.of(memberRegisterComman)
            memberRespository.save()
         */
        var member = Member.builder()
                .nickname(command.nickname())
                .email(command.email())
                .birthday(command.birthday())
                .build();
        return memberRepopsitory.save(member);

        }
        public void changeNickname(Long memberId, String nickname){

            var member = memberRepopsitory.findById(memberId).orElseThrow();
            member.changeNickName(nickname);
            memberRepopsitory.save(member);


            var history = MemberNameHistory
                    .builder()
                    .memberId(member.getId())
                    .nickname(member.getNickname())
                    .build();
        }
    }

