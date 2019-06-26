package br.ufal.aracomp.lp3;

public class Celula {
    private Celula next;
    private Celula previous;
    private Item item;

    public Celula (Item item, Celula next, Celula previous) {
        setItem(item);
        setNext(next);
        setPrevious(previous);
    }

    public Celula (Item item) {
        setItem(item);
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

    public void setNext(Celula next) {
        this.next = next;
    }

    public Celula getNext() {
        return this.next;
    }

    public void setPrevious(Celula previous) {
        this.previous = previous;
    }

    public Celula getPrevious() {
        return this.previous;
    }
}