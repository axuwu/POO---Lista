package Lista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListIteratorTest {

    @Test
    void hasNext() {
        //Verificar se existe proximo elemento
        SinglyLinkedList lList = new SinglyLinkedList();
        SinglyLinkedListIterator iterator = new SinglyLinkedListIterator(lList);
        SingleListNode listNode = new SingleListNode("head");
        SingleListNode anotherNode = new SingleListNode("tail");
        listNode.setNext(anotherNode);

        iterator.previous=listNode;
        iterator.next=anotherNode;

        //dar true porque tem nextNode
        assertEquals(true, iterator.hasNext());
    }

    @Test
    void next() {
        //Avancar para o proximo elemento
        SinglyLinkedList lList = new SinglyLinkedList();
        SinglyLinkedListIterator iterator = new SinglyLinkedListIterator(lList);
        SingleListNode listNode = new SingleListNode("head");
        SingleListNode anotherNode = new SingleListNode("tail");
        listNode.setNext(anotherNode);

        iterator.previous=listNode;
        iterator.next=anotherNode;

        assertEquals(anotherNode, iterator.next());
    }

    @Test
    void rewind() {
        //Recomecar
        SinglyLinkedList lList = new SinglyLinkedList();
        SinglyLinkedListIterator iterator = new SinglyLinkedListIterator(lList);
        SingleListNode listNode = new SingleListNode("head");
        SingleListNode anotherNode = new SingleListNode("tail");
        listNode.setNext(anotherNode);

        iterator.previous=listNode;
        iterator.next=anotherNode;

        iterator.rewind();

        assertEquals(null, iterator.rewind());
    }
}