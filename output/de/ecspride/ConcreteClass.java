package de.ecspride;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;

public class ConcreteClass extends BaseClass {
    @Override
    public String foo(Context context) {
        TelephonyManager telephonyManager =
          (TelephonyManager)
            context.getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId();
    }
    
    @Override
    public void bar(String s) {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("+49 1234", null, s, null, null);
    }
    
    public ConcreteClass() { super(); }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1452541298566L;
    public static final String jlc$ClassType$jl7 =
      ("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");
}
