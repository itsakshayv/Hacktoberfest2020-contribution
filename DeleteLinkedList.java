 static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
         if(head==null)
         return head;
         if(position==0){
         head = head.next;
         return head;
         }
         else{
             int num=1;
             SinglyLinkedListNode save = head;
             SinglyLinkedListNode ptr=head.next;
             while(ptr!=null && position>num){
                 num++;
                 save=ptr;
                 ptr=ptr.next;
             }
             if(ptr==null){
                 save.next=null;
             }
             else{
                 save.next=ptr.next;
             }
             return head;
         }
    }
