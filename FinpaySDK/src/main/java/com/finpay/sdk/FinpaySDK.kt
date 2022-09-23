package com.finpay.sdk

import com.finpay.sdk.controller.UserBallanceController

class FinpaySDK {
    public fun getUserBallance(): String {
        var userBallance = UserBallanceController().getUserBallance();
        return userBallance;
    }
}