package Lista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleListNodeTest {

    @Test
    void getElement() {
        //Obter elemento
        SingleListNode listnode = new SingleListNode("UAL", null);
        assertEquals("UAL", listnode.getElement());
    }

    @Test
    void getNext() {
        //Obter proximo no'
        SingleListNode anothernode = new SingleListNode("POO");
        SingleListNode listnode = new SingleListNode("UAL", anothernode);
        assertEquals(anothernode, listnode.getNext());
    }

    @Test
    void setNext() {
        //Alterar o proximo no'
        SingleListNode listNode = new SingleListNode("UAL");
        SingleListNode anothernode = new SingleListNode("POO");
        listNode.setNext(anothernode);
        assertEquals(anothernode, listNode.getNext());//se node-seguinte for igual ao node-anterior.getNext entao tá com setter bem feito
    }
}