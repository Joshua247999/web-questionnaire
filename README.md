# web-questionnaire

问卷管理系统是一个基于Tomcat和Java Web Spring Boot框架的应用，用于管理用户、项目和问卷。它提供了用户管理、项目管理以及在项目下创建、设计、删除和发布问卷的功能。

## 功能特点

- 用户管理：允许管理员管理用户，包括添加、编辑和删除用户。
- 项目管理：管理不同的项目，创建项目并为每个项目添加或删除问卷。
- 问卷管理：在项目下进行问卷的设计（独立设计或批量导入）、创建、删除和发布。
- 安全认证：用户身份验证和访问权限控制。
- 响应式界面：用户友好的界面，支持多种设备访问。
- 单元测试：完成用例单元测试

## 安装和使用

### 环境要求

- Java 8+
- Apache Tomcat
- MySQL数据库

### 安装步骤

1. 克隆本仓库到你的本地环境：
   git clone https://github.com/yourusername/your-repo.git
   
2. 配置数据库连接：在 application.properties 文件中配置数据库连接信息。

3. 构建项目并部署到Tomcat。

4. 启动Tomcat服务器。

5. 访问应用：在浏览器中输入 http://localhost:8080/your-app 来访问应用。

### 说明使用
登录：使用管理员账户登录或创建一个新账户。
用户管理：在用户管理界面添加、编辑或删除用户。
项目管理：创建新项目，为项目添加问卷。
问卷管理：在项目下创建、设计、发布和删除问卷。
批量导入：从数据库中批量导入问卷。
查看答卷：可以查看答卷情况和具体答卷信息

## 贡献
如果你想为这个项目做出贡献，请遵循以下步骤：
- Fork这个仓库。
- 创建一个新分支：git checkout -b feature/your-feature
- 提交你的更改：git commit -m 'Add some feature'
- 推送到你的分支：git push origin feature/your-feature
- 创建一个Pull Request。

## 许可证
这个项目采用 Apache 许可证。有关详细信息，请参阅 LICENSE 文件。

## 联系方式
作者：Joshua247999、Orfevree
邮箱：2158446986@qq.com、1603638229@qq.com
感谢您使用问卷管理系统！如有任何问题或建议，请随时联系我们。
