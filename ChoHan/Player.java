package ChoHan;

import java.util.Random;

public class Player
{
    private String name;
    private String guess;
    private int points;

    public Player(String playerName)
    {
        name = playerName;
        guess = "";
        points = 0;

    }

    public void makeGuess()
    {
        Random rand = new Random();
        int guessNumber = rand.nextInt(2);

        if (guessNumber == 0)
            guess = "Cho (even)";
        else
            guess = "Han (odd)";

    }

    public void addPoints(int newPoints)
    {
        points += newPoints;
    }

    public String getName()
    {
        return name;
    }

    public String getGuess()
    {
        return guess;
    }

    public int getPoints ()
    {
        return points;
    }


}

/*
public class Player {
    private String name;
    private String guess;
    private int points;

    public Player(String playerName)
    {
        name = playerName;
        guess = "";
        points = 0;
    }

    public void makeGuess()
    {
        Random rand = new Random();

        int guessNumber = rand.nextInt(2);

        if (guessNumber == 0)
            guess = "Cho (even)";
        else
            guess = "Han (odd)";
    }

    public void addPoints(int newPoints)
    {
        points += newPoints;
    }

    public String getGuess()
    {
        return guess;
    }

    public String getName(){
        return name;
    }

    public int getPoints()
    {
        return points;
    }

}

*/
/*
构造器的参数通常只包含那些**“对象诞生时必须具备的、不可改变的身份信息”**。而其他随着时间推移、动作发生而改变的字段，则在内部初始化为“零”或“空”。

我们可以把这三个字段分成两类来看：

1. 必需的“身份信息” (Identity) -> 需要 Parameter
name:

这是一个人的身份。当你在现实中让一个玩家加入游戏时，你必须知道他是谁（"Mike" 还是 "Sarah"）。

如果没有名字，这个 Player 对象就没有意义，无法区分。

所以，它必须通过构造器的参数 String playerName 传入，由外部指定。

2. 待发展的“过程状态” (State) -> 不需要 Parameter
这两个字段代表了游戏过程中的数据，对象刚创建时（刚坐到赌桌旁），这些事情还没发生：

points (分数):

逻辑： 刚来的玩家，没赢过也没输过，分数理应是 0。

反例： 如果构造器允许传参 new Player("Mike", 100)，那就意味着 Mike 一坐下来就自带 100 分，这在公平的游戏中是不合理的（除非是存档读取）。

所以，它被硬编码初始化为 0。

guess (猜测):

逻辑： 猜测是每一轮（Round）才会发生的动作。

当 new Player(...) 执行时，游戏甚至还没开始掷骰子，玩家不可能已经做出了猜测。

所以，它被初始化为 "" (空字符串)，代表“尚未猜测”。只有当稍后调用 makeGuess() 方法时，这个状态才会被填入 "Cho" 或 "Han"。

总结：构造器的“黄金法则”
在设计构造器时，你可以问自己这个问题：

“为了让这个对象在世界上存在，最少需要知道哪些信息？”

必须知道的（如名字、骰子的面数） -> 放进参数 (Parameter)。

后天获得的（如分数、当前的猜测、当前的骰子点数） -> 在内部初始化为 0 或 null。
*/