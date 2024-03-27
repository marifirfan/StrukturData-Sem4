package stack;

public class MyDamnStack {

    private int Size;
    private int top;

    String[] MyURL;

    public MyDamnStack(int AddSize) {
        this.Size = AddSize;
        MyURL = new String[Size];
        top = -1;
    }

    public void visitURL(String URL) {
        // if (top < Size-1 && top != Size-1) {
        // MyURL[++top] = URL;
        // }

        if (top == Size - 1) {

            String newArr[] = new String[2 * Size];

            for (int i = 0; i < top + 1; i++) {
                newArr[i] = MyURL[i];
            }
            MyURL = newArr;
            Size *= 2;
        }

        MyURL[++top] = URL;
    }

    public void back() {
        if (top > 0) {
            --top;
        }
    }

    public void forward() {
        if (top < Size - 1 && MyURL[top + 1] != null) {
            ++top;
        }
    }

    public void getCurrentURL() {
        if (top != -1) {
            System.out.println("Current URL : " + MyURL[top]);
        }
    }

    public int getSize() {
        return Size;
    }

    public int getTop() {
        return top;
    }

    public int MyURL() {
        return MyURL.length;
    }
}