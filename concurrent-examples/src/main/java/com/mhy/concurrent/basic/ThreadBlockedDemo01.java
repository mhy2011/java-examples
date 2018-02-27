package com.mhy.concurrent.basic;

/**
 * @author mahaiyuan
 * @ClassName: ThreadBlockedDemo01
 * @date 2018-02-27 下午10:29
 */
public class ThreadBlockedDemo01 {
  public static void main(String[] args) throws Exception {
    Thread thread = new BlockThread();
    Thread thread2 = new BlockThread();
    thread.start();
    Thread.sleep(100);
    thread2.start();
    System.out.println("1. " + thread.getName() + " state:" + thread.getState());
    System.out.println("2. " + thread2.getName() + " state:" + thread2.getState());  //BLOCKED
    Thread.sleep(5000);
    System.out.println("3. 主线程休眠5S.......");
    System.out.println("4. " + thread.getName() + " state:" + thread.getState());  //RUNNABLE
    System.out.println("5. " + thread2.getName() + " state:" + thread2.getState());  //RUNNABLE

  }



  public static synchronized void fun() {
    System.out.println(Thread.currentThread().getName() + " 执行fun方法开始......");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName() + " 执行fun方法结束......");
  }
}

class BlockThread extends Thread {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " 开始执行......");
    ThreadBlockedDemo01.fun();
    System.out.println(Thread.currentThread().getName() + " 执行结束......");
  }
}
