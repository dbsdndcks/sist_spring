package kr.co.sist.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AjaxService {
	
	public String jsonData() {
		
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("msg", "���,������,�����,1955");
		jsonObj.put("msg2", "BBQ,����,����,������,������");
		
		return jsonObj.toJSONString();
	}
	
	public String jsonData2() {
		
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("name", "�̸�ȭ");
		
		JSONArray jsonArr = new JSONArray();
		String[] lunchList = "����,��õ,�Ƴ�,�������Ĵ�,���������,���̴װ���".split(",");
		JSONObject jsonTemp = null;
		for(String temp : lunchList) {
			jsonTemp = new JSONObject();
			jsonTemp.put("lunch", temp);
			jsonArr.add(jsonTemp);
		}
		
		jsonObj.put("lunchList", jsonArr);
		return jsonObj.toJSONString();
	}
	
	public static void main(String[] args) {
		System.out.println(new AjaxService().jsonData2());
	}
}
