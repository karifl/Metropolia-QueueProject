package queueProject;

public class Queue {
	private ListItem head;
	private ListItem tail;
	private int size;
	
	
	public Queue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	public void push(String data) {
		ListItem newItem = new ListItem();
		newItem.setData(data);
		if (head == null) { // jos jonossa ei ole aikaiempaa alkiota?
			head = newItem;	 // uusi alkio aloittaa jonon
		} else {
			tail = head;
			while (tail.getNext()!= null) { //katsotaan jono läpi viimeiseen alkioon asti
				tail = tail.getNext();
			}
			tail.setNext(newItem); //asetetaan uusin alkio viimeiseksi
		}
		size++;
		System.out.println("Alkio "+ data +" lisätty jonon perään");
		
	}
	
	public ListItem pop() {
		if(head == null) {
			System.out.println("Virhe: ei alkioita.");
			return head;
		}else {
			ListItem dropItem = new ListItem();
			dropItem.setData(head.getData());
			head = head.getNext();
			size--;
			return dropItem;	
		}	
	}
	
	public void printItems() {
		if(head == null) {
			System.out.println("Jono on tyhjä.");
		} else {
			ListItem printItem = head;
			while (printItem.getNext()!= null) {
				System.out.println(printItem.getData());
				printItem = printItem.getNext();
			}
			System.out.println(printItem.getData());
		}
	}
	
	public int getSize() {
		return size;
	}
	
}
