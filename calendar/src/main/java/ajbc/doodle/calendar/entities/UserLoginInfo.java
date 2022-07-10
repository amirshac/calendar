package ajbc.doodle.calendar.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class UserLoginInfo {
	private String email;
	private String endPoint;
	private String p256dhKey;
	private String auth;	
}
