## Factory method Pattern

This pattern is useful when we need to create many objects, but we 
don't specify the concrete class. It let subclasses to decide which 
concrete classes need to instantiate.

Factory method makes more customizable design, we can easily add new
operation to defined process without any complication. It also 
follows the Dependency Inversion principle.

Core implementation:

```
public interface Product{
}

public class PorductA impements Product{
}

public class PorductB impements Product{
}

public interface Factory {

    Product makeProduct();
    
}

public class FactoryA implements Factory {
    
    public Product makeProduct(){
       return new ProductA();
    }

}

public class FactoryB implements Factory {
    
    public Product makeProduct(){
       return new ProductB();
    }

}

Factory factory = new FactoryA();
Product productA = factory.makeProduct();
```