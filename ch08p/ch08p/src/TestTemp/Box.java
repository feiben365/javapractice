package TestTemp;

public class Box {
    private int value;
    public Box(int value) {
        this.value = value;
    }
    public void modify(Box b) {
        b.value = 100;
    }
}

// In main:
Box box1 = new Box(50);
Box box2 = box1;
box2.modify(box1);
System.out.println(box1.value);