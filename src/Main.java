import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BlackList blackList = new BlackList();
        StackList stl = new StackList(3, blackList);
        blackList.addElement(Integer.class);
        stl.setBlackList(blackList);
        System.out.println(stl);

        stl.push(new Date());
        stl.push("asdas");
        stl.push(123);
        System.out.println();
        System.out.println(stl);

        System.out.println(stl.pop());
        System.out.println(stl);
        System.out.println();

        stl.clear();
        System.out.println(stl);

    }
}
