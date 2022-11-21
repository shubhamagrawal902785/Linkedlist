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

	    // Counting the size
	    public int size() {
	        int count = 0;

	        Node temp = head;

	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }

	        return count;

	    }
	        // inserting the data in between
	    public void insertIndex(int userIndex, String data) {
	    	CreateLinklist obj1 = new CreateLinklist();

	        // User trying to insert a first position
	        if (userIndex == 0)
	            obj1.addFirst(data);

	            // User trying to insert a last position
	        else if (userIndex == size())
	            obj1.addLast(data);

	            // User trying to insert a invalid position
	        else if (userIndex < 0 || userIndex >= size())
	            System.out.println("Invalid index");

	            // User trying to insert a specific index
	        else {
	            // Creating New Node
	            Node newNode = new Node(data);

	            // To track traversing
	            int index = 0;

	            // Pointers to track left & right side elements
	            Node left = head;
	            Node right = left.next;

	            // Traverse or Move till last element before user entered index
	            while (index < userIndex - 1) {
	                left = left.next;
	                right = right.next;
	                index++;
	            }
	            // Connecting new Node with right side elements
	            newNode.next = right;

	            // Connecting left side elements with new Node
	            left.next = newNode;
	        }
	    }

	    // Deleting the first element
	    public void deleteFirst(){
	        if(head == null){
	            System.out.println(" the list is empty");
	            return;
	        }
	        head = head.next;
	    }

	    // deleting the last element
	    public void deleteLast(){
	        if(head == null){
	            System.out.println(" the list is empty");
	            return;
	        }
	        if(head.next == null){
	            head= null;
	            return;
	        }
	        Node secoundLast = head;
	        Node lastNode = head.next;
	        while(lastNode.next != null){
	            lastNode = lastNode.next;
	            secoundLast = secoundLast.next;
	        }
	        secoundLast.next= null;
	    }

	    // Ability to search
	    public void Search(String Data1) {
	        if (head == null) {                                  // Checking f head is empty or not
	            System.out.println("Linked list is empty...");
	            return;
	        }
	        int check = 0;
	        Node tempNode = head;                                 // Taking temp node
	        while (tempNode != null) {
	            check++;
	            if (tempNode.data == Data1) {
	                System.out.println(" The data is present" + tempNode.data + " at " + check);
	                break;
	            }else {
	                tempNode = tempNode.next;
	            }
	        }
	        if (tempNode == null){
	            System.out.println(" THe data is not present");
	        }
	    }

	    //Ability to delete an element
	    public void delete(Object data) {
	        Node temp = head, prev =null;
	        if (temp != null && temp.data == data) {
	            head = temp.next;
	            return;
	        }
	        while (temp != null && temp.data !=data) {
	            prev= temp;
	            temp = temp.next;
	        }
	        if(temp == null)
	            return;
	        prev.next=temp.next;
	    }
	    
	    public static void main(String[] args) {
	    	CreateLinklist obj = new CreateLinklist();

	        obj.addLast("56");
	        obj.addLast("30");
	        obj.addLast("70");
	        //obj.insertIndex(2, "Your");
	        //obj.deleteFirst();
	        //obj.deleteLast();
	        obj.Search("40");
	        obj.insertIndex(2, "40");
	        obj.delete("40");
	        obj.Print();
	    }
	}