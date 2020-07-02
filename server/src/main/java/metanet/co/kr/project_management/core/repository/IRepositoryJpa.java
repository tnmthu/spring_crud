package metanet.co.kr.project_management.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface IRepositoryJpa<T, ID extends Serializable> extends
        JpaRepository<T, ID> {
//        JpaSpecificationExecutor, QuerydslPredicateExecutor<T> {

    Optional<T> findById(ID id);
    List<T> findByIdIn(Collection<ID> ids);

    //Dynamic projection for a single entity.
//    <TProjection> TProjection findProjectedById(Long id, Class<TProjection> projection);
//    <TProjection> List<TProjection> findProjectedByIdIn(Collection<ID> ids, Class<TProjection> projection);

}
