package GerenciamentoDeFornecedores.ex7.Service;

import GerenciamentoDeFornecedores.ex7.Model.FornecedorModel;
import GerenciamentoDeFornecedores.ex7.Repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<FornecedorModel> findAll() {
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> findById(Long id) {
        return fornecedorRepository.findById(id);
    }

    public void deletar(Long id) {
        fornecedorRepository.deleteById(id);
    }

    public FornecedorModel salvar(FornecedorModel fornecedorModel) {
        return fornecedorRepository.save(fornecedorModel);
    }
}
