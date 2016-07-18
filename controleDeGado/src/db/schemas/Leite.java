package db.schemas;

import java.io.Serializable;

public class Leite implements Serializable {

    public Data data;

    private int quantidade;

    public Leite(Data data, int quantidade) {
        this.data = data;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getData() {
        return this.data.toString();
    }
}
