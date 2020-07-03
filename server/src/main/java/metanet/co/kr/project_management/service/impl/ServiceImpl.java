package metanet.co.kr.project_management.service.impl;


import metanet.co.kr.project_management.dto.BaseDto;
import metanet.co.kr.project_management.entity.BaseEntity;
import metanet.co.kr.project_management.repository.BaseRepo;
import metanet.co.kr.project_management.service.BaseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional
public abstract class ServiceImpl<D extends BaseDto, E extends BaseEntity, R extends BaseRepo> implements BaseService<D, E, R> {
    private BaseRepo<E, Long> repository;

    protected ServiceImpl(BaseRepo<E, Long> repository) {
        this.repository = repository;
    }

    protected abstract D toDTO(E e);

    protected abstract E toEntity(D dto);

    protected List<D> toDTOs(List<E> entities) {
        if (entities == null) return new ArrayList<>();
        return entities
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<D> findAll() {
        return ((List<E>) repository.findAll()).stream().map(this::toDTO).collect(Collectors.toList());
    }

    @Override
    public D find(Long id) {
        E entity = findEntityById(id);
        return toDTO(entity);
    }

    @Override
    public boolean isExist(Long id) {
        return repository.existsById(id);
    }

    protected E findEntityById(Long id) {
        Optional<E> entity = repository.findById(id);
        // TODO: EXCEPTION HANDLING
//        if (!entity.isPresent()) throw new BusinessException(MessageKey.NOT_FOUND, id.toString());
        return entity.get();
    }

    protected R getRepository() {
        return (R) repository;
    }

}
