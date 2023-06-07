package com.wang.p4_prototype.design;

import lombok.Data;

@Data
public class AnswerQuestion {

  private String name;
  private String key;

  public AnswerQuestion() {}

  public AnswerQuestion(String name, String key) {
    this.name = name;
    this.key = key;
  }
}
