package com.StackQueue;

public class DynamicCircularQueue extends  CustomCircularQueue{
    public DynamicCircularQueue() {
        super();
    }

    public DynamicCircularQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            // create an new stack of double size
            int[] temp = new int[data.length * 2];

            // copy all the elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i + front) % data.length];
            }
            front=0;
            end= data.length;
            data = temp;
        }

            return super.insert(item);

    }
}
