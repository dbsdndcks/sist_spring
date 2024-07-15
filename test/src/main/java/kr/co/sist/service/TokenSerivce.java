package kr.co.sist.service;


import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * url�� key screat������ �ش� ��ū�� �������� ����
 * @author user
 *
 */
@Service
public class TokenSerivce {
	//log4j�� �α� �߰�
    private static final Logger log = LoggerFactory.getLogger(TokenSerivce.class);

	//Import���� ��ū�� �������� url
	public static final String IMPORT_TOKEN_URL = "https://api.iamport.kr/users/getToken";
	//REST APIŰ
	public static final String KEY = "0663051873408815";
	//SCRET
	public static final String SECRET = "WfXfbqE0o4UlTT8yHpqjfPxJ2H936gd5MEXvEpZQ5LMTi6s7rPSFeyTJlNz5l87xrQHJNr0MCas3XNO2";
	
	//������Ʈ ����(��ū)�� �޾��ִ� �Լ�
	public String getImportToken() {
		String result = "";
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(IMPORT_TOKEN_URL);
		 List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
	        urlParameters.add(new BasicNameValuePair("imp_key", KEY));
	        urlParameters.add(new BasicNameValuePair("imp_secret", SECRET));

			try {
				post.setEntity(new UrlEncodedFormEntity(urlParameters));
				HttpResponse res = client.execute(post);
				ObjectMapper mapper = new ObjectMapper();
				String body = EntityUtils.toString(res.getEntity());
				JsonNode rootNode = mapper.readTree(body);
				JsonNode resNode = rootNode.get("response");
				result = resNode.get("access_token").asText();
			
			}catch (Exception e) {
				e.printStackTrace();
			}
	        log.info("#################################################### TOKEN :"+result);


			return result;
		}
	
}
