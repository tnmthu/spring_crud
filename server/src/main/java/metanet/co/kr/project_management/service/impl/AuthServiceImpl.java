package metanet.co.kr.project_management.service.impl;

import metanet.co.kr.project_management.dto.JwtDto;
import metanet.co.kr.project_management.dto.SignInDto;
import metanet.co.kr.project_management.dto.SignUpDto;
import metanet.co.kr.project_management.entity.User;
import metanet.co.kr.project_management.repository.UserRepo;
import metanet.co.kr.project_management.service.AuthService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepo userRepo;

    private final BCryptPasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    @Autowired
    public AuthServiceImpl(BCryptPasswordEncoder passwordEncoder, ModelMapper modelMapper) {
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
    }

    @Override
    public JwtDto signIn(SignInDto signInDto) {
        Optional<User> user = userRepo.findByUsername(signInDto.getUsername());
        if (!user.isPresent() || !passwordEncoder.matches(signInDto.getPassword(), user.get().getPassword())) {
            return null;
        }
        return new JwtDto("tokengoeshere");
    }

    @Override
    public boolean signOut() {
        return false;
    }

    @Override
    public JwtDto signUp(SignUpDto signUpDto) {
        System.out.println(signUpDto);
        if (!signUpDto.getPassword().equals(signUpDto.getConfirmPassword())) {
            return null;
        }
        String password = passwordEncoder.encode(signUpDto.getPassword());

        User newUser = new User(signUpDto.getUsername(), password, signUpDto.getFullname());
        userRepo.save(newUser);

        return new JwtDto("tokengoeshere");
    }
}
