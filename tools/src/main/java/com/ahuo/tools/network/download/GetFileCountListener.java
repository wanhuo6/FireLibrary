package com.ahuo.tools.network.download;

/**
 * Created by hly on 16/6/15.
 * email hugh_hly@sina.cn
 */
public interface GetFileCountListener {
    void success(Long fileSize);

    void failed();
}
