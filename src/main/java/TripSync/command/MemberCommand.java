package TripSync.command;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class MemberCommand {
	String memberNum;
	String memberId;
	@Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$",
			message = "영문 대소문자와 숫자 그리고 특수문자가 포함된 8글자 이상")
	String memberPw;
	String memberPwCon;
	String memberName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date createdAt; 
	public boolean isMemberPwEqualmemberPwCon() {
		return memberPw.equals(memberPwCon);
	}
}
