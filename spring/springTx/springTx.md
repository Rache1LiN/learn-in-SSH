## 1.实验内容
spring声明式事务的实现，并测试对比支持与不支持事务方法的回滚情况
## 2.结果截图
## 单表测试用例
（操作1->操作2）
方法 | 操作1 | 异常触发 | 操作2
---|---|---|---
testTxYes() | 将id为1的remark字段改为testTxYes() | 将0作为除数 | 将id为2的remark字段改为testTxYes()
testTxNo() | 将id为1的remark字段改为testTxNo() | 将0作为除数 | 将id为2的remark字段改为testTxNo()

## 单表Member测试
### 未运行testTxYes()和testTxNo()方法时的表内容
![image](https://note.youdao.com/yws/public/resource/ad60793eaf2994039c0577852894d5f3/xmlnote/7AE141F6B8B749E794DFCC574279EF92/286)
### 运行支持事务的方法testTxYes()后表内容
![image](https://note.youdao.com/yws/public/resource/ad60793eaf2994039c0577852894d5f3/xmlnote/2B60FFA89B0243AFA88D5EF069EE8A9E/288)
### 运行不支持事务的方法testTxNo()后表内容
![image](https://note.youdao.com/yws/public/resource/ad60793eaf2994039c0577852894d5f3/xmlnote/54C974A8E0E440619B77EBFDCF885ACF/290)

## 双表测试用例
（操作1->操作2）
方法 | 操作1 | 异常触发 | 操作2
---|---|---|---
testTxYes() | 将Member表id为1的remark字段改为testTxYes() | 将0作为除数 | 将NewsCat表id为1的remark字段改为testTxYes()
testTxNo() | 将Member表id为1的remark字段改为testTxNo() | 将0作为除数 | 将NewsCatid为1的remark字段改为testTxNo()

## 双表Member和NewsCat操作
### 未运行testTxYes()和testTxNo()方法时的表内容
![image](https://note.youdao.com/yws/public/resource/ad60793eaf2994039c0577852894d5f3/xmlnote/D493BEA4F1484A5FA03AFFA877DF7195/297)
### 运行支持事务的方法testTxYes()后表内容
![image](https://note.youdao.com/yws/public/resource/ad60793eaf2994039c0577852894d5f3/xmlnote/E98C724A59A24E7DA567B34D4FC851B9/299)
### 运行不支持事务的方法testTxNo()后表内容
![image](https://note.youdao.com/yws/public/resource/ad60793eaf2994039c0577852894d5f3/xmlnote/DFB7932934CD49C094D29E08A8B37E4F/301)