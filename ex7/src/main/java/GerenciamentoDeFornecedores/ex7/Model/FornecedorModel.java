package GerenciamentoDeFornecedores.ex7.Model;

import jakarta.persistence.*;

@Entity(name = "Fornecedor")
@Table(name = "tb_fornecedor")
public class FornecedorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nomeFornecedor")
    private String nomeFantasia;
    @Column(name = "cnpjFornecedor")
    private String cnpj;
    private String contato;

    public FornecedorModel() {
    }

    public FornecedorModel(Long id, String nomeFantasia, String cnpj, String contato) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.contato = contato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
