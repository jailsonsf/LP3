package br.ufal.aracomp.lp3;

public class List implements IList{
	
	private int size;
	public Item[] getList() {
		return list;
	}

	public void setList(Item[] list) {
		this.list = list;
	}

	private Item[] list;
	
	public List(int maxSize) {
		this.list = new Item[maxSize];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void addFirst(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEnd(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean full() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item printList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item searchName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item searchOrder(int order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void drainOut() {
		// TODO Auto-generated method stub
		
	}
}
