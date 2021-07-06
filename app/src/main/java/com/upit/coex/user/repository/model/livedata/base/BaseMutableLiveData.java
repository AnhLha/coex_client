package com.upit.coex.user.repository.model.livedata.base;


import androidx.lifecycle.MutableLiveData;

import com.upit.coex.user.repository.model.data.base.BaseData;
/**
 * Created by cin on 3/9/2020.
 */

public abstract class BaseMutableLiveData<T extends BaseData > {
    protected MutableLiveData<T> mList;
}
