package com.lctech.lcmacro.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lctech.lcmacro.domain.model.TipoMacro;

@Repository
public interface TipoMacroRepository extends JpaRepository<TipoMacro, Long>{

}
