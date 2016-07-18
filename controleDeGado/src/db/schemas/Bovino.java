package db.schemas;

import java.io.Serializable;

public abstract class Bovino implements Serializable {

    private String nome;

    private int sexo;

    private Data dataDeNascimento;

    private int codigo;

    private int status;

    public Bovino(String nome, Data dataDeNascimento, int codigo, int sexo) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.sexo = sexo;
    }

    public void alterar(int sexo, Data dataNascimento, int codigo, int status) {
        this.sexo = sexo;
        this.dataDeNascimento = dataNascimento;
        this.codigo = codigo;
    }

    public String getSexo() {
        return this.sexo == 1 ? "Macho" : "Fêmea";
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "" + this.nome + "  " + this.codigo + "  " + this.dataDeNascimento;
    }

    public String bezerro() {
        if (this.ehBezerro()) {
            return this.toString();
        }
        return " ";
    }

    public boolean ehBezerro() {
        return this.status == 50;
    }
}
