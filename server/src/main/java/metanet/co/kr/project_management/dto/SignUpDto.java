package metanet.co.kr.project_management.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SignUpDto {

    @NotBlank
    private String username;

    @NotBlank
    private String fullname;

    @NotBlank
    private String password;

    @NotBlank
    private String confirmPassword;
}
