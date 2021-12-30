package main.java.udemy.abstract_nested_interface;

public class MyLinkedList implements NodeList{
    protected ListItem root;
    public MyLinkedList(ListItem item) {
        root = item;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse() {

    }
}
