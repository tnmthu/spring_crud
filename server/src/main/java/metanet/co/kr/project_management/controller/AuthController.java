package metanet.co.kr.project_management.controller;

import metanet.co.kr.project_management.dto.JwtDto;
import metanet.co.kr.project_management.dto.SignInDto;
import metanet.co.kr.project_management.dto.SignUpDto;
import metanet.co.kr.project_management.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signIn")
    public JwtDto signIn(@RequestBody SignInDto signInDto) {
        return authService.signIn(signInDto);
    }

    @PostMapping("/signOut")
    public boolean signOut() {
        return authService.signOut();
    }

    @PostMapping("/signUp")
    public JwtDto signUp(@RequestBody SignUpDto signUpDto) {
        return authService.signUp(signUpDto);
    }
}
