
class plate {
    protected int length, width;

    public plate(int length, int width) {
        System.out.println("Plate class constr");
        this.length = length;
        this.width = width;
    }
}

class box extends plate{
    protected int height;

    public box(int l, int b, int height) {
        super(l,b);
        System.out.println("Box class constr");
        this.height = height;
    }
}

class woodBox extends box {
    protected int thickness;

    public woodBox(int l, int b, int height, int thickness) {
        super(l, b, height);
        System.out.println("WoodBox class constr");
        this.thickness = thickness;
    }
    public void data() {
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("height: " + height);
        System.out.println("thickness: " + thickness);
    }
}

public class Q2 {
    public static void main(String[] args) {
        woodBox obj = new woodBox(20, 30, 1, 5);
        obj.data();
    }
}
