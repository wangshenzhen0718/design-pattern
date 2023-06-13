package com.wang.p17_memento.pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigFile {

  private String versionNo; // 版本号
  private String content; // 内容
  private Date dateTime; // 时间
  private String operator; // 操作人

}
