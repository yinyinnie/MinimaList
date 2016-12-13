package cn.onlinecache.minimalist.biz.bean;

import io.realm.RealmObject;

/**
 * Created by nieyinyin on 07/12/2016.
 */

public class TaskBean extends RealmObject {

    public int taskId;
    public String taskName;
    public boolean isFinished;
    public boolean isDeleted;
    public boolean isDeletedForever;

}
