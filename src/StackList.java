import java.util.Arrays;

public class StackList {
    private int index = -1;
    private Object[] arr;
    private BlackList blackList;
    public StackList() {
        arr = new Object[0];
    }

    public StackList(int size, BlackList blackList) {
        arr = new Object[size];
        this.blackList = blackList;
    }

    public void push(Object object) {
        if (object == null) {
            throw new IllegalArgumentException();
        }
        if (!blackList.isElementInBl(object)) {
            try {
                if (index + 1 == arr.length) {
                    throw new StackOverflowException();
                }
            } catch (StackOverflowException e) {
                e.printStackTrace();
            }

            index++;
            try {
                arr[index] = object;
            } catch (IndexOutOfBoundsException e) {

            }
        } else {
            try {
                throw new BlackListException();
            } catch (BlackListException e) {
                e.printStackTrace();
            }
        }

    }

    public Object pop() {
        try {
            if (index == -1) {
                throw new StackUnderflowException();
            }
        } catch (StackUnderflowException e) {
            e.printStackTrace();
        }
        index--;
        try {
            return arr[index + 1];
        } catch (IndexOutOfBoundsException e) {

        }
        return null;
    }

    public boolean isEmpty() {
        return index == -1 ? true : false;
    }

    public boolean isFull() {
        return index == arr.length - 1 ? true : false;
    }

    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
    }

    public Object top() {
        try {
            return arr[index];
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public int size() {
        int count = 0;
        for (Object obj : arr) {
            if (obj != null) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public BlackList getBlackList() {
        return blackList;
    }

    public void setBlackList(BlackList blackList) {
        this.blackList = blackList;
    }

    @Override
    public String toString() {
        return "StackList" + Arrays.toString(arr);
    }
}
