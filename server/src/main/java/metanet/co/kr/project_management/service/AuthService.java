package metanet.co.kr.project_management.service;

import metanet.co.kr.project_management.dto.JwtDto;
import metanet.co.kr.project_management.dto.SignInDto;
import metanet.co.kr.project_management.dto.SignUpDto;

public interface AuthService {
    JwtDto signIn(SignInDto signInDto);
    boolean signOut();
    JwtDto signUp(SignUpDto signUpDto);
}
