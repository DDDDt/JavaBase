## Java 基础和第三方包

### 基础

### 三方包

介绍使用的第三方包

#### Commons pool

#### Commons cli

Apache Commons Cli 是 Apache Commons 的组件，它们派生自 Java API, 并提供 API 来解析传递给程序的命令行参数/选项

命令行处理包括三个阶段:
- 定义阶段
- 解析阶段 (Parsing Stage)
- 审讯阶段 (Interrogation Stage)

##### 定义阶段
在定义阶段，我们定义应用程序可以采取的相应选项。Commons Cli 提供 Options 类，它是 Option 对象的容器
```java
        // 实例：-name dt
        // 定义阶段
        Options options = new Options();
        // 第一个参数表示，参数名，第二个表示是否需要参数，如果需要填 true，第三个表示描述
        options.addOption("name", true, "名称");

        // 解析阶段
        DefaultParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        // 审讯阶段
        if (cmd.hasOption("name")) {
            System.out.println(cmd.getOptionValue("name"));
        }

```


