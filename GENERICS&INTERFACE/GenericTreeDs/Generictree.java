package GenericTreeDs;

import java.util.ArrayList;
import java.util.Scanner;

public class Generictree {
	Scanner scn=new Scanner(System.in);
	private class Node{
		int data;
		ArrayList<Node> children=new ArrayList<>();
		
		
	}
	private Node root;
	public Generictree() {
		root=construct(null,-1);
	}
	private Node construct(Node parent,int ith) {
//		prompt
		if(parent==null) {
			System.out.println("Entre the data for root node");
		}else {
		System.out.println("enter the data for"+ith+"child of"+parent.data+"?");
		}
//		take intput of data
		int item=scn.nextInt();
		
//		new Node
		Node nn=new Node();
		
//		update data
		nn.data=item;
		
//		prompt for no of children for each node noc=no of children
		System.out.println("Entre the number of children for"+nn.data+"?");
		int noc=scn.nextInt();
		
//		loop for creating no of children
		for(int j=0;j<noc;j++) {
			Node child=construct(nn,j);
			nn.children.add(child);
		}
		return nn;
	}
	public void display() {
		System.out.println("--------------------");
		display(root);
		System.out.println("--------------");
	}
     private void display(Node node) {
//    	 self work
    	 String str=node.data+"->";
    	 
    	 
    	 for(Node child:node.children) {
    		 str+=child.data+" ";
    		 
    	 }
    	 str+=".";
    	 System.out.println(str);
//    	 smaller probklem
    	 for(Node child:node.children) {
    		 display(child);
    		 
    	 }
     }
//cs=child size
     public int size() {
    	 return size(root);
     }
     private int size(Node node) {
//    	 ts=total size
    	 int ts=0;
    	 for(Node child:node.children) {
    		 int cs=size(child);
    		 ts+=cs;
    	 }
    	 return ts+1;
    	 
     }
	
     public int max() {
    	 return max(root);
     }
     private int max(Node node) {
//    	 tm=total max
    	 int tm=node.data;
    	 for(Node child:node.children) {
//    		 cm=child max
    		 int cm=max(child);
    		 if(cm>tm) {
    			 tm=cm;
    		 }
    	 }
    	 return tm;
     }
	
     public int ht() {
    	 return ht(root);
     }
     public int ht(Node node) {
//    	 ch=child height th=total height
    	 int th=-1;
    	 for(Node child:node.children) {
    		int ch=ht(child);
    		if(ch>th) {
    			th=ch;
    		}
    	 }
    	 return th+1;
     }
	
     public boolean find(Node node,int item) {
    	 if(node.data==item) {
    		 return true;
    	 }
    	 boolean tf=false;
    	 for(Node child:node.children) {
    		 boolean cf=find(child,item);
    		 tf=tf||cf;
    	 }
    	 return tf;
     }
	
	
	
}
