package com.wang.p4_prototype.pattern;

import java.util.*;

public class TopicRandomUtil {
  // 一直非实例化对象不稳定性
  private TopicRandomUtil() {}

  public static Topic random(Map<String, String> option, String key) {
    Set<String> keySet = option.keySet();
    ArrayList<String> keyList = new ArrayList<>(keySet);
    Collections.shuffle(keyList);
    HashMap<String, String> optionNew = new HashMap<>();
    int i = 0;
    String keyNew = "";
    for (String next : keySet) {
      String randomkey = keyList.get(i++);
      if (next.equals(key)) {
        keyNew = randomkey;
      }
      optionNew.put(randomkey, option.get(next));
    }

    return new Topic(optionNew, keyNew);
  }
}
