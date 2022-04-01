package com.phamhuy.repository;

import com.phamhuy.model.Smartphone;
import org.springframework.data.repository.CrudRepository;

public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}
