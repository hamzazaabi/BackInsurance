package fr.sparkit.insurance.dao;

import fr.sparkit.insurance.entities.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;


@Repository
public interface IStatusDao extends BaseRepository<Status, Long> {
    Page<Status> findAllByIsDeletedFalse(Pageable pageable);
    int countByTitleAndIsDeletedFalse(String string);
    int countByColorAndIsDeletedFalse(String string);
    Page<Status> findAllByTitleLikeAndIsDeletedFalse(String string, Pageable pageable);
}
