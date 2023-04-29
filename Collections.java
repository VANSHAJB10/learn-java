*1. Collection Framework is a combination of classes and interface, which is used to store and manipulate the data in the form of objects. 
It provides various 
    'classes' such as ArrayList, Vector, Stack, and HashSet, etc. 
and 'interfaces' such as List, Queue, Set, etc.

    1.1
    Collection interface: Collection (java.util.Collection) is the primary interface, and ! *** every collection must implement this interface. *** !
CODE--> public interface Collection<E>extends Iterable  
    1.2
    List interface: List interface extends the Collection interface, and it is an ordered collection of objects. 
    It contains duplicate elements. It also allows random access of elements.
CODE--> public interface List<E> extends Collection<E> 
    1.3
    Set interface: Set (java.util.Set) interface is a collection which cannot contain duplicate elements. 
    It can only include inherited methods of Collection interface.
CODE--> public interface Set<E> extends Collection<E> 
    1.4
    Queue interface: Queue (java.util.Queue) interface defines queue data structure, which stores the elements in the form FIFO (first in first out).
CODE--> public interface Queue<E> extends Collection<E>  
    1.5
    Dequeue interface: it is a double-ended-queue. It allows the insertion and removal of elements from both ends. 
    It implants the properties of both Stack and queue so it can perform LIFO (Last in first out) stack and FIFO (first in first out) queue, operations.
CODE--> public interface Dequeue<E> extends Queue<E> 
    1.6
    Map interface: A Map (java.util.Map) represents a key, value pair storage of elements. Map interface ! *** does not implement the Collection interface. ***!
    It can only contain a unique key but can have duplicate elements. There are two interfaces which implement Map in java that are Map interface and Sorted Map.
        
        
        
Advantages of genric collection-->
--> If we use the generic class, we don't need typecasting.
--> It is type-safe and checked at compile time.
--> Generic confirms the stability of the code by making it bug detectable at compile time
