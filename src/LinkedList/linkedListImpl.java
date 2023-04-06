package LinkedList;

public class linkedListImpl {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String str){
            this.data=str;
            this.next=null;
        }
    }
    public void addLast(String str){
        Node newNode=new Node(str); // [Love,null]

        if(head==null){
            head=newNode;
            return;
        }
        //
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
    }
    public void addFast(String str){
        Node newnode=new Node(str);
        newnode.next=head;
        head=newnode;
    }
//           [Divyanshi,v]->Rajat->Soumya->We->Love->Newton->School->Hello->null
      //   head--^
      //      ptr--^
    public void removeLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
       Node ptr=head;
       while(ptr.next.next!=null){
           ptr=ptr.next;
       }
       ptr.next=null;
    }
    public void removeFirst(){
        if (head==null){
            return;
        }
        head=head.next;
    }
    //         1           2       3    4     5      6       7      8
     //    [Divyanshi,v]->Rajat->Soumya->We->Love->Newton->School->Hello->null
    // head--^
    //                              ptr--^
    public void addSomewhere(String str,int pos){
        Node newnode=new Node(str);
        if (pos<=0){
            return;
        }
        int count=1;
        Node ptr=head;
        while(count != pos-1 && ptr.next!=null){
            ptr=ptr.next;
            count++;
        }
        newnode.next=ptr.next;
        ptr.next=newnode;
    }
    //         1           2       3    4     5      6       7      8
    //    [Divyanshi,v]->Rajat->Soumya->We->Love->Newton->School->Hello->null
    // head--^
    //                                                  ptr--^
    //                                                   c=2
    public void removeSomewhere(int pos){
        if(pos<=0){
            return;
        }
        int count=1;
        Node ptr=head;
        while(count!=pos-1 && ptr.next!=null){
            ptr=ptr.next;
            count++;
        }
        ptr.next=ptr.next.next;
    }
    //    Shresthya->Soumya->We->Love->Newton->School->null
    public void removeMiddle(){
        int count=0;
        Node ptr=head;
        while(ptr!=null){
            ptr=ptr.next;
            count++;
        }
        int pos=count/2 + 1;

        if(pos<=0){
            return;
        }
        int count1 = 1;
        ptr=head;
        while(count1!=pos-1 && ptr.next!=null){
            ptr=ptr.next;
            count1++;
        }
        ptr.next=ptr.next.next;
    }


    public void ReverseLinkedList(){
        Node prev=null;
        Node current=head;
        Node temp=null;
        while(current!=null){
            temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        head = prev;
    }


    //    Soumya->We->Love->Newton->School->null
    // head--^
    //                                  new head--^
    // school->
    public Node ReverseLinkedListRecurssion(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=ReverseLinkedListRecurssion(head.next);
        head.next.next=head;  // reversing the reference
        head.next=null; // current node next
        return newHead;
    }
    public void printList(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data + "->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        linkedListImpl list=new linkedListImpl();
        list.addLast("We");
        list.addLast("Love");
        list.addLast("Newton");
        list.addLast("School");
        list.addLast("Hello");

        list.printList();
        list.addFast("Soumya");

        list.ReverseLinkedList();
        list.printList();

        list.head=list.ReverseLinkedListRecurssion(list.head);
        list.printList();

    }
}

