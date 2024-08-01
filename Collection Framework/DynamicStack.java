package com.StackQueue;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int num) throws StackException {
        if (this.isFull()) {
            // create an new stack of double size
            int[] temp = new int[data.length * 2];

            // copy all the elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        ptr++;
        data[ptr] = num;
    }
}
