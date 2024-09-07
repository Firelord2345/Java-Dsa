public class SinglyLinkedList{
        private Node head;
        private static class Node{
            private int data;
            private Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static void main(String[] args) {
            SinglyLinkedList sll=new SinglyLinkedList();
            // inserting  the data manually.
            // sll.head=new Node(25);
            // Node first=new Node(27);
            // Node second=new Node(30);
            // sll.head.next=first;
            // first.next=second;
            sll.insertonFirstNode(15);
            sll.insertLastNode(49);
            sll.insertAtAnyPostion(2,35);
            sll.display();
            // System.out.println(sll.deleteFirstNode().data);

            // System.out.println(sll.deleteLastNode().data);
            //    sll.deleteAtanyPostion(1);
            // if(sll.find(15)){
            //     System.out.println("Search key found");
            // }else{
            //     System.out.println("Search key not found");
            // }
           sll.reverse();
           


            sll.display();
            int n= sll.length();
            System.out.println();
            System.out.print(n);
        }
        public void display (){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.print("Null");
        }
        public int length(){
            Node current=head;
            int count=0;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }
        public void insertonFirstNode(int value){
            Node newnode=new Node(value);
            newnode.next=head;
            head=newnode;
        }
        public void insertLastNode(int value){
            Node newnode= new Node(value);
            if(head==null){
                insertonFirstNode(value);
            }
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;

        }
        public void insertAtAnyPostion(int position,int value){
            Node newnode = new Node(value);
            Node previous= head;
            int count=1;
            if(position==1){
                insertonFirstNode(value);
            }
            if(count<position-1){
                previous=previous.next;
                count++;
            }
            Node current=previous.next;
            previous.next=newnode;
            newnode.next=current;
        }
        public Node deleteFirstNode(){
            if(head==null){
                return null;
            }
             Node temp=head;
             head=head.next;
             temp.next=null;
             return temp; 
        }
        public Node deleteLastNode(){
            if(head==null){
                return head;
            }
            if(head.next==null){
                Node temp=head;
                head=null;
                return temp;
            }
            Node previouse=null;
            Node current=head;
            while(current.next!=null){
                previouse=current;
                current=current.next;

            } 
            previouse.next=null;
            return current;
        }
        public void deleteAtanyPostion(int position){
            if(position==1){
                head=head.next;
            }else{
                Node previous=head;
                int count=1;
                while(count<position-1){
                    previous=previous.next;
                    count++;
                }
                Node current=previous.next;
                previous.next=current.next;

            }
        }
        public boolean find(int searchkey){
            if(head==null){
                return false;
            }
            Node current=head;
            while(current!=null){
                if(current.data==searchkey){
                    return true;
                }
                current=current.next;
            }
            return false;
        }
        public Node reverse(){
            if(head==null){
                 return null;
            }
            Node current=head;
            Node previous=null;
            Node next=null;
            while(current!=null){
                next=current.next;
                current.next=previous;
                previous=current;
                current=next;
            }
            head=previous;
            return head;
        }

}
