// garbage collection
class HappyGarbage01 
{ 
    public static void main(String args[]) 
    {
        HappyGarbage01 h = new HappyGarbage01(); 
        h.methodA(); /* Line 6 */
    } 
    Object methodA() 
    {
        Object obj1 = new Object(); 
        Object [] obj2 = new Object[1]; 
        obj2[0] = obj1; 
        obj1 = null; 
        return obj2[0]; 
    } 
}

/* 
Garbage collector is never invoked in methodA()

Garbage collection takes place after the method has returned its reference to the object. 
The method returns to line 6, there is no reference to store the return value. so garbage collection takes place after line 6. */
