# Pattern-Iterator

Design pattern Iterator provides universal sequential access to the elements of the collection. It is good in those cases when it is necessary to implement a single mechanism for sorting the elements of collections, independent of the method of implementing any of these collections.

Diagram:</br>
![Image alt](https://github.com/gvozdev1986/Pattern-Iterator/blob/master/DiagramPatternIterator.png)


Example:

```java
    //String array
    String[] array = {"one", "two", "tree", "four", "five"};
```


```java

    public static void main(String[] args) {
    
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.getIterator();

        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }

    }

```

RESULT:
```text
   one
   two
   tree
   four
   five    
```
