package com.wang.p4_prototype.design;

import lombok.Data;

import java.util.Map;

@Data
public class ChoiceQuestion {
  private String name;
  private Map<String, String> option;
  private String key;

  public ChoiceQuestion() {}

  public ChoiceQuestion(String name, Map<String, String> option, String key) {
    this.name = name;
    this.option = option;
    this.key = key;
  }
}
