package com.Palusa.API_Palusa_postgree.service;

import com.Palusa.API_Palusa_postgree.models.Estoque;
import com.Palusa.API_Palusa_postgree.repositories.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository){
        this.estoqueRepository = estoqueRepository;

    }

    public Estoque addEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public List<Estoque> getall(){

        return estoqueRepository.findAll();

    }

}
