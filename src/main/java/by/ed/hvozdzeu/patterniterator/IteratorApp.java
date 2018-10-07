package by.ed.hvozdzeu.patterniterator;

public class IteratorApp {

    public static void main(String[] args) {

        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.getIterator();

        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }

    }

}
