package Lista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void getFirst() {
        //Obter o primeiro elemento
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode nodehead = new SingleListNode("P00");
        llist.head = nodehead;
        Object element = llist.head.getElement();

        assertEquals(element, llist.getFirst());
    }

    @Test
    void getLast() {
        //Obter o ultimo elemento
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode listNode = new SingleListNode("head");
        SingleListNode anothernode = new SingleListNode("tail");
        listNode.setNext(anothernode);

        llist.head = listNode;
        System.out.println(llist.getHead().getNext().getElement());
        assertEquals("tail", llist.getLast());
    }

    @Test
    void get() {
        //Obter o elemento na posicao n
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode nodelist0 = new SingleListNode("node position 0"); //head
        SingleListNode nodelist1 = new SingleListNode("node position 1"); //
        SingleListNode nodelist2 = new SingleListNode("node position 2"); //tail

        llist.head=nodelist0; //head->array[0]
        llist.head.setNext(nodelist1); //array[1]
        SingleListNode node1 = llist.head.getNext();
        node1.setNext(nodelist2); //tail->array[2]

        assertEquals("node position 0", llist.get(0));
        assertEquals("node position 1", llist.get(1));
        assertEquals("node position 2", llist.get(2));
    }

    @Test
    void insertFirst() {
        //Inserir elemento no inicio da lista
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode node = new SingleListNode("POO");
        System.out.println(node.getElement());

        llist.insertFirst("whatever");
        System.out.println(llist.getFirst());

        assertEquals("whatever", llist.getFirst());
    }

    @Test
    void insertLast() {
        //Inserir elemento no final da lista
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode listNode = new SingleListNode("head");
        SingleListNode anothernode = new SingleListNode("not tail");
        listNode.setNext(anothernode);

        llist.head = listNode;

        llist.insertLast("tail");
        System.out.println(llist.getLast());

        assertEquals("tail", llist.getLast());
    }

    @Test
    void insert() {
        //Inserir elemento na posicao n da lista
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode nodelist0 = new SingleListNode("head"); //head
        SingleListNode nodelist1 = new SingleListNode("maybe middle idk"); //
        SingleListNode nodelist2 = new SingleListNode("tail"); //tail

        llist.head=nodelist0; //head->array[0]
        llist.head.setNext(nodelist1); //array[1]
        SingleListNode node1 = llist.head.getNext();
        node1.setNext(nodelist2); //tail->array[2]

        llist.insert("middle", 1);
        System.out.println(llist.get(1));

        assertEquals("middle", llist.get(1));
    }

    @Test
    void removeFirst() {
        //Remover elemento do incio da lista
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode listNode = new SingleListNode("not head");
        SingleListNode anotherNode = new SingleListNode("true head");
        listNode.setNext(anotherNode);

        llist.head = listNode;
        llist.removeFirst();

        assertEquals("true head", llist.get(0));
    }

    @Test
    void removeLast() {
        //Remover elemento do final da lista
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode nodeZero = new SingleListNode("head");
        SingleListNode nodeOne = new SingleListNode("true tail");
        SingleListNode nodeTwo = new SingleListNode("not tail");
        nodeZero.setNext(nodeOne);
        nodeOne.setNext(nodeTwo);

        llist.head = nodeZero;
        llist.removeLast();

        System.out.println(llist.getLast());

        assertEquals("true tail", llist.getLast());
    }

    @Test
    void remove() {
        SinglyLinkedList llist = new SinglyLinkedList();
        SingleListNode nodeZero = new SingleListNode("head");
        SingleListNode nodeOne = new SingleListNode("not middle");
        SingleListNode nodeTwo = new SingleListNode("true middle");
        SingleListNode nodeThree = new SingleListNode("tail");
        nodeZero.setNext(nodeOne);
        nodeOne.setNext(nodeTwo);
        nodeTwo.setNext(nodeThree);

        llist.head = nodeZero;
        llist.remove(1);

        System.out.println(llist.get(1));

        assertEquals("true middle", llist.get(1));
    }


    @Test
    void getIterator() {
        SinglyLinkedList lList = new SinglyLinkedList();
        SinglyLinkedListIterator iter = new SinglyLinkedListIterator(lList);
        SingleListNode nodeZero = new SingleListNode("head");
        lList.head = nodeZero;

        assertEquals(true, lList.getIterator().hasNext());
    }
}