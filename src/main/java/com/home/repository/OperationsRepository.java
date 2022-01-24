package com.home.repository;

import com.home.model.Operation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationsRepository extends CrudRepository<Operation, Integer> {

    @Query(value = "SELECT * FROM operations WHERE user_id = :user_id " +
            "AND (:start IS NULL OR date >= to_date(:start, 'yyyy-mm-dd'))" +
            "AND (:end IS NULL OR date <= to_date(:end, 'yyyy-mm-dd'))", nativeQuery = true)
    List<Operation> getOperations(@Param("user_id") Integer id,
                                  @Param("start") String start, @Param("end") String end);
}