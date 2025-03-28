package com.Palusa.API_Palusa_postgree.repositories;

import com.Palusa.API_Palusa_postgree.models.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque,Long> {

}
