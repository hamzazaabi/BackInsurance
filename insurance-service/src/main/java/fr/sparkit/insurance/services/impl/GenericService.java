package fr.sparkit.insurance.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import fr.sparkit.insurance.dao.BaseRepository;
import fr.sparkit.insurance.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


public class GenericService<T, D extends Serializable> implements IGenericService<T, D> {

    @Autowired
    private BaseRepository<T, D> baseRepository;

    public GenericService() {
        super();
    }

    @Override
    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    @Override
    public List<T> findAll(Iterable<D> ids) {
        return baseRepository.findAll(ids);
    }

    @Override
    public <S extends T> List<S> save(Iterable<S> entities) {
        return baseRepository.saveAll(entities);
    }

    @Override
    public void flush() { baseRepository.flush(); }

    @Override
    public <S extends T> S saveAndFlush(S entity) {
        return baseRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteInBatch(Iterable<T> entities) {
        baseRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch() {
        baseRepository.deleteAllInBatch();

    }

    @Override
    public Optional<T> findOne(D id) {
        return Optional.ofNullable(baseRepository.findOne(id));
    }

    @Override
    public void delete(D id) {
        UUID uuid = UUID.randomUUID();
        baseRepository.delete(id, uuid);
    }

    @Override
    public void delete(T entity) {
        UUID uuid = UUID.randomUUID();
        baseRepository.delete(entity, uuid);
    }

    @Override
    public void deleteSoft(D id) {
        UUID uuid = UUID.randomUUID();
        baseRepository.delete(id, uuid);
    }

    @Override
    public void deleteSoft(T entity) {
        baseRepository.delete(entity);
    }

    @Override
    public Page<T> findAllByPaginationAndIsDeletedFalse(Pageable pageable) {
        return baseRepository.findAllByIsDeletedFalse(pageable);
    }

    @Override
    public List<T> findAllAndDelete() {
        return baseRepository.findAll();
    }

    @Override
    public List<T> findAllAndDelete(Sort sort) {
        return baseRepository.findAll(sort);
    }

    @Override
    public List<T> findAllAndDelete(Iterable<D> ids) {
        return baseRepository.findAll(ids);
    }

}
