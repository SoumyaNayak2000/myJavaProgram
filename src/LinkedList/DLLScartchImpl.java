package LinkedList;

public class DLLScartchImpl {
    Node head;
    int size;
    class Node {
        String data;
        Node next;
        Node prev;

        Node(String str) {
            this.data = str;
            this.next = null;
            this.prev = null;
        }
    }

    //       <-my-><-name-><-is-><-Soumya-><-Ranjan-><-Nayak->null
    //   head--^
    public void removeFirst(){
        if (head == null) {
            return;
        }
        head.next.prev=null;
        head=head.next;

    }
    public void removeLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        //       <-my-><-name-><-is-><-Soumya-><-Ranjan-><-Nayak->null
        //   head--^
        //   ptr--^
        Node ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;

    }
    //         1      2      3      4           5        6
    //       <-my-><-name-><-is-><-Soumya-><-Ranjan-><-Nayak->null
    //   head--^
    //                     i=3 temp--^
    //                                     ptr--^
    //  pos =5
    public void removeAnywhere(int pos){
        if(pos<=0){
            System.out.println("get Lost");
            return;
        }
        if(pos==1){
            head.next.prev=null;
            head=head.next;
            return;
        }
        Node ptr=head.next;
        Node temp=head;
        //          1     2      3     4       5       6           7       8
        //       <-my-><-name-><-is-><-mr-><-Soumya-><-Ranjan-><-Nayak-><-end->null     i=5    pos=7    till  7-1=6
        //                                              temp
        //                                                        ptr
        for(int i=1;i<pos-1;i++){
            temp=ptr;
            ptr=ptr.next;
        }
        if(ptr.next==null) {
            temp.next=null;
            return;
        }
        temp.next = ptr.next;
        ptr.next.prev = temp;
    }

    public void addFirst(String str){

        Node newNode=new Node(str); //   [null  My  null]
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head=newNode;
    }
    public void adLast(String str){
        Node newNode=new Node(str);
        if(head==null){
            head=newNode;
            return;
        }
        //                                                               [null  My  null]
        //       null<-Nayak-><-Ranjan-><-Soumya-><-is-><-name-><-my->null
        //        head--^
        //         ptr--^
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;
        newNode.prev=ptr;

    }
    //         1      2      3       4         5        6
    //       <-my-><-name-><-is-><-Soumya-><-Ranjan-><-Nayak->null
    //   head--^
    //                  ptr--^
    //     [null  mr  null]
    public void addSomewhere(String str,int pos) {
        Node newNode = new Node(str);
        if (pos <= 0) {
            System.out.println("get LOst");
            return;
        }
        if(pos==1){
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head=newNode;
            return;
        }

        Node ptr = head.next;
        Node temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = ptr;
            ptr = ptr.next;
        }
        newNode.prev = temp;
        newNode.next = ptr;
        temp.next = newNode;
        if (ptr != null) {
            ptr.prev = newNode;
        }
    }
    //       null<-my-><-name-><-is-><-mr-><-Soumya-><-Ranjan-><-Nayak-><-end->null
    //    cuttent--^
    //temp--^
    // <-my-><-name-><-is-><-mr-><-Soumya-><-Ranjan-><-Nayak-><-end->null
    public void reverseDoblyLinklist(){
        Node temp=null;
        Node current=head;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
    }
    public Node reverseDoblyLinklistrecurssive(Node head){
        Node temp=head.prev;
        head.prev=head.next;
        head.next=temp;
        if(head.prev==null){
            return head;
        }
        return reverseDoblyLinklistrecurssive(head.prev);
    }
        //int count=1;
        //         1      2      3       4         5        6        7
        //       <-my-><-name-><-is->  <-Soumya-><-Ranjan-><-Nayak->null
        //   head--^
        //                                                temp--^
        //                                                          ptr--^

//        while(count!=pos-1 && ptr.next!=null){
//            ptr=ptr.next;
//            count++;
//        }
//        newNode.next=ptr.next;//  [  is  mr][null  mr  soumya] [   soumya    ]
//        ptr.next.prev=newNode;
//        newNode.prev=ptr;
//        ptr.next=newNode;
//
//    }
    //      <-my-><-name-><-is-><-Soumya-><-Ranjan-><-Nayak->null
    public void deleteNode(Node n){
        n.prev.next=n.next;
        n.next.prev=n.prev;
    }
    public void printList(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print("<-"+ ptr.data + "->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLLScartchImpl list=new DLLScartchImpl();
        list.addFirst("hey");
        list.adLast("my");
        list.adLast("name");
        list.adLast("is");
        list.adLast("Soumya");
        list.adLast("Ranjan");
        list.adLast("Nayak");
        list.adLast("What is Yours");
        list.printList();
        list.removeFirst();
        list.printList();
       list.removeLast();
       list.printList();
       list.addSomewhere("mr",4);
       list.printList();
        list.addSomewhere("end",8);
        list.printList();
        list.addSomewhere("start",1);
        list.printList();
//        list.addSomewhere("start1",2);
//        list.printList();
       list.removeAnywhere(1);
       list.printList();
       list.head=list.reverseDoblyLinklistrecurssive(list.head);
       list.printList();

    }
}
