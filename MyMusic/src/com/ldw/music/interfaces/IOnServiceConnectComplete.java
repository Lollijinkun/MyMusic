package com.ldw.music.interfaces;

import com.ldw.music.aidl.IMediaService;

/**
 * 服务连接成功后执行操作
 * @author 慎之
 *
 */
public interface IOnServiceConnectComplete {

	public void onServiceConnectComplete(IMediaService service);
}

