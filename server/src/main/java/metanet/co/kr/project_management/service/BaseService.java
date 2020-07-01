package metanet.co.kr.project_management.service;

import metanet.co.kr.project_management.dto.BaseDto;
import metanet.co.kr.project_management.entity.BaseEntity;

public interface BaseService<D extends BaseDto, E extends BaseEntity> {
    D create(D dto);
    D update(D dto);
}
