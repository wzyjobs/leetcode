package com.ericgarvin.leetcode.easy.stack;

import java.util.Stack;

/**
 * 155. 最小栈
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 * <p>
 * MinStack_155 minStack = new MinStack_155();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 */
public class MinStack_155 {
    private Stack<Integer> stack;
    private Stack<Integer> preMinNumStack;

    public MinStack_155() {
        this.stack = new Stack<>();
        this.preMinNumStack = new Stack<>();
    }

    public void push(int x) {
        this.stack.push(x);
        this.preMinNumStack.push(this.preMinNumStack.isEmpty() ? x : Math.min(this.preMinNumStack.lastElement(), x));
    }

    public void pop() {
        this.stack.pop();
        this.preMinNumStack.pop();
    }

    public int top() {
        return this.stack.lastElement();
    }

    public int getMin() {
        return this.preMinNumStack.lastElement();
    }

    public static void main(String[] args) {
        MinStack_155 obj = new MinStack_155();
        obj.push(1);
        obj.push(-1);
        obj.push(-3);
        obj.pop();
        obj.pop();
        System.out.println("obj.top() = " + obj.top());
        System.out.println("obj.getMin() = " + obj.getMin());
    }
}
