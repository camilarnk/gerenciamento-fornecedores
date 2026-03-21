package com.bn.suppliers.services;

import com.bn.suppliers.models.FornecedorModel;
import com.bn.suppliers.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public FornecedorModel criarFornecedor(FornecedorModel fornecedorModel) {
        return fornecedorRepository.save(fornecedorModel);
    }

    public List<FornecedorModel> buscarTodosFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> buscarPorId(Long id) {
        return fornecedorRepository.findById(id);
    }

    public void deletarFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }

}
