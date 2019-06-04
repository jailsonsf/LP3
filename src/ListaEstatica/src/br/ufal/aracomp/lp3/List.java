package br.ufal.aracomp.lp3;

public class List implements IList{
	
	private int size;
	private Item[] list;
	private int maxSize;
	
	public List(int maxSize) {
		this.list = new Item[maxSize];
		this.maxSize = maxSize;
	}
	
	public Item[] getList() {
		return list;
	}

	public void setList(Item[] list) {
		this.list = list;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void addFirst(Item item) {
		for (int i = this.size - 1; i >= 0; i--) {
			this.list[i + 1] = this.list[i];
			if (i == 0) {
				this.list[i] = item;
				this.size += 1;
			}
		}
	}

	@Override
	public void addEnd(Item item) {
		this.list[size] = item;
		this.size += 1;
	}

	@Override
	public boolean full() {
		boolean isFull = false;
		if(this.size == this.maxSize) {
			isFull = true;
		} else {
			isFull = false;
		}
		return isFull;
	}

	@Override
	public boolean empty() {
		boolean isEmpty = false;
		if(this.size == 0) {
			isEmpty = true;
		} else {
			isEmpty = false;
		}
		return isEmpty;
	}

	@Override
	public void printList() {
		for (int i = 0; i < this.size; i++) {
			System.out.println(this.list[i]);
		}
	}

	@Override
	public Item searchName(String name) {
		Item tmp = null;
		for (int i = 0; i < this.size; i++) {
			if (this.list[i].getName() == name) {
				tmp = this.list[i];
				break;
			}
		}
		return tmp;
	}

	@Override
	public Item searchOrder(int order) {
		Item tmp = null;
		if (this.list[order - 1] != null) {
			tmp = this.list[order - 1];
		}
		return tmp;
	}

	@Override
	public void drainOut() {
		this.list = new Item[this.maxSize];
	}

	@Override
	public Item remove(int order) {
		Item tmp = null;
		if (this.list[order -1] != null) {
			tmp = this.list[order -1];
			this.list[order -1] = null;
		}
		
		return tmp;
	}
}
