package java12;

class MyGenericStack<T> {
    private int index;
    private int size;
    private Object[] data;

    public MyGenericStack(int size) {
        this.index = 0;
        this.size = size;
        this.data = new Object[size];
    }

    public void push(T item) {
        if (index == size)
            return;
        data[index] = item;
        index++;
    }

    public T pop() {
        if (index == 0)
            return null;
        index--;
        return (T) data[index];
    }

    public boolean isEmpty() {
        if (index == 0)
            return true;
        else
            return false;
    }
}

public class GenericStackTest {
    public static void main(String[] args) {
        MyGenericStack<String> sStack = new MyGenericStack<String>(5);
        sStack.push("milk");
        sStack.push("cheese");
        sStack.push("ham");
        while (!sStack.isEmpty())
            System.out.println(sStack.pop());

        MyGenericStack<Integer> nStack = new MyGenericStack<Integer>(7);
        nStack.push(7);
        nStack.push(3);
        nStack.push(9);
        nStack.push(2);
        while (!nStack.isEmpty())
            System.out.println(nStack.pop());
    }
}
