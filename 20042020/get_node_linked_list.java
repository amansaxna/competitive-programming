//get_node_linked_list
static int getNode(SinglyLinkedListNode head, int positionFromTail) 
    {
        SinglyLinkedListNode temp = head;
        int size =0;
        while(temp.next!= null)
        {
            temp = temp.next;
            size++;
        } 
        temp = head;
        size = Math.abs(positionFromTail - size);
        int i =0;
        while(i != size)
        {
            temp = temp.next;i++;
        }
        return temp.data;

    }