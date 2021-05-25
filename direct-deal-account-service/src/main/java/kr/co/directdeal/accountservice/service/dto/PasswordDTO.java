package kr.co.directdeal.accountservice.service.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.util.StringUtils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PasswordDTO {
    private String id;

	@Size(min = 6, max = 30, message = "{account.constraint.password.size.message}")
	private String password;

	@Size(min = 6, max = 30, message = "{account.constraint.password.size.message}")
	private String newPassword;

	public boolean isSamePasswords() {
    	return StringUtils.hasText(this.password) 
			&& StringUtils.hasText(this.newPassword)
			&& (6 <= this.password.length() && this.password.length() <= 30)
			&& (6 <= this.newPassword.length() && this.newPassword.length() <= 30)
			&& (this.password.equals(this.newPassword));
    }
}
