# 帝可得管理系统

帝可得管理系统是基于若依（RuoYi）框架进行二次开发的管理系统，旨在为企业提供高效的人员管理和点位管理功能。该系统继承了若依框架的优秀特性，并在此基础上进行了定制化开发，以满足帝可得业务需求。

## 项目概述

帝可得管理系统是一个基于Spring Boot + Vue.js的前后端分离的管理系统。目前已完成人员管理和点位管理模块的开发，后续将根据业务需求逐步扩展其他功能模块。

## 技术栈

- **后端技术栈**
  - Spring Boot
  - MyBatis
  - MySQL
  - Redis
  - Shiro（权限管理）
  - Swagger（API文档）

- **前端技术栈**
  - Vue.js（vue3）
  - Element UI
  - Axios
  - Vue Router

## 功能模块

### 1. 人员管理

人员管理模块主要用于管理企业内部员工信息，包括以下功能：

- **员工信息管理**：添加、编辑、删除、查询员工信息。
- **角色管理**：为员工分配角色，控制不同角色的权限。
- **部门管理**：管理公司部门结构，支持多级部门。
- **权限管理**：基于角色的权限控制，确保不同角色的员工只能访问其权限范围内的功能。

### 2. 点位管理

点位管理模块用于管理企业的物理点位信息，包括以下功能：

- **点位信息管理**：添加、编辑、删除、查询点位信息。
- **点位状态监控**：实时监控点位的状态（如在线、离线、故障等）。
- **点位分配**：将点位分配给特定员工或部门进行管理。
- **点位统计**：提供点位的统计报表，支持按时间、区域等条件进行筛选。

## 安装与部署

### 后端部署

1. **环境准备**
   - JDK 1.8+
   - MySQL 5.7+
   - Redis 3.0+

2. **数据库配置**
   - 创建数据库并导入`sql`目录下的数据库脚本。
   - 修改`application.yml`中的数据库连接配置。

3. **启动项目**
   - 使用Maven构建项目：`mvn clean install`
   - 启动Spring Boot应用：`java -jar target/your-project-name.jar`

### 前端部署

1. **环境准备**
   - Node.js 12+
   - npm 6+

2. **安装依赖**
   - 进入前端项目目录：`cd ruoyi-ui`
   - 安装依赖：`npm install`

3. **启动项目**
   - 开发环境启动：`npm run dev`
   - 生产环境构建：`npm run build`

## 使用说明

1. **登录系统**
   - 默认管理员账号：`admin`，密码：`admin123`

2. **人员管理**
   - 在“系统管理”菜单下，可以找到“用户管理”、“角色管理”、“部门管理”等子菜单，进行相应的操作。

3. **点位管理**
   - 在“业务管理”菜单下，可以找到“点位管理”子菜单，进行点位的添加、编辑、删除和查询操作。。

## 贡献者

- **开发团队**：帝可得技术部
- **联系方式**：tech@dkg.com

## 许可证

本项目基于MIT许可证开源，详情请参见[LICENSE](LICENSE)文件。

---
## 目录结构

