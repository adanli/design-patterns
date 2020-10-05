# 设计模式
- 提供几种设计模式的代码示例和部分的UML图，有些内容过于简答的就不提供了，感兴趣的同学可以联系<u>adanli@126.com</u>交流探讨  
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