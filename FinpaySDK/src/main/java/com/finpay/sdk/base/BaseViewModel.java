package com.finpay.sdk.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

//import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel extends ViewModel {
    protected MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    protected MutableLiveData<String> errorMessage = new MutableLiveData<>();
    protected CompositeDisposable disposable = new CompositeDisposable();

    public MutableLiveData<Boolean> getIsLoading() {
        return isLoading;
    }

    public MutableLiveData<String> getErrorMessage() {
        return errorMessage;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposable.clear();
    }
}
