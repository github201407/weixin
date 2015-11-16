package com.yourcompany.struts.pojo;

/**
 * 微信通用接口凭证
 * 
 * @author liufeng
 * @date 2013-08-08
 * @format {"access_token":"ACCESS_TOKEN","expires_in":7200}
 */
public class AccessToken {
	// 获取到的凭证
	private String token;
	// 凭证有效时间，单位：秒
	private int expiresIn;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}
}