package metanet.co.kr.project_management.repository;

import metanet.co.kr.project_management.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends BaseRepo<User, Long> {
    Optional<User> findByUsername(String username);
}
