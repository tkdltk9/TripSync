package TripSync.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Alias("memberDTO")
@Data
public class MemberDTO {
	String memberNum;
	String memberId;
	String memberPw;
	String memberName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date createdAt; 
}
