package com.eagle.gateway.server.vo;

import lombok.Data;

/**
 * 网关会话信息
 * 
 * @author jiangyonghua
 * @date 2019年6月3日
 */
@Data
public class GwSession {

	private String sessionid;

	private String userid;

	private String username;
}
