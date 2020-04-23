//merge_linked_list

/*
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) 
    {
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head1;
        while(temp1.next != null)
        {
            temp1 = temp1.next;
        }
        temp1.next = head2;
        //sort the linked list
        while(temp2.next != null)
        {
            if(temp2.data > temp2.next.data )
            {
                System.out.println(temp2.data+":"+temp2.next.data);
                int dt = temp2.data;
                temp2.data = temp2.next.data;
                temp2.next.data = dt;
                
            }
            temp2 = temp2.next;
        }

*/