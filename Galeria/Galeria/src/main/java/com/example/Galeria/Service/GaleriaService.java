package com.example.Galeria.Service;

import com.example.Galeria.Models.Galeria;
import com.example.Galeria.Repository.GaleriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GaleriaService {

    private GaleriaRepository galeriaRepository;

    public GaleriaService(GaleriaRepository galeriaRepository){
        this.galeriaRepository = galeriaRepository;
    }

    public List<Galeria> listarTodos(){
        return GaleriaRepository.findAll();
    }

    public Galeria salvar (Galeria galeria){
        if (GaleriaRepository.findByAll(galeria.getId()).isPresent()){
            throw new RuntimeException("Produto já Cadastrado");
        }
        return galeriaRepository.save(galeria);
    }

    public Galeria atualizar(Galeria galeria){
        galeria galeriaAtualizar = galeriaRepository.findById(galeria.getId())
                .orElseThrow(() -> new RuntimeException("Produto não Cadastrado"))
    }
}
