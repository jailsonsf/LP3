package br.ufal.aracomp.lp3;

public class Celula {
    private Celula next;
    private Item item;

    public Celula (Item item, Celula next) {
        setItem(item);
        setNext(next);
    }

    public Celula (Item item) {
        setItem(item);
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setNext(Celula next) {
        this.next = next;
    }

    public Item getItem() {
        return this.item;
    }

    public Celula getNext() {
        return this.next;
    }

}