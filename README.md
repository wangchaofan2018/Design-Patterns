### 什么是设计模式

设计模式是一套被 反复使用、多数人知晓、经过分类编目的、代码设计经验的总结。

### 为什么使用设计模式

为了可重用代码，并让代码更容易被其他人理解，降低耦合度，提高内聚性


#### 设计原则
1.单一职责原则

单一职责原则的英文是 Single Responsibility Principle，缩写为 SRP。这个原则的描述是这样的：一个类或者模块只负责完成一个职责（或者功能）。

2.开闭原则

开闭原则的英文全称是 Open Closed Principle，简写为 OCP。它的描述是：对扩展开放、对修改关闭。

3.里式替换原则

里式替换原则的英文翻译是：Liskov Substitution Principle，缩写为 LSP。它的描述是 子类对象（object of subtype/derived class）能够替换程序（program）中父类对象（object of base/parent class）出现的任何地方，并且保证原来程序的逻辑行为（behavior）不变及正确性不被破坏。


```java
public class A {
    public void fun(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
}

public class B extends A{
    @Override
    public void fun(int a,int b){
        System.out.println(a+"-"+b+"="+(a-b));
    }
}

public class C{
    public static calculate(A a){
        //业务逻辑
    }
}

public class demo {
    public static void main(String[] args){
        System.out.println("父类的运行结果");
        A a=new A();
        a.fun(1,2);
        System.out.println("子类替代父类后的运行结果");
        A b=new B();
        b.fun(1,2);
        C.calculate(a);
    }
}

```

4.接口隔离原则

定义：一个类对另一个类的依赖应该建立在最小的接口上（The dependency of one class to another one should depend on the smallest possible interface）

5.依赖倒置原则
依赖倒置原则的英文名是Dependence Inversion Principle，缩写为DIP。它的含义是程序要依赖于抽象接口，不要依赖于具体实现。 面向接口而非实现。

 *******

### 单例模式

一个类只允许创建一个对象（或者实例），那这个类就是一个单例类，这种设计模式就叫作单例设计模式，简称单例模式。

单例模式的使用场景：
1. 系统只需要一个实例对象，如系统要求提供一个唯一的序列号生成器，或者需要考虑资源消耗太大而只允许创建一个对象。
2. 客户调用类的单个实例只允许使用一个公共访问点，除了该公共访问点，不能通过其他途径访问该实例。
3. 在一个系统中要求一个类只有一个实例时才应当使用单例模式。反过来，如果一个类可以有几个实例共存，就需要对单例模式进行改进

饿汉&懒汉

例子：创建一个全局唯一的id生成器
```java
public class IdGenerator {
  private AtomicLong id = new AtomicLong(0);
  private static final IdGenerator instance = new IdGenerator();
  private IdGenerator() {}
  public static IdGenerator getInstance() {
    return instance;
  }
  public long getId() { 
    return id.incrementAndGet();
  }
}
```

```java
public class IdGenerator { 
  private AtomicLong id = new AtomicLong(0);
  private static IdGenerator instance;
  private IdGenerator() {}
  public static synchronized IdGenerator getInstance() {
    if (instance == null) {
      instance = new IdGenerator();
    }
    return instance;
  }
  public long getId() { 
    return id.incrementAndGet();
  }
}
```

#### 工厂模式
工厂模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。

##### 简单工厂
简单工厂模式(Simple Factory Pattern)：专门定义一个类（工厂类）来负责创建其他类的实例。可以根据创建方法的参数来返回不同类的实例，被创建的实例通常都具有共同的父类。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82.png)

优点：
1. 工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责，很方便的创建出相应的产品。工厂和产品的职责区分明确。
2. 客户端无需知道所创建具体产品的类名，只需知道参数即可。
也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。

缺点：
1. 简单工厂模式的工厂类单一，负责所有产品的创建，职责过重，一旦异常，整个系统将受影响。且工厂类代码会非常臃肿，违背高聚合原则。
2. 使用简单工厂模式会增加系统中类的个数（引入新的工厂类），增加系统的复杂度和理解难度
3. 系统扩展困难，一旦增加新产品不得不修改工厂逻辑，在产品类型较多时，可能造成逻辑过于复杂
4. 简单工厂模式使用了 static 工厂方法，造成工厂角色无法形成基于继承的等级结构。

##### 工厂方法
工厂方法模式(Factory Method Pattern)又称为工厂模式，工厂父类负责定义创建产品对象的公共接口，而工厂子类则负责生成具体的产品对象，即通过不同的工厂子类来创建不同的产品对象。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95.png)

优点：
1. 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程。
2. 灵活性增强，对于新产品的创建，只需多写一个相应的工厂类。
典型的解耦框架。高层模块只需要知道产品的抽象类，无须关心其他实现类，满足依赖倒置原则和里氏替换原则。

缺点：
1. 类的个数容易过多，增加复杂度
2. 增加了系统的抽象性和理解难度
3. 抽象产品只能生产一种产品，此弊端可使用抽象工厂模式解决。

##### 抽象工厂
抽象工厂模式(Abstract Factory Pattern)：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们具体的类。
优点：
1. 可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理。
2. 当需要产品族时，抽象工厂可以保证客户端始终只使用同一个产品的产品组。
3. 抽象工厂增强了程序的可扩展性，当增加一个新的产品族时，不需要修改原代码，满足开闭原则。

