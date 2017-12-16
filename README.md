# XDisconfClient

基于 disconf 2.6.36 项目延伸，支持不同的环境下， 配置文件的拉取
目的： 希望拉取多环境的配置文件

## 使用方式：
disconf.properties 配置项：

```
disconf.env=rd,coimmon,etc
```
配置环境中， 支持多个环境的配置文件拉取。
会依次拉取不同的环境的配置文件， 直到拉取成功。
