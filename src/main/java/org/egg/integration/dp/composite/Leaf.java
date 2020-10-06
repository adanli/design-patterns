package org.egg.integration.dp.composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("can not add");
    }

    @Override
    public void remove(Component component) {
        System.out.println("can not remove");
    }

    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
