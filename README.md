# nacosdemo
nacos config demo consumer provider
nacos 注册中心 生产者  消费者
配置动态修改
nacos管理控制台编辑属性文件
动态发布给业务系统

注意：nacos  本地安装一个

（一）windows开发环境 就单机模式启动就行    ，如下

	startup.cmd -m standalone

（二） 作为配置中心 过程　　

　　1 引入nacos-config  pom文件

　　2 创建jdbc.properties 配置nacos信息

　　3 配置中心(nacos) 增加规则

　　4 给服务  .properties中 添加配置

　　5 动态获取配置注解

　　　　@RefreshScope   //动态获取并刷新配置

　　　　@Value("${配置项的名}")
