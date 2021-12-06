package Lista;

public class SinglyLinkedList {

    private int numElements;
    protected SingleListNode head;
    protected SingleListNode tail;

    //Construtor
    public SinglyLinkedList(){
        numElements=0;
    }

    //extra
    public int getSize() {
        return numElements;
    }//obter size

    public SingleListNode getHead(){
        return head;
    }//obter node head

    //Obter o primeiro elemento
    public Object getFirst(){
        return head.getElement();
    }

    //Obter o ultimo elemento
    public Object getLast(){
        //TODO:

        SingleListNode nodehead = getHead();
        int position = getSize();
        int i=0;
        while(i<=position){
            nodehead = nodehead.getNext();
            i++;
        }
        return nodehead.getElement();

        //return this.tail;
    }

    //Obter o elemento na posicao n
    public Object get(int position){
        SingleListNode x = getHead();
        for (int i=0; i<position; i++){
            x = x.getNext();
        }
        return x.getElement();
    }

    //Inserir elemento no inicio da lista
    public void insertFirst(Object element){
        SingleListNode node = new SingleListNode(element, this.head);
        /**
         node.next=head;
         head = node;
         numElements++;
         **/
        this.head=node;
        if (this.tail == null){
            this.tail = this.head;
        }
        this.numElements++;
    }

    //Inserir elemento no final da lista
    public void insertLast(Object element){
        if (head == null){
            insertFirst(element);
        }else{
            SingleListNode x = head;
            while (x.next != null) {//precurer ate atingir ao ultimo elemento
                x = x.next;
            }
            x.next = new SingleListNode(element);
            numElements++;
        }
    }

    //Inserir elemento na posicao n da lista
    public void insert(Object element, int position) {
        if (position == 0) {
            insertFirst(element);
        } else {
            SingleListNode x = head;
            for (int i = 0; i < position - 1; i++) {
                x = x.next;
            }
            x.next = new SingleListNode(element, x.next);
            numElements++;
        }
    }

    //Remover elemento do incio da lista
    public Object removeFirst(){
        /**
         Object element = head.element;
         head = head.getNext;
         numElements--;
         return element;
         **/
        Object element =this.head.getElement();
        this.head = this.head.getNext();
        this.numElements--;
        return element;
    }

    //Remover elemento do final da lista
    public Object removeLast(){

        if (numElements <= 1)
            return removeFirst();
        else {
            SingleListNode x = head;

            while (x.next.next != null)
                x = x.next;

            Object temp = x.next.element;
            x.next = null;
            numElements--;
            return temp;
        }
        /**
         Object element = this.tail.getElement();
         int i = 0;
         int position = this.getSize()-1;
         SingleListNode node = this.head;
         while(i < position-1){
         node=node.getNext();
         i++;
         }
         node.setNext(null);
         this.numElements--;
         return element;
         **/
    }

    //Remover elemento da posicao n da lista
    public void remove(int position){
        if (position == 0)
            removeFirst();
        else {
            SingleListNode x = head;
            for (int i = 0; i < position - 1; i++)
                x = x.next;
            x.next = x.next.next;
            numElements--;
        }
    }

    //Parte3.2
    //Parte3.2-Obter um iterador
    public SinglyLinkedListIterator getIterator(){
        return new SinglyLinkedListIterator(this);
    }

}