缺点：
1. 当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。增加了系统的抽象性和理解难度。


例子：创建一个能解析不同配置文件的工具类
常规做法
```java

public class RuleConfigSource {
  public RuleConfig load(String ruleConfigFilePath) {
    String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
    IRuleConfigParser parser = null;
    if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
      parser = new JsonRuleConfigParser();
    } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
      parser = new XmlRuleConfigParser();
    } else {
      throw new InvalidRuleConfigException(
             "Rule config file format is not supported: " + ruleConfigFilePath);
    }

    String configText = "";
    //从ruleConfigFilePath文件中读取配置文本到configText中
    RuleConfig ruleConfig = parser.parse(configText);
    return ruleConfig;
  }

  private String getFileExtension(String filePath) {
    //...解析文件名获取扩展名，比如rule.json，返回json
    return "json";
  }
}
```


#### 建造者模式
主要作用于构造方法参数过多、需要对构造参数进行多重校验(类的属性之间有一定的约束关系)的情况、希望创建不可变对象
建造者模式是用来创建一种类型的复杂对象，通过设置不同的可选参数，“定制化”地创建不同的对象.
例子：创建一个连接池对象

该模式的主要优点如下：
1. 封装性好，构建和表示分离。
2. 扩展性好，各个具体的建造者相互独立，有利于系统的解耦。
3. 客户端不必知道产品内部组成的细节，建造者可以对创建过程逐步细化，而不对其它模块产生任何影响，便于控制细节风险。

其缺点如下：
1. 如果产品的内部变化复杂，如果产品内部发生变化，则建造者也要同步修改，后期维护成本较大。

#### 原型模式
如果对象的创建成本比较大，而同一个类的不同对象之间差别不大（大部分字段都相同），在这种情况下，我们可以利用对已有对象（原型）进行复制（或者叫拷贝）的方式，来创建新对象，以达到节省创建时间的目的。这种基于原型来创建对象的方式就叫作原型设计模式，简称原型模式。

例子：创建一个搜索词缓存，必要时进行刷新拿到最新搜索次数 数据

原型模式的优点：
1. Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
2. 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。

原型模式的缺点：
1. 需要为每一个类都配置一个 clone 方法
2. clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
3. 当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。

#### 代理模式

代理模式的定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E4%BB%A3%E7%90%86%E6%A8%A1%E5%BC%8F.png)

代理模式的主要优点有：
1. 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
2. 代理对象可以扩展目标对象的功能；
3. 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度，增加了程序的可扩展性

其主要缺点是：
1. 代理模式会造成系统设计中类的数量增加
2. 在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；
3. 增加了系统的复杂度；


#### 桥接模式
桥接（Bridge）模式的定义如下：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E6%A1%A5%E6%8E%A5%E6%A8%A1%E5%BC%8F.png)

桥接（Bridge）模式的优点是：
1. 抽象与实现分离，扩展能力强
2. 符合开闭原则
3. 其实现细节对客户透明

缺点是：由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，能正确地识别出系统中两个独立变化的维度，这增加了系统的理解与设计难度。
#### 适配器模式
适配器模式（Adapter）的定义如下：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F.png)

该模式的主要优点如下。
1. 客户端通过适配器可以透明地调用目标接口。
2. 复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
3. 将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。
4. 符合开闭原则。

其缺点是：
1. 适配器编写过程需要结合业务场景全面考虑，可能会增加系统的复杂性。
2. 增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。


#### 装饰模式
装饰（Decorator）模式的定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E8%A3%85%E9%A5%B0%E5%99%A8%E6%A8%A1%E5%BC%8F.png)

装饰（Decorator）模式的主要优点有：
装饰器是继承的有力补充，比继承灵活，在不改变原有对象的情况下，动态的给一个对象扩展功能，即插即用
通过使用不用装饰类及这些装饰类的排列组合，可以实现不同效果
装饰器模式完全遵守开闭原则

其主要缺点是：装饰模式会增加许多子类，过度使用会增加程序得复杂性。

装饰模式和代理模式行为很相似，都是通过对构造函数传入目标对象来解决问题的，但是他们的解决问题不一样

#### 门面模式

门面（Facade）模式又叫作外观模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E9%97%A8%E9%9D%A2%E6%A8%A1%E5%BC%8F%20(1).png)

优点
1. 降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
2. 对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。

门面（Facade）模式的主要缺点如下。
1. 增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。



#### 组合模式

组合（Composite）模式的定义：有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性。

![avatar](https://github.com/wangchaofan2018/Design-Patterns/blob/master/image/%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F.png)

组合模式的主要优点有：
1. 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
2. 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；

其主要缺点是：
1. 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
2. 不容易限制容器中的构件；
3. 不容易用继承的方法来增加构件的新功能；

#### 享元模式
享元（Flyweight）模式的定义：运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。

享元模式的主要优点是：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。

其主要缺点是：
1. 为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
2. 读取享元模式的外部状态会使得运行时间稍微变长。

```

Integer i1 = 56;
Integer i2 = 56;
Integer i3 = 129;
Integer i4 = 129;
System.out.println(i1 == i2);
System.out.println(i3 == i4);
```