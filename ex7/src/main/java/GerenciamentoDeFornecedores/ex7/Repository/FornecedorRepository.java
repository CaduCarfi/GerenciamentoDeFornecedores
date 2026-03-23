package GerenciamentoDeFornecedores.ex7.Repository;

import GerenciamentoDeFornecedores.ex7.Model.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {
}
