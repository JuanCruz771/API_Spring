package com.Palusa.API_Palusa_postgree.controller;

import com.Palusa.API_Palusa_postgree.models.Estoque;
import com.Palusa.API_Palusa_postgree.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService){

        this.estoqueService= estoqueService;
    }

    @GetMapping("/pegar")
    public List<Estoque> getall(){
        return estoqueService.getall();
    }

    @PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Estoque addestoque(@RequestBody Estoque estoque){

        return estoqueService.addEstoque(estoque);

    }



}
