package cn.onlinecache.minimalist;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by nieyinyin on 12/12/2016.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
