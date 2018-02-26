package com.mhy.concurrent.basic;

/**
 * 第一个线程示例
 * @author mahaiyuan
 * @ClassName: ThreadDemo01
 * @date 2018-02-26 下午8:48
 */
public class ThreadStateDemo01 {
  public static void main(String[] args) throws Exception {
    Thread thread = new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 3; i++) {
          System.out.println("新线程输出......" + i + "," + this.getState());
        }
      }
    };
    System.out.println("1.线程当前状态:" + thread.getState());
    thread.start(); //启动新线程
    System.out.println("2.线程当前状态:" + thread.getState());
    Thread.sleep(1000); //主线程休眠1S
    System.out.println("3.线程当前状态:" + thread.getState());
  }
}
