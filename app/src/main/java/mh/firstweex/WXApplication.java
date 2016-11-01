package mh.firstweex;


import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;

/**
 * Created by vigourpan on 2016/10/31.
 */

public class WXApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WXEnvironment.addCustomOptions("appName","TBSample");
        WXSDKEngine.initialize(this,new InitConfig.Builder()
                .setImgAdapter(new ImageAdapter())
                .build()
        );
    }
}