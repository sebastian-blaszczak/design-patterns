## Abstract factory Pattern

This pattern is useful when we need to create many objects, but we 
don't specify the concrete class. It let factory to decide which 
concrete classes need to instantiate.

Abstract factory makes more customizable design, we can easily add new
operation to defined process without any complication. It also 
follows the Dependency Inversion principle.

Core implementation:

```
public interface Poduct {
}

public class ProductA implements Product {
}

public class ProductB implements Product {
}

public class BaseClass implements BaseInerface{
    void doThis{
    }
}

enum FactoryType{
    TYPE_A, TYPE_B
}

abstract class AbstractFactory {
    
    static AbstractFactory getFactory(FactoryType type){
    switch(type){
        case TYPE_A:
            return new FactoryProductA();
        case TYPE_B:
            return new FactoryProdutB();
    }
    
    abstract Product makeProduct();
}

public class FactoryProductA extends AbstractFactory{

    @override
    Product makeProduct(){
        return new ProductA();
    }

}

public class FactoryProductB extends AbstractFactory{

    @override
    Product makeProduct(){
        return new ProductB();
    }

}


AbstractFactory factory = AbstractFactory.getFactory(TYPE_A);
Product productA = factory.makeProduct();
```