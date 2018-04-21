import java.util.Arrays;

public class BlackList {
    private Class<?>[] blArr = new Class<?>[0];

    public BlackList() {
    }

    public BlackList(Class[] blArr) {
        this.blArr = blArr;
    }

    public void addElement(Class cl) {
        blArr = Arrays.copyOf(blArr, blArr.length + 1);
        blArr[blArr.length - 1] = cl;
    }

    public boolean isElementInBl(Object object) {
        for (Class cl : blArr) {
            if (cl.equals(object.getClass())) {
                return true;
            }
        }
        return false;
    }

    public Object[] getBlArr() {
        return blArr;
    }

    public void setBlArr(Class[] blArr) {
        this.blArr = blArr;
    }
}