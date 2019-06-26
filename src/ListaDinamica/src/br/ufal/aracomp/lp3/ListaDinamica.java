package br.ufal.aracomp.lp3;

public class ListaDinamica implements ILista {
    private Celula first;
    private Celula last;
    private int countList;

    public void setFirst(Celula first) {
        this.first = first;
    }

    public void setLast(Celula last) {
        this.last = last;
    }

    @Override
    public void addFirst(Item item) {
        Celula newItem = new Celula(item, this.first);
        setFirst(newItem);

        if (this.empty()) {
            this.last = this.first;
        }

        this.countList++;
    }

    @Override
    public void addEnd(Item item) {
        if (this.empty()) {
            this.addFirst(item);
        } else {
            Celula newItem = new Celula(item);
            this.last.setNext(newItem);
            this.last = newItem;
            this.countList++;
        }
    }

    @Override
    public void printList() {
        Celula nowItem = this.first;

        for (int i = 0; i < this.countList; i++) {
            System.out.println(nowItem.getItem());
            nowItem = nowItem.getNext();
        }
    }

    @Override
    public boolean empty() {
        if(this.countList == 0) {
            return true;
        } else
            return false;
    }

    @Override
    public Item searchIndex(int index) {
        Celula nowItem = this.first;
        
        if (index >= 0 && index < this.countList) {
            for (int i = 0; i < index; i++) {
                nowItem = nowItem.getNext();
            }
            
        } else {
            throw new IllegalArgumentException("Posição não encontrada");
        }

        return nowItem.getItem();

    }

    @Override
    public void drainOut() {
        this.first = null;
        this.last = null;
        this.countList = 0;
    }

}