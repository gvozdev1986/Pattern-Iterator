package by.ed.hvozdzeu.patterniterator;

public class ConcreteAggregate implements Aggregate {

    private String[] array = {"one", "two", "tree", "four", "five"};

    @Override
    public Iterator getIterator() {
        return new ArrayIterator();
    }


    private class ArrayIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if(index < array.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return array[index++];
        }

    }



}
