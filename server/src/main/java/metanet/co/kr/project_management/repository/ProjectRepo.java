package metanet.co.kr.project_management.repository;

import metanet.co.kr.project_management.entity.Project;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends BaseRepo<Project, Long> {
}
