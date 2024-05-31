package com.javenock.authserverclient;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AuthServerClientApplicationTests extends DemoArticleControllerTests{

	String accessToken = "E7n4HrQgNZm4CXxCNQ6Z4Whpq0z_4QXcLFgHTCumGNW5OCtOKrXC6lzfKnGS0R136KtlAJJJK6hpA7tim5uuyyES8DL8C2q4TR_t0dpS9rgmRegddnZFXpTrYqFmllfe";

	@Test
	public void testFetchMessageWorks2(){
		given()
				.auth()
				.oauth2(accessToken)
				.get("/demo/public")
				.then().log().all()
				.statusCode(200);
	}

	@Test
	public void testFetchMessageWorks3(){
		given()
				.auth()
				.oauth2(accessToken)
				.get("/demo/read")
				.then().log().all()
				.statusCode(200);
	}

}
