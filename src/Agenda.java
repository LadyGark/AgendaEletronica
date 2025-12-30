import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>(); //lista - que começa vazia

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }

    //cadastrar contatos
    void cadastrarContato(Contato Contato) { //função de cadatrar contatos
        contatos.add(Contato);
    }

    void listarContatos() { //listar contatos da lista
        if (!contatos.isEmpty()) {
            for (Contato contato : contatos) {
                IO.println(contato.toString());
            }
        }
    }

    Contato buscarContato(String Cpf) { // buscar um contato da lista
        for (Contato contato : contatos) {
            if (contato.getCpf().equals(Cpf)) {
                return contato;
            }
        }
        return null;
    }

    void excluirContato(String Cpf) { //excluir contato da lista
        Contato contato = buscarContato(Cpf);
        if (contato != null) {
            contatos.remove(contato);
        }
    }
}

