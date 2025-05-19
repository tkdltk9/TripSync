package TripSync.service.member;

import java.beans.Beans;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import TripSync.command.MemberCommand;
import TripSync.domain.MemberDTO;
import TripSync.mapper.MemberMapper;

@Service
public class MemberRegistService {
	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public void execute(MemberCommand memberCommand) {
		MemberDTO dto = new MemberDTO();
		BeanUtils.copyProperties(memberCommand, dto);
		String encodePw = passwordEncoder.encode(memberCommand.getMemberPw());
		dto.setMemberPw(encodePw);
		
		memberMapper.memberInsert(dto);
	}
}
