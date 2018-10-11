###JSON 的使用
####1、导包  
 [json-20160810.jar](https://github.com/WangQi1415/Java/blob/master/JSON/TestJson/lib/json-20160810.jar)  
####2、new JSONObject对象  
```java
JSONObject jsonObject = new JSONObject();
```
####3、向JSONObject对象中添加数据
```java
jsonObject.put(key,value);
```
####4、JSON格式数据转换为字符串
```java
jsonObject.toString();
```
####5、根据JSON格式字符串构建JSON对象
```java
JSONObject jsonObject = new JSONObject(String);
```
####6.遍历JSON格式的数据
```java
for(String key:jsonObject.keySet()) {
			System.out.println(key+" "+jsonObject.get(key));
		}
```