package Lista;

public class SinglyLinkedListIterator {
    protected SinglyLinkedList list;
    protected int index;

    protected SingleListNode previous;
    protected SingleListNode next;

    //Constructor
    public SinglyLinkedListIterator(SinglyLinkedList list){
        this.list=list;
        next = list.getHead();
    }

    //Verificar se existe proximo elemento
    public boolean hasNext(){
        if (next != null)
            return true;
        else
            return false;
    }

    //Avancar para o proximo elemento
    public SingleListNode next(){
        if (next == null)
            return null;
        previous = next;
        next = next.getNext();
        index++;
        return previous;
    }

    //Recomecar
    public SingleListNode rewind(){
        previous = null;
        next = list.getHead();
        index=0;
        return next;
    }
}
