package solid.lsp;

public abstract class Orderable {
    public int Qnt() {
        return q;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public Orderable(int qnt, int price) {
        this.qnt = qnt;
        this.price = price;
    }

    protected int qnt;
    protected int price;

    public int getAmount() {
        return qnt * price;
    }

}