D:\dkd-parent\dkd-vue
├─index.html
├─LICENSE
├─package-lock.json
├─package.json
├─pnpm-lock.yaml
├─README.md
├─vite.config.js
├─vite
|  ├─plugins
├─src
|  ├─App.vue
|  ├─main.js
|  ├─permission.js
|  ├─settings.js
|  ├─views
|  |   ├─login.vue
|  |   ├─register.vue
|  |   ├─tool
|  |   |  ├─swagger
|  |   |  |    └index.vue
|  |   |  ├─gen
|  |   |  |  ├─basicInfoForm.vue
|  |   |  |  ├─editTable.vue
|  |   |  |  ├─genInfoForm.vue
|  |   |  |  ├─importTable.vue
|  |   |  |  └index.vue
|  |   |  ├─build
|  |   |  |   ├─CodeTypeDialog.vue
|  |   |  |   ├─DraggableItem copy.vue
|  |   |  |   ├─DraggableItem.vue
|  |   |  |   ├─IconsDialog.vue
|  |   |  |   ├─index.vue
|  |   |  |   ├─RightPanel.vue
|  |   |  |   └TreeNodeDialog.vue
|  |   ├─system
|  |   |   ├─user
|  |   |   |  ├─authRole.vue
|  |   |   |  ├─index.vue
|  |   |   |  ├─profile
|  |   |   |  |    ├─index.vue
|  |   |   |  |    ├─resetPwd.vue
|  |   |   |  |    ├─userAvatar.vue
|  |   |   |  |    └userInfo.vue
|  |   |   ├─role
|  |   |   |  ├─authUser.vue
|  |   |   |  ├─index.vue
|  |   |   |  └selectUser.vue
|  |   |   ├─post
|  |   |   |  └index.vue
|  |   |   ├─notice
|  |   |   |   └index.vue
|  |   |   ├─menu
|  |   |   |  └index.vue
|  |   |   ├─dict
|  |   |   |  ├─data.vue
|  |   |   |  └index.vue
|  |   |   ├─dept
|  |   |   |  └index.vue
|  |   |   ├─config
|  |   |   |   └index.vue
|  |   ├─redirect
|  |   |    └index.vue
|  |   ├─monitor
|  |   |    ├─server
|  |   |    |   └index.vue
|  |   |    ├─operlog
|  |   |    |    └index.vue
|  |   |    ├─online
|  |   |    |   └index.vue
|  |   |    ├─logininfor
|  |   |    |     └index.vue
|  |   |    ├─job
|  |   |    |  ├─index.vue
|  |   |    |  └log.vue
|  |   |    ├─druid
|  |   |    |   └index.vue
|  |   |    ├─cache
|  |   |    |   ├─index.vue
|  |   |    |   └list.vue
|  |   ├─manage
|  |   |   ├─region
|  |   |   |   └index.vue
|  |   |   ├─partner
|  |   |   |    └index.vue
|  |   |   ├─node
|  |   |   |  └index.vue
|  |   |   ├─emp
|  |   |   |  └index.vue
|  |   ├─home
|  |   |  ├─index.vue
|  |   |  ├─components
|  ├─utils
|  |   ├─auth.js
|  |   ├─dict.js
|  |   ├─dynamicTitle.js
|  |   ├─errorCode.js
|  |   ├─index.js
|  |   ├─jsencrypt.js
|  |   ├─permission.js
|  |   ├─request.js
|  |   ├─ruoyi.js
|  |   ├─scroll-to.js
|  |   ├─theme.js
|  |   ├─validate.js
|  |   ├─generator
|  |   |     ├─config.js
|  |   |     ├─css.js
|  |   |     ├─drawingDefalut.js
|  |   |     ├─html.js
|  |   |     ├─icon.json
|  |   |     ├─js.js
|  |   |     └render.js
|  ├─store
|  |   ├─index.js
|  |   ├─modules
|  |   |    ├─app.js
|  |   |    ├─dict.js
|  |   |    ├─permission.js
|  |   |    ├─settings.js
|  |   |    ├─tagsView.js
|  |   |    └user.js
|  ├─router
|  |   └index.js
|  ├─plugins
|  |    ├─auth.js
|  |    ├─cache.js
|  |    ├─download.js
|  |    ├─index.js
|  |    ├─modal.js
|  |    └tab.js
|  ├─layout
|  |   ├─index.vue
|  |   ├─components
|  |   |     ├─AppMain.vue
|  |   |     ├─index.js
|  |   |     ├─Navbar.vue
|  |   |     ├─TagsView
|  |   |     |    ├─index.vue
|  |   |     |    └ScrollPane.vue
|  |   |     ├─Sidebar
|  |   |     |    ├─index.vue
|  |   |     |    ├─Link.vue
|  |   |     |    ├─Logo.vue
|  |   |     |    └SidebarItem.vue
|  |   |     ├─Settings
|  |   |     |    └index.vue
|  |   |     ├─InnerLink
|  |   |     |     └index.vue
|  |   |     ├─IframeToggle
|  |   |     |      └index.vue
|  ├─directive
|  |     ├─index.js
|  |     ├─permission
|  |     |     ├─hasPermi.js
|  |     |     └hasRole.js
|  |     ├─common
|  |     |   └copyText.js
|  ├─components
|  |     ├─week-month-year
|  |     |        └index.vue
|  |     ├─TreeSelect
|  |     |     └index.vue
|  |     ├─TopNav
|  |     |   └index.vue
|  |     ├─SvgIcon
|  |     |    ├─index.vue
|  |     |    └svgicon.js
|  |     ├─SizeSelect
|  |     |     └index.vue
|  |     ├─Screenfull
|  |     |     └index.vue
|  |     ├─RuoYi
|  |     |   ├─Git
|  |     |   |  └index.vue
|  |     |   ├─Doc
|  |     |   |  └index.vue
|  |     ├─RightToolbar
|  |     |      └index.vue
|  |     ├─ParentView
|  |     |     └index.vue
|  |     ├─Pagination
|  |     |     └index.vue
|  |     ├─ImageUpload
|  |     |      └index.vue
|  |     ├─ImagePreview
|  |     |      └index.vue
|  |     ├─iFrame
|  |     |   └index.vue
|  |     ├─IconSelect
|  |     |     ├─index.vue
|  |     |     └requireIcons.js
|  |     ├─HeaderSearch
|  |     |      └index.vue
|  |     ├─Hamburger
|  |     |     └index.vue
|  |     ├─FileUpload
|  |     |     └index.vue
|  |     ├─empty-data-chart
|  |     |        └index.vue
|  |     ├─Editor
|  |     |   └index.vue
|  |     ├─DictTag
|  |     |    └index.vue
|  |     ├─Crontab
|  |     |    ├─day.vue
|  |     |    ├─hour.vue
|  |     |    ├─index.vue
|  |     |    ├─min.vue
|  |     |    ├─month.vue
|  |     |    ├─result.vue
|  |     |    ├─second.vue
|  |     |    ├─week.vue
|  |     |    └year.vue
|  |     ├─Breadcrumb
|  |     |     └index.vue
|  ├─assets
|  |   ├─vm
|  |   | ├─default_sku.png
|  |   | └selected.png
|  |   ├─user-task-stats
|  |   ├─task
|  |   ├─styles
|  |   |   ├─btn.scss
|  |   |   ├─element-ui.scss
|  |   |   ├─index.scss
|  |   |   ├─mixin.scss
|  |   |   ├─ruoyi.scss
|  |   |   ├─sidebar.scss
|  |   |   ├─transition.scss
|  |   |   └variables.module.scss
|  |   ├─logo
|  |   |  ├─logo.png
|  |   |  └logo.png.bak
|  |   ├─images
|  |   |   ├─circle.png
|  |   |   ├─dark.svg
|  |   |   ├─empty.png
|  |   |   ├─light.svg
|  |   |   ├─login-background.jpg
|  |   |   ├─login-background1.png
|  |   |   ├─pay.png
|  |   |   ├─profile.jpg
|  |   |   ├─sale.png
|  |   |   └task.png
|  |   ├─icons
|  |   |   ├─svg
|  |   |   |  ├─商品管理.svg
|  |   |   |  ├─工单管理.svg
|  |   |   |  ├─点位管理.svg
|  |   |   |  ├─策略管理.svg
|  |   |   |  ├─订单管理.svg
|  |   |   |  └设备管理.svg
|  ├─api
|  |  ├─login.js
|  |  ├─menu.js
|  |  ├─page.js
|  |  ├─tool
|  |  |  └gen.js
|  |  ├─system
|  |  |   ├─config.js
|  |  |   ├─dept.js
|  |  |   ├─menu.js
|  |  |   ├─notice.js
|  |  |   ├─post.js
|  |  |   ├─role.js
|  |  |   ├─user.js
|  |  |   ├─dict
|  |  |   |  ├─data.js
|  |  |   |  └type.js
|  |  ├─monitor
|  |  |    ├─cache.js
|  |  |    ├─job.js
|  |  |    ├─jobLog.js
|  |  |    ├─logininfor.js
|  |  |    ├─online.js
|  |  |    ├─operlog.js
|  |  |    └server.js
|  |  ├─manage
|  |  |   ├─emp.js
|  |  |   ├─node.js
|  |  |   ├─partner.js
|  |  |   ├─region.js
|  |  |   └role.js
