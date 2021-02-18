package fr.sparkit.insurance.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor {

    LocalDateTime MODIFICATION_DATE_TIME = LocalDateTime.now();

    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.isDeleted = false")
    List<T> findAll();

    @Override
    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.isDeleted = false")
    List<T> findAll(Sort sort);

    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id in ?1 and e.isDeleted = false")
    List<T> findAll(Iterable<ID> ids);

    @Query("select e from #{#entityName} e where e.isDeleted = true")
    @Transactional(readOnly = true)
    List<T> findIsDeleted();

    @Override
    @Transactional(readOnly = true)
    @Query("select count(e) from #{#entityName} e where e.isDeleted = false")
    long count();

    @Query("update #{#entityName} e set e.isDeleted=true, e.deletedToken = ?2 where e.id = ?1 ")
    @Transactional
    @Modifying
    void delete(ID id, UUID uuid);

    @Query("update #{#entityName} e set e.isDeleted=true, e.deletedToken = ?2 where e = ?1")
    @Transactional
    @Modifying
    void delete(T entity, UUID uuid);

    @Query("update #{#entityName} e set e.isDeleted=true, e.deletedToken= NEWID() where e.id in (?1)")
    @Transactional
    @Modifying
    void deleteByIds(List<ID> ids);

    @Transactional
    default void delete(Iterable<? extends T> entities) {
        entities.forEach(this::delete);
    }

    @Query("update #{#entityName} e set e.isDeleted=true, e.deletedToken = ?1")
    @Transactional
    @Modifying
    void deleteAll(UUID uuid);

    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id = ?1 and e.isDeleted = false")
    T findOne(ID id);

    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id = ?1")
    T findByIdEvenIfIsDeleted(ID id);

    @Transactional(readOnly = true)
    @Query("select e from #{#entityName} e where e.id in ?1")
    List<T> findAllByIdsEvenIfIsDeleted(Iterable<ID> ids);

    Page<T> findAllByIsDeletedFalse(Pageable pageable);

    @Transactional
    @Modifying
    @Query("update #{#entityName} e set e.isDeleted=true, e.deletedToken = ?2 WHERE e IN ?1")
    void deleteInBatchSoft(Iterable<T> entities, UUID uuid);

    @Query("update #{#entityName} e set e.isArchived=true," +
            " e.lastModifiedDate= ?2 where e.id = ?1")
    @Transactional
    @Modifying
    void archive(Long id, LocalDateTime lastModificationDateTime, String entityName);

    @Query("update #{#entityName} e set e.isArchived=true," +
            " e.lastModifiedDate = ?2 where e.id in (?1)")
    @Transactional
    @Modifying
    void archiveSelected(List<ID> ids, LocalDateTime lastModificationDateTime, String entityName);

    @Query("update  #{#entityName} e set e.isArchived=false," +
            " e.lastModifiedDate = ?2 where e.id = ?1")
    @Transactional
    @Modifying
    void restore(Long id, LocalDateTime lastModificationDateTime, String entityName);

    @Query("update  #{#entityName} e set e.isArchived=false," +
            " e.lastModifiedDate = ?2 where e.id in (?1)")
    @Transactional
    @Modifying
    void restoreSelected(List<ID> ids, LocalDateTime lastModificationDateTime, String entityName);

    Page<T> findAllByIsDeletedFalseAndIsArchivedFalse(Pageable pageable);

}
