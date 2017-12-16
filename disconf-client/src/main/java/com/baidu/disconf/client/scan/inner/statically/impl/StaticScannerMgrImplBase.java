package com.baidu.disconf.client.scan.inner.statically.impl;

import com.baidu.disconf.client.common.model.DisConfCommonModel;
import com.baidu.disconf.client.config.DisClientConfig;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author liaoqiqi
 * @version 2014-9-9
 */
public class StaticScannerMgrImplBase {

    /**
     * env/version 默认是应用整合设置的，但用户可以在配置中更改它
     */
    protected static DisConfCommonModel makeDisConfCommonModel(String app, List<String> envList, String version) {

        DisConfCommonModel disConfCommonModel = new DisConfCommonModel();

        // app
        if (!app.isEmpty()) {
            disConfCommonModel.setApp(app);
        } else {
            disConfCommonModel.setApp(DisClientConfig.getInstance().APP);
        }

        // env
        if (!CollectionUtils.isEmpty(envList)){
            disConfCommonModel.setEnvList(envList);
        }else {
            disConfCommonModel.setEnvList(DisClientConfig.getInstance().getEnvList());
        }

        // version
        if (!version.isEmpty()) {
            disConfCommonModel.setVersion(version);
        } else {
            disConfCommonModel.setVersion(DisClientConfig.getInstance().VERSION);
        }

        return disConfCommonModel;
    }

}
