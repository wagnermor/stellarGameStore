package com.stellarGameStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stellarGameStore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
