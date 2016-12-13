package cn.onlinecache.minimalist.biz.db;

import cn.onlinecache.minimalist.biz.bean.TaskBean;
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by nieyinyin on 07/12/2016.
 */

public class TaskDao {

    private Realm mRealm;
    private static TaskDao taskDao;

    public Realm getRealm() {
        if (mRealm == null) {
            mRealm = Realm.getDefaultInstance();
        }
        return mRealm;
    }

    public static TaskDao getInstance() {
        if (taskDao == null) {
            taskDao = new TaskDao();
        }
        return taskDao;
    }

    public TaskBean getTaskBean(int taskId) {
        return getRealm().where(TaskBean.class).equalTo("taskId", taskId).findFirst();
    }

    public RealmResults<TaskBean> getTaskBeanList() {
        RealmResults<TaskBean> realmResults = getRealm().where(TaskBean.class).findAll();
        return realmResults;
    }

}
