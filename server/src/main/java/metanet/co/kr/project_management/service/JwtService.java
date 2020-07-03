package metanet.co.kr.project_management.service;

import metanet.co.kr.project_management.dto.JwtDto;
import org.springframework.stereotype.Service;

@Service
public interface JwtService {
    JwtDto createToken();
    boolean verifyToken(String token);
}
