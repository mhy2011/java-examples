package com.mhy.jvm.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出示例
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author mahaiyuan
 * @ClassName: HeapOOM
 * @date 2018-03-08 下午8:13
 */
public class HeapOOM {
  public static void main(String[] args) {
    List<OOMObject> list = new ArrayList<>();
    while (true) {
      list.add(new OOMObject());
    }
  }

  static class OOMObject {

  }
}
