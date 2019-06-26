package br.ufal.aracomp.lp3;

public class ListaDuplamenteEncadeada implements ILista {
    private Celula first;
    private Celula last;
    private int countList;

    public void setFirst(Celula first) {
        this.first = first;
    }

    public void setLast(Celula last) {
        this.last = last;
    }

    public Celula getCelula(int index) {
        if (index < 0 || index >= this.countList)
            throw new IllegalArgumentException("Posição não encontrada");

        Celula current = this.first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current;
    }

    @Override
    public ListaDuplamenteEncadeada newList() {
        return new ListaDuplamenteEncadeada();
    }

    @Override
    public void addFirst(Item item) {
        Celula current = new Celula(item, this.first, null);
        setFirst(current);

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
            Celula current = new Celula(item);
            this.last.setNext(current);
            current.setPrevious(this.last);
            this.last = current;
            this.countList++;
        }
    }

    @Override
    public void printList() {
        Celula current = this.first;

        for (int i = 0; i < this.countList; i++) {
            System.out.println(current.getItem());
            current = current.getNext();
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
        Celula current = this.first;
        
        if (index >= 0 && index < this.countList) {
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            
        } else {
            throw new IllegalArgumentException("Posição não encontrada");
        }

        return current.getItem();

    }

    @Override
    public void drainOut() {
        this.first = null;
        this.last = null;
        this.countList = 0;
    }

    @Override
    public void copyVector(Item[] listItem) {
        for (int i = 0; i < listItem.length - 1; i++) {
            Item current = listItem[i];

            this.addEnd(current);
        }
    }

    @Override
    public Item[] convertToVector(ListaDuplamenteEncadeada list) {
        Item[] listItem = new Item[this.countList];
        
        Celula current = this.first;

        for (int i = 0; i < this.countList; i++) {
            listItem[i] = current.getItem();
            current = current.getNext();
        }
        
        return listItem;
    }

    @Override
    public void addList(Celula firstItemList) {
        if (this.countList == 0) {
            setFirst(firstItemList);
        } else {
            this.last.setNext(firstItemList);
        }
    }

    @Override
    public int numberNodes() {
        if (this.countList == 0) {
            return 0;
        } else
            return this.countList - 1;
    }

    @Override
    public void removeItem(int index) {
        if(index >= 0 && index < this.countList) {
            if (index == 0) {
                setFirst(this.first.getNext());
                this.countList--;

                if (this.countList == 0)
                    setLast(null);

            } else if (index == this.countList - 1) {
                Celula penultimate = this.last.getPrevious();
                penultimate.setNext(null);
                setLast(penultimate);
                this.countList--;
            } else {
                Celula previousItem = this.getCelula(index);
                Celula current = previousItem.getNext();
                Celula nextItem = current.getNext();

                previousItem.setNext(nextItem);
                nextItem.setPrevious(previousItem);

                this.countList--;
            }
        } else {
            throw new IllegalArgumentException("Posição não encontrada");
        }
    }
}