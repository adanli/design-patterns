# 设计模式
- 提供几种设计模式的代码示例和部分的UML图，有些内容过于简答的就不提供了，感兴趣的同学可以联系<u>adanli@126.com</u>交流探讨  

## 设计模式不管怎么演变，目的是为了遵循面向对象的三大特性和六大原则
### 三大特性
- 封装
- 继承
- 多态
### 六大原则
- 职责单一原则
- 开放封闭原则
- 依赖倒转原则
- 里氏代换原则
- 迪米特原则
- 合成/聚合复用原则

## 简单工厂模式(<i>Factory</i>)
### 能力
- 提供不同的实例对象，这些实例对象具有相同的特征
### 使用场景
- 根据不同的条件, 获得相对应的实例对象
- 由客户端决定需要的实例对象的类型，由工厂端进行判断并返回
- 适合类型(子类)固定的场景  

## 策略模式(<i>Strategy</i>)
### 能力
- 提供一个Context，封装算法的具体实现，不会影响到客户端的使用
### 使用场景
- 提供算法能力，封装实际的算法实现
- 由客户端根据需求决定需要使用哪个子类
- 如果新增新的算法，只需要实现`IStrategy`，再在客户端完成调用即可，不需要改动`Context`和原有的功能代码
### 结合工厂模式
#### 优势
- 客户端只需要认识一个`WithFactoryContext`类即可，不需要像之前那样既要认识`Context`又要认识具体的`Strategy`实现类
#### 劣势
- 一旦涉及到算法实现的变动，需要在添加实现类的同时，修改`WithFactoryContext`，适合算法实现变动不多的情况，但是如果算法实现变动不多，又不符合策略模式的设计初衷，因此，不建议使用策略模式 + 简单工厂模式的方式

## 装饰模式(<i>Decorator</i>)
### 能力
- 动态地给一个对象增加一些额外的职责
- 把类的核心职责和装饰功能区分开
### 注意点
- 客户端在decorator的过程中，需要注意调用的顺序和关系，因为不同的`decorator(Object o)`对象会造成装饰的顺序不一致  

## 代理模式(<i>Proxy</i>)
### 能力
#### 能够通过第三方的对象，来间接访问目标对象，降低代码的耦合度
### 使用场景
- 当两个对象在业务上没有直接的相关性时，可以设置一个第三方的对象，来控制对目标对象的访问，以减少代码的耦合度
- 代理对象会去实现和继承所有真实对象实现和继承过的类和接口

## 工厂方法模式(<i>Factory Method</i>)
### 能力
- 根据条件提供实例对象
- 能够在频繁增加新对象的情况下减少对于`Factory`类的修改
### 使用场景
- 当需要提供实例对象，但是实例对象会被频繁的修改增加的时候，可以使用工厂方法模式，避免对工厂进行频繁的修改

## 原型模式(<i>Prototype</i>)
### 能力
- 提供克隆指定对象的能力，隐藏了对象创建的细节，提升了性能
### 使用场景
- 在初始化信息不发生变化的情况下创建一个新的对象实例
- 约定俗成：浅克隆`clone()`，深克隆`copy()`
### 注意点
- 如果对象中存在大量引用对象，且引用对象会频繁修改的话，不适合用原型模式

## 模版方法模式(<i>Template Method</i>)
### 能力
- 当算法中某一小部分需要修改的时候，不需要修改原有代码，只新增一个算法类完成核心算法的实现即可
### 使用场景
- 算法的整体骨架保持不变，只修改其中部分内容的实现

## 外观模式=门面模式(<i>Facade</i>)
### 使用场景
- 如果某个功能的实现包含了多个原子级的接口，但是这些接口又不需要对客户端暴露的时候，可以使用外观模式对这些原子接口进行一次封装

## 建造者模式(<i>Builder</i>)
## 能力
- 将对象的创建和具体的表现分离，一旦表现的实现发生改变的时候，能够不影响现有的代码
## 使用场景
- 用于创建一个对象本身，对象涉及到的属性等可以延迟被创建
- 如果涉及到对象属性的修改，可以扩展一个实现类，不用修改原来的代码

## 观察者模式(<i>Observer</i>)
## 使用场景
- 让某个对象关注到某个主题(topic)，一旦发生变化，主题会通知所有的观察者作出相应的变更

## 抽象工厂原则(<i>Abstract Factory</i>)
### 使用场景
- 作用: 提供一个对象
- 在运行时由客户端创建具体的工厂，再由该工厂根据实际情况提供对应的实例对象
- 在具体的工厂中可以对需要创建的产品定制化

## 状态模式(<i>State</i>)
### 使用场景
- 当程序中存在大量的if逻辑判断时，通过状态模式来降低大量if或者switch的逻辑判断
- 当一个对象的行为取决于它的状态的时候
- 这样一来，当条件修改的时候，只需要新增一个`State`的实现类，并修改相关的实现类条件即可
### 注意点
- 对客户端只暴露一个`Context`上下文，剩下的条件和状态都在`Context`内聚

## 适配器模式(<i>Adaptor</i>)
### 使用场景
- 系统的数据和行为都一致，但是接口不符合，需要做一定的适配
- 当需要对现有的复杂系统进行改造的时候，可以考虑使用适配器模式，对现有的接口进行一定程序的适配
### 疑问
- 适配器模式和代理模式的区别是什么
- 解答
    - 适配器模式用于新旧两个接口不一致的情况，但是客户端还是会和实际的类打交道(`TargetService target = new Adaptor()`)
    - 代理模式用于两个接口一致，但是不把真实接口的实现直接暴露给调用方,同时在代理层可以做一些其他的处理,客户端不会直接跟实际的类打交道
    
## 备忘录模式(<i>Memento</i>)
### 角色
#### Originator
- 创建一个备忘录Memento
- 记录Memento当前的内部状态
- 能够还原Memento到过去的某个状态  
#### Memento
- 存储Originator对象的内部状态
- 防止除了Originator以外的对象访问和修改
#### Caretaker
- 保存备忘录Memento  
### 使用场景
- 需要记录历史变化的时候
- Memento中记录状态，Originator中保存需要被记录和回滚的属性

## 组合模式(<i>Composite</i>)
### 使用场景
- 用户对单个对象和组合对象的使用具有一致性

## 迭代器模式(<i>Iterator</i>)
### 使用场景
- 需要访问一个集合对象，且该集合中的每个对象都需要被访问的时候

## 单例模式(<i>Singleton</i>)
### 使用场景
- 保证一个类仅有一个实例对象

## 桥接模式(<i>Bridge</i>)
### 使用场景
- 将抽象部分和实现部分分离，让它们可以独立的变化
- 依据合成/聚合原则，如果两个对象之间不是明显的is-a关系，尽量使用合成/聚合(引用)而不是继承的关系

## 命令模式(<i>Command</i>)
### 使用场景
- 需要构建一个命令队列的时候
- 允许接收请求的一方决定是否要否决请求，能够很容易地实现对请求的撤销和重做
- 区分开一个执行操作的对象(Command)和怎么执行这个操作的对象(Invoke)
- 一般情况下能够不使用命令模式，尽量不使用

## 职责链模式(<i>Claim Of Responsibility</i>)
### 使用场景
- 流程能够传成一条链条，且多个对象都有机会去处理请求