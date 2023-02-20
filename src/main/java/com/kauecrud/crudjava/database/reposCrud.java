package com.kauecrud.crudjava.database;

import com.kauecrud.crudjava.entidade.contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reposCrud extends JpaRepository<contato, Long>{

}
