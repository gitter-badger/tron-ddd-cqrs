package com.tracebucket.tron.ddd.jpa;

import com.tracebucket.tron.ddd.domain.BaseAggregateRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author ssm
 * @since 27-01-2015
 * @version 0.1
 */

@NoRepositoryBean
public interface BaseAggregateRepository<T extends BaseAggregateRoot, ID extends Serializable> extends JpaRepository<T, ID> {

}