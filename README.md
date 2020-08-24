# 设计模式
    设计模式可以分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural Patterns）、行为型模式（Behavioral Patterns）
## **创建型模式**
这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。
#### 创建型模式包含
    1）工厂方法模式
    2）抽象工厂方法模式
    3）单例模式
    4）建造者模式
    5）原型模式
### **`1.工厂方法模式（Factory Method Pattern）`**
    在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
    工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建
#### 工厂方法主要包括三种
    1.1.普通工厂方法模式
        就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
        步骤：
            1）首先创建共同接口
            2）创建各自的实现类
            3）创建工厂类

    1.2.多个工厂方法模式
        多个工厂方法模式是提供多个工厂方法，分别创建对象。

    1.3.静态工厂方法模式
        多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
#### 工厂方法优缺点
    优点：
        1）一个调用者想创建一个对象，只要知道其名称就可以了。
        2）扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
        3）屏蔽产品的具体实现，调用者只关心产品的接口。
    缺点：
        1）增加产品，需要增加新的工厂类，导致系统类的个数成对增加，在一定程度上增加了系统的复杂性。

### **`2.抽象工厂方法模式（Abstract Factory Pattern）`**
    工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
#### 适用情况
    1）一个系统要独立与它产品的创建、组合和表示时
    2）一个系统要由多个产品系列中的一个来配置时
    3）要强调一系列相关的产品对象的设计以便进行联合使用时
    4）提供一个产品类库，而只想显示它们的接口而不是实现时
#### 参与角色
* AbstractFactory(抽象工厂)：用于声明生成抽象产品的操作接口;
* ConcreteFactory(具体工厂)：实现创建具体产品对象的操作；
* AbstractProduct(抽象产品)：为每种产品声明接口，在抽象产品中定义了产品的抽象业务方法；
* Product(具体产品)：定义具体工厂生产的具体产品对象，实现AbstractProduct接口；
* Client(客户):仅使用由AbstractFactory和AbstractProduct类声明的接口。
#### 抽象工厂方法优缺点
    优点：
        1）分离了具体的类
        2）它使得易于交换产品系列
        3）它有利于产品的一致性
    缺点：
        1）难以支持新种类的产品
### **`3.单例模式（Singleton Pattern）`**
#### 单例模式定义
    保证一个类仅有一个实例，并提供一个访问它的全局访问点。
    单例模式一般体现在类声明中，单例的类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
#### 单例模式优点
1. 在内存里只有一个实例，减少内存的开销，尤其是频繁的创建和销毁实例（比如网站首页页面缓存）
2. 避免对资源的多重占用（比如写文件操作）
#### 单例模式分类
* 饿汉式
* 懒汉式
* 双重校验锁
* 枚举式
#### 饿汉式
