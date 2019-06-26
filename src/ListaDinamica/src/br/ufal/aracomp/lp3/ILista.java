package br.ufal.aracomp.lp3;

public interface ILista {
    public void addFirst(Item item);
    public void addEnd(Item item);
    public void printList();
	public boolean empty();
	public Item searchIndex(int index);
	public void drainOut();
}