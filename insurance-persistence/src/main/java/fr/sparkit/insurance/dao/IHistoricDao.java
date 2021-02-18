package fr.sparkit.insurance.dao;

import fr.sparkit.insurance.entities.Historic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IHistoricDao extends BaseRepository<Historic, Long> {

}
