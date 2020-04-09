## Observer Pattern

This pattern creates One-To-Many relation. The core of this pattern
is that **Subject** have many **Observers**, whenever Subject changes
his state, Observers will know about it.

We can image this pattern as newspaper company in this case it is 
**Subject**, and we want a daily magazine. We need to subscribe to 
newspaper company at this moment we become a subscriber in other 
words **Observer**.

Observer pattern is good for cases when we have data in one place 
and want to spread this information in multiple places. This pattern 
also provide lose coupling between objects.

Core implementation:


```
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void update();
    
}

public interface Observer {

    void update();
    
}
```