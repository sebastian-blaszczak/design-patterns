## Abstract factory Pattern

This pattern is useful when whe don't want use inheritance, because
it will increase complexity of classes and add to many unnecessary 
methods.

Decorator add own specific behavior to each decorating items. We can 
dynamically add new behaviors to existing object. It consists of **base 
class or interface** and **decorator class**.

Core implementation:

```
public interface BaseInterface {

    void doThis();
    
}

public class BaseClass implements BaseInerface{
    void doThis{
    }
}

public class DecoratorClass extends BaseClass {
    
    private BaseClass inner;

    public DecoratorClass(BaseClass inner){
        this.inner = inner;
    }

    void doThat{
        inner.doThis();
        doSth();
    }
    
}

BaseInterface base = new DecoratorClass(new BaseClass()));
```