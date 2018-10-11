package test;

import org.json.*;
public class TestJSON {
	public static void main(String args[]) {
		String tempr=String.valueOf((int)(Math.random()*100)); 
		String hum=String.valueOf((int)(Math.random()*100));
		String press=String.valueOf((int)(Math.random()*100));
		/*
		 * 我这里的温度湿度压力是用随机数生成的，你把检测到的数据给它
		 * */
		JSONObject jsonObject = new JSONObject();
		/*
		 * 下面这个函数是把数据存储到JSON对象中
		*/
		jsonObject.put("tempr",tempr)
		.put("hum",hum)
		.put("press", press);	
		/*
		 * 你可以把你的JSON对象使用这个函数转换成字符串
		 * */
		String result=jsonObject.toString();
		System.out.println(result);//输出结果 {"hum":"22","tempr":"90","press":"56"}
		/*
		 * 然后在服务器端将数据发送
		 * */
		
		//JSON的遍历
		for(String key:jsonObject.keySet()) {
			System.out.println(key+" "+jsonObject.get(key));
		}
		
		//将字符串转换文JSON
		JSONObject jsonObject1=new JSONObject(result);
		System.out.println("转换为JSON的结果为");
		for(String key:jsonObject1.keySet()) {
			System.out.println(key+" "+jsonObject1.get(key));
		}
		
	}
	
}
