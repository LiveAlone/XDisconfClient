package com.baidu.disconf.client.common.model;

import java.util.List;

/**
 * 配置基类
 *
 * @author liaoqiqi
 * @version 2014-8-4
 */
public abstract class DisconfCenterBaseModel {

    // 所在类实体
    private Object object;

    // 远程配置服务的URL路径,不包含IP和PORT的
    //
    private List<String> remoteServerUrls;

    // 通用配置
    private DisConfCommonModel disConfCommonModel = new DisConfCommonModel();

    // 回调函数
    private DisconfCommonCallbackModel disconfCommonCallbackModel = new DisconfCommonCallbackModel();

    public DisConfCommonModel getDisConfCommonModel() {
        return disConfCommonModel;
    }

    public void setDisConfCommonModel(DisConfCommonModel disConfCommonModel) {
        this.disConfCommonModel = disConfCommonModel;
    }

    public DisconfCommonCallbackModel getDisconfCommonCallbackModel() {
        return disconfCommonCallbackModel;
    }

    public void setDisconfCommonCallbackModel(DisconfCommonCallbackModel disconfCommonCallbackModel) {
        this.disconfCommonCallbackModel = disconfCommonCallbackModel;
    }

    public List<String> getRemoteServerUrls() {
        return remoteServerUrls;
    }

    public void setRemoteServerUrls(List<String> remoteServerUrls) {
        this.remoteServerUrls = remoteServerUrls;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "\n\tDisconfCenterBaseModel [\n\tobject=" + object + "\n\tremoteServerUrls=" + remoteServerUrls +
                   "\n\tdisConfCommonModel=" + disConfCommonModel + "\n\tdisconfCommonCallbackModel=" +
                   disconfCommonCallbackModel + "]";
    }

    public String infoString() {
        return "\n\tremoteServerUrls=" + remoteServerUrls;
    }
}
