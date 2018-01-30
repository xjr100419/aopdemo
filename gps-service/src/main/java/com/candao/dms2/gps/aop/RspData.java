package com.candao.dms2.gps.aop;

/**
 * 响应数据
 * @author xiao
 */
public class RspData {
	
	/**
	 * 响应状态 {link RspStatus}
	 */
	public int status;
	
	/**
	 * 响应状态描述
	 */
	public String msg;
	
	/**
	 * 响应具体数据
	 */
	public Object data;
	
	// 默认成功

	public RspData(Object data) {
		this.data = data;
	}

	public RspData() {
	}
	

	/**
	 * 返回一个失败的RspData<br/>
	 * @param status-自定义状态
	 * @param msg-自定义信息
	 * @return
	 */
	public static RspData getFailRspData(int status, String msg) {
		RspData rspData = new RspData();
		rspData.status = status;
		rspData.msg = msg;
		return rspData;
	}
	

	@Override
	public String toString() {
		return "RspData [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}
	
}