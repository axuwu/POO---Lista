package Lista;

public class SingleListNode {

    protected Object element;
    protected SingleListNode next;

    //Construtor
    public SingleListNode(Object element, SingleListNode nextNode){
        this.element=element;
        this.next=nextNode;
    }

    public SingleListNode(Object element){
        this.element = element;
    }

    //Obter elemento
    public Object getElement(){
        return element;
    }

    //Obter proximo no'
    public SingleListNode getNext(){
        return next;
    }

    //Alterar o proximo no'
    public void setNext(SingleListNode node){
        this.next=node;
    }
}
