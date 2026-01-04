package ChoHan;//package ChoHan;
import java.util.Random;

public class Die
{
    private int sides;
    private int value;

    public Die(int numSides)
    {
     sides = numSides;
     roll();
    }

    public void roll()
    {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    public int getSides() {
        return sides;
    }

    public int getValue() {
        return value;
    }
}



  /*
public class Die {
    private int sides;
    private int value;



    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }

    public void roll()
    {
        Random rand = new Random();

        value = rand.nextInt(sides) + 1;
    }

    public int getSides()
    {
        return sides;
    }

    public int getValue(){
        return value;
    }
}
/*

/*
1. 属性性质的不同：结构 vs. 状态
sides (面数) 是“结构属性”：

当你制造一个骰子时，你必须决定它是一个立方体（6面）还是一个二十面体（20面）。这个属性一旦确定，通常不会改变。

因为程序不知道你要造什么样的骰子，所以它必须要求你通过参数告诉它：int numSides。

value (点数) 是“临时状态”：

点数不是骰子的结构，而是它当前呈现的状态。

点数是由随机概率决定的，不应该由外部的人在制造骰子时人为指定。

2. 防止“作弊” (Encapsulation Logic)
如果构造器允许传入 value，代码可能会写成这样（这是不好的设计）：

Java

// ❌ 错误的设计示范
public Die(int numSides, int startingValue) {
    sides = numSides;
    value = startingValue; // 允许用户指定初始点数
}
如果是这样，在 DiceDemo.java 或其他程序中，用户就可以这样写： Die myDie = new Die(6, 6); // "我要造一个6面骰子，并且让它初始就是6点！"

这显然不符合现实逻辑。为了保证公平，我们不让用户传入 value 参数，而是通过在构造器内部调用 roll()，强制让骰子自己生成一个随机的初始值。

3. 代码执行的依赖关系
让我们看一眼构造器的内部执行顺序：

Java

public Die(int numSides)
{
    sides = numSides;  // 第一步：先确立有多少个面
    roll();            // 第二步：根据面数，计算出一个随机值
}
为什么要在这里调用 roll()？

如果不调用 roll()，value 作为 int 类型的成员变量，默认值会是 0。

现实中没有“0点”的骰子（通常是1-6）。

所以，构造器通过调用 roll() 作为一个初始化步骤，确保当 Die 对象诞生的一瞬间，它就拥有了一个合法的、随机的非零点数（例如 3 或 5）。

总结
之所以参数里只有 numSides：

用户必须提供：面数（因为程序猜不到你想造几面的骰子）。

用户不能提供：点数（因为这应该是随机生成的，不能由人指定）。

这就是面向对象编程中**“高内聚”**的一个体现：对象应该自己管理自己的内部状态（点数），只向外界索要必要的信息（面数）
   */