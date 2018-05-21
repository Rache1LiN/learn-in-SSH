## 1.实验内容
### a.validate
- 使用validate( )方法进行校验

> 用户在登陆页面输入用户名、密码，用户名和密码框中要求不为空，且字符长度均为6~15位，点击提交按钮，进行校验，校验通过则显示校验成功页面，否则显示错误信息。

- 使用validateXxx( )方法进行校验

> 用户在登陆页面输入用户名、密码，用户名和密码框中要求不为空，点击提交按钮，进行校验，校验通过则显示校验成功页面，否则显示错误信息。

- 使用内置校验器进行校验

> 用户注册验证。

### b.i18n
> 编写i18n支持的Struts2应用，分别使用不同的语言进行测试；将资源文件内容显示。

## 2.效果图
### a.validate校验
#### ① validate()与validateXxx()校验效果图相同，如下：
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/D0DC348F9BD74D02B1529327D3480F1E/128)
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/3A757FD933524C2C810BE61C86089E98/130)

##### Validate() 与 validateXxx()的区别：
###### Validate作用在整个action 的方法中；而validateXxx只作用于Xxx这个方法

#### ② 注册校验
##### 用户名密码空输入
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/2CF3E9AF05FF41778F2738659276290B/139)
##### 确认密码校验
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/1972383DBE194BFB9DEFB0F79B8A675B/134)
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/E9DDFB3561184DDE875D884EE25AEC92/135)
##### 其他校验
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/D8BDDE96EF2B46C580DD76D19DADA6A7/138)
### b.i18n国际化
#### 中文
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/5EC90CF3BB5F410BBA8700897ED15308/137)
#### 英文
![image](https://note.youdao.com/yws/public/resource/fe9e0264622d37b21b35aee1ab6a446a/xmlnote/DE491962B3B344A296343293B6493A3B/136)