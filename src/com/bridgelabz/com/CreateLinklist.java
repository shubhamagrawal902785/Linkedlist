package com.bridgelabz.com;
import org.w3c.dom.Node;
public class CreateLinklist {
	 Node head;
	    class Node {
	        String data; 
	        Node next;   
	        Node(String data){
	            this.data = data;
	            this.next = null;
	        }
	    }
	    //Adding the data in first position
	    public void addFirst(String data){
	        Node newNode = new Node(data); 
	        if(head == null){              
	            head = newNode;
	            return;
	        }
	        newNode.next = head;
	        head = newNode;
	    }

	    // Adding the data to the last
	    public void addLast(String data){
	        Node newNode = new Node(data);
	        if(head == null){
	            head = newNode;
	            return;
	        }
	        Node tempNode = head;
	        while(tempNode.next != null){
	            tempNode= tempNode.next;
	        }
	        tempNode.next = newNode;
	    }
	    //Printing the code
	    void Print() {
	        if (head == null) {                                  
	            System.out.println("Linked list is empty...");
	            return;
	        }
	        Node tempNode = head;                                 
	        while (tempNode != null) {                          
	            System.out.print(tempNode.data + "-");         
	            tempNode = tempNode.next;                      
	        }
	    }
	    
	    public static void main(String[] args) {
	    	CreateLinklist obj = new CreateLinklist();

	        obj.addFirst("56");
	        obj.addFirst("30");
	        obj.addFirst("70");

	        obj.Print();
	    }
}