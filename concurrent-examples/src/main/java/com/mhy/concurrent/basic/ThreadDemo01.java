package com.mhy.concurrent.basic;

/**
 * 第一个线程示例
 * @author mahaiyuan
 * @ClassName: ThreadDemo01
 * @date 2018-02-26 下午8:48
 */
public class ThreadDemo01 {
  public static void main(String[] args) {
    System.out.println("1. start");
    new Thread() {
      @Override
      public void run() {
        System.out.println("新线程输出......");
      }
    }.start();  //启动新线程
    System.out.println("2. start");
  }
}
