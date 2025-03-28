package com.Palusa.API_Palusa_postgree.controller;

import com.Palusa.API_Palusa_postgree.models.Estoque;
import com.Palusa.API_Palusa_postgree.service.EstoqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    private EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService){

        this.estoqueService= estoqueService;
    }

    @GetMapping
    public List<Estoque> getall(){
        return estoqueService.getall();
    }

    @PostMapping
    public  Estoque addestoque(@RequestBody Estoque estoque){

        return estoqueService.addEstoque(estoque);

    }

}
