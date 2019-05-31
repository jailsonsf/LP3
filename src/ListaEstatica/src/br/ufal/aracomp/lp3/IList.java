package br.ufal.aracomp.lp3;

public interface IList {
	public void addFirst(Item item);
	public void addEnd(Item item);
	public boolean full();
	public boolean empty();
	public Item printList();
	public Item searchName(String name);
	public Item searchOrder(int order);
	public void drainOut();
}
