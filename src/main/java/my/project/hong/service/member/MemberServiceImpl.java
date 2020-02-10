package my.project.hong.service.member;

import my.project.hong.model.ResponseVO;
import my.project.hong.model.code.ResCode;
import my.project.hong.service.member.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kiseokhong on 09/02/2020.
 */
@Service
public class MemberServiceImpl implements MemberService{

    private final MemberMapper memberMapper;

    @Autowired
    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public ResponseVO<Object> getMemberList() {
        return ResponseVO.builder()
                .data(memberMapper.selectMemberList())
                .resCode(ResCode.SUCCESS.getResCode())
                .resMsg(ResCode.SUCCESS.getResMsg())
                .build();
    }
}