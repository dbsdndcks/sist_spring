package kr.co.sist.service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class AjaxService {
	
	public String jsonData() {
		
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("msg", "ºò¸Æ,»óÇÏÀÌ,º£Åäµð,1955");
		jsonObj.put("msg2", "BBQ,±³ÃÌ,±Á³×,ÈÄÂüÀß,Äá´ßÄá´Ú");
		
		return jsonObj.toJSONString();
	}
	
	public String jsonData2() {
		
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("name", "ÀÌ¸íÈ­");
		
		JSONArray jsonArr = new JSONArray();
		String[] lunchList = "Èþ½Ì,±èÃµ,¸Æ³¯,»õ¸¶À»½Ä´ç,Á¦ÁÖÀºÈñ³×,´ÙÀÌ´×°¥ºñ".split(",");
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
