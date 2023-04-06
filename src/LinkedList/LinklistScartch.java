package LinkedList;

public class LinklistScartch {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String str){
            this.data=str;
            this.next=null;
        }
    }
    //       1                 2     3   4   5       6       7      8
    //       my             ->name->is->mr->Soumya->Ranjan->Nayak->end->null
    // head--^
    //  ptr--^
    public void removeLast(){
        //if there is no node
        if(head==null){
            System.out.println("get out");
            return;
        }
        if(head.next==null){
            head=null;
           return;
        }
        //if there is node
        Node ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;

    }
    public void removeFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    //       1    2    3   4    5       6       7      8
    //       my->name->is->mr->Soumya->Ranjan->Nayak->end->null          pos=6    count = 5
    // head--^
    //                      ptr--^
    public void removeAnywhere(int pos){
        if(pos<=0){
            return;
        }
        if(pos==1){
            head=head.next;
            return;
        }                                    //4
           //               my->amit->mishra->null
        int count=1;
        Node ptr=head;
        while(count!=pos-1 && ptr!=null){
            ptr=ptr.next;
            count++;
        }
        ptr.next=ptr.next.next;
    }
    public void addLast(String str){
        Node newNode=new Node(str);
        if(head==null){
            head=newNode;
            return;
        }
        //->name->is->mr->Soumya->Ranjan->Nayak->end->null
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=newNode;

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
        LinklistScartch list=new LinklistScartch();
        list.removeLast();
        list.addLast("my");
        list.addLast("amit");
        list.addLast("mishra");
        list.printList();
       list.removeAnywhere(3);
       list.printList();
    }
}
