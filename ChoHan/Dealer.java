package ChoHan;//package ChoHan;

public class Dealer
{
    private int die1Value;
    private int die2Value;

    public Dealer()
    {
        die1Value = 0;
        die2Value = 0;
    }

    public void rollDice()
    {
        final int SIDES = 6; // 常量 (Constants)
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        die1Value = die1.getValue();
        die2Value = die2.getValue();
    }

    public String getChoOrHan()
    {
        String result;
        int sum = die1Value + die2Value;

        if ( sum % 2 == 0)
        {
            result = "Cho (even)";
        }

        else
        {
            result = "Han (odd)";
        }
         return result;
    }

    public int getDie1Value()
    {
        return die1Value;
    }

    public int getDie2Value()
    {
        return die2Value;
    }
}

/*
public class Dealer {
    private int die1Value;
    private int die2Value;


    public Dealer()
    {
        die1Value = 0;
        die2Value = 0;
    }

    public void rollDice()
    {   final int SIDES = 6;
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        die1Value = die1.getValue();
        die2Value = die2.getValue();
    }

    public String getChoOrHan() {
        String result;

        int sum = die1Value + die2Value;

        if (sum % 2 == 0)
            result = "Cho (even)";
        else
            result = "Han (odd)";

        return result;
    }

    public int getDie1Value()
        {
            return die1Value;
        }

    public int getDie2Value()
        {
            return die2Value;
        }

    }
*/

/*
Dealer 的构造器设计成无参数且初始化为 0，主要基于以下三个原因：业务逻辑的“空闲状态”、规则的封装，以及明确性。
1. 逻辑状态：代表“游戏尚未开始”在 Die.java 中，我们认为一个骰子只要被制造出来（实例化），它在物理上就必须有一个朝上的面，
所以它立即就有了一个 1-6 的值。但在 Dealer（庄家）的逻辑中，情况不同：Dealer
 被创建 = 庄家走进房间，坐到了赌桌旁。Dealer.rollDice() = 庄家拿起骰子盅摇动。
当 Dealer 对象刚刚被 new 出来时 (public Dealer())，游戏还没开始，
他手里还没有摇骰子。此时如果 die1Value 有值（比如随机的 3），那是不符合逻辑的。
设定为 0 代表一种 “空闲” (Idle) 或 “未初始化” 的状态。
这也防止了在调用 rollDice() 之前，程序错误地读取了上一次残留的数据或随机数据。

2. 规则的封装 (为什么没有 Parameter)你可能会问：“为什么不把骰子的面数（6面）
作为参数传给 Dealer 呢？”在 Dealer.java 的 rollDice 方法中，我们看到：
Java public void rollDice()
{   final int SIDES = 6; // 规则被硬编码在庄家内部
    Die die1 = new Die(SIDES);
    // ...
}
封装原则： 庄家控制着游戏规则。在这个具体的 Cho-Han 游戏中，规则固定是用两个
6 面骰子。外部调用者（ChoHan.java 中的 main）不需要告诉庄家“请用 6 面骰子”，
庄家自己知道规则。因此，构造器不需要任何参数 (parameter)，
因为庄家不需要外部告诉他怎么做，他只需要被“叫过来”（实例化）即可。

3. 显式初始化的编程习惯从 Java 语言的技术角度来说，类的成员变量（Field）
如果是 int 类型，默认值本身就是 0。这意味着，即使你把构造器写成空的：
Javapublic Dealer() {
    // 即使这里什么都不写，die1Value 也是 0
}
程序运行结果是一模一样的。但是，写出 die1Value = 0;
是一种良好的编程习惯（Good Practice）：可读性 (Readability)：
 它明确告诉阅读代码的人：“我有意让这两个变量从 0 开始”。

 安全性： 如果未来有人把代码移植到其他默认值不是 0 的语言（如 C++ 的某些情况），
 显式赋值能保证程序的正确性。



 总结对比

 特性        Die (骰子)                     Dealer (庄家)
 构造器参数  需要(numSides)。因为物理上骰子必须有面数才能存在。
           不需要。因为庄家的规则（用6面骰）是内部固定的，不需要外部指定。
 初始值     随机值 (1-6)。物理骰子总有一面朝上。
           0。代表“还没开始摇”，庄家处于等待状态。

 设计意图   模拟物体 (Object/Structure)。
           模拟角色/控制器 (Actor/Controller)。
 */