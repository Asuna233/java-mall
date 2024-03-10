项目内容：基于 B2C 模式的电子商务平台，包含后台管理系统和前台用户系统，项目采用前后端分离开发模式。

涉及技术：后端采用了 Spring Boot 和 Spring Cloud Alibaba 构建微服务架构。前端运用 Vue3 和 Element Plus 实现了响应式用户
界面。项目集成了 Redis 缓存、MySQL 数据库、EasyExcel 数据处理、Minio 对象存储和短信平台。

主要功能：后台实现了用户管理（使用 Redis 缓存用户数据，使用拦截器验证登录状态），权限管理，商品管理，订单管理（使用 Spring
Task 优化订单管理），使用 Spring AOP 记录日志等功能。前台实现了用户的登录注册（手机号注册），商品浏览（使用 Spring Cache
自动添加缓存），购物车和订单支付（支付宝支付）等功能。
