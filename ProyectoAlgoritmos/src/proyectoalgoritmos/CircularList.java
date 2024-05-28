/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoalgoritmos;

/**
 *
 * @author nicos
 */
public class CircularList {

    private Nodo head;
    private Nodo tail;

    public CircularList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;

    }

    public void addFunction(String function) {

        Nodo newNodo = new Nodo(function);

        if (isEmpty()) {

            head = newNodo;

            tail = newNodo;

            tail.setNext(head);

        } else {

            tail.setNext(newNodo);

            newNodo.setNext(head);

            tail = newNodo;

        }

    }

    public static void main(String[] args) {
        
        
        
    }

}
