package com.wang.p17_memento.pattern;
/**
 * @Author:wsz
 * @Date: 2023/6/13 22:40
 * @Description:配置文件   记录器  管理员
 * @Version: 1.0
 * @Since: 1.0
 */
public class ConfigOriginator {
  private ConfigFile configFile;

  public ConfigFile getConfigFile() {
    return configFile;
  }

  public void setConfigFile(ConfigFile configFile) {
    this.configFile = configFile;
  }

  public ConfigMemento saveMemento() {
    return new ConfigMemento(configFile);
  }

  public void getMemento(ConfigMemento memento) {
    this.configFile = memento.getConfigFile();
  }
}
