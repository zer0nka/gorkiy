package com.askgps.personaltrackercore.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@"}, d2 = {"processWifi", "", "wifi", "", "Lcom/askgps/personaltrackercore/database/model/IndoorDevice;", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 16})
@DebugMetadata(c = "com.askgps.personaltrackercore.utils.WifiUtils", f = "WifiUtils.kt", i = {0, 0}, l = {136}, m = "processWifi", n = {"this", "wifi"}, s = {"L$0", "L$1"})
/* compiled from: WifiUtils.kt */
final class WifiUtils$processWifi$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WifiUtils this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WifiUtils$processWifi$1(WifiUtils wifiUtils, Continuation continuation) {
        super(continuation);
        this.this$0 = wifiUtils;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processWifi(null, this);
    }
}
