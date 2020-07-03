package metanet.co.kr.project_management.service;

import metanet.co.kr.project_management.dto.BaseDto;
import metanet.co.kr.project_management.entity.BaseEntity;
import metanet.co.kr.project_management.repository.BaseRepo;

import java.util.List;

public interface BaseService<D extends BaseDto, E extends BaseEntity, R extends BaseRepo> {
    D add(D dto);
    D update(D dto);
    List<D> findAll();

    D find(Long id);

    boolean isExist(Long id);

    boolean delete(Long id);

    // TODO: PAGINATION
//    List<D> searchWithoutPaging(S searchCriteria);
//
//    Page<D> search(S searchCriteria);
}
