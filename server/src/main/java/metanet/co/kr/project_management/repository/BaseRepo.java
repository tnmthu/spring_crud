package metanet.co.kr.project_management.repository;

import metanet.co.kr.project_management.core.repository.IRepositoryJpa;
import metanet.co.kr.project_management.entity.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepo<E extends BaseEntity, I extends Long> extends IRepositoryJpa<E, I> {
}
