import java.util.ArrayList;

public class Contato {
    private String Cpf;
    private String nome;
    private String email;
    private String telefone;

    //construtor
    public Contato(String Cpf, String nome, String email, String telefone) {
        Cpf = Cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;


    }

    //validações de cpf, telefone e email
    void Validarcpf() {
        if (getCpf().isEmpty() || getCpf().isBlank()) {
            throw new IllegalArgumentException("CPF não pode ser  vazio");
        }
        if (!getCpf().matches("\\d{11}"))
        {
            throw new IllegalArgumentException("CPF deve conter: 11 digitos, apenas números");
        }

    }
3
    //validação do telefone
    public void Validartelefone(String telefone) {
        if (getTelefone().isEmpty()) {
            throw new IllegalArgumentException(" Telefone não pode ser vazio");
        }
        if (!getTelefone().matches("\\d+")) ;
        {
            throw new IllegalArgumentException("Telefone deve conter apenas numeros");

        }
    }

    //validação do email
    public void Validaremail(String email) {
        if (getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser vazio");
        }
    }

    //getters e settersl
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = Cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
