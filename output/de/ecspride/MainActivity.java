package de.ecspride;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/**
 * @testcase_name Merge1
 * @version 0.1
 * @author Secure Software Engineering Group (SSE),
 * 		European Center for Security and Privacy by Design (EC SPRIDE) 
 * @author_mail steven.arzt@cased.de
 * 
 * @description Sensitive data is assigned to a heap object which is
 * 		then shuffled around. Only constant data is leaked.
 * @dataflow source -> no connection to sink
 * @number_of_leaks 0
 * @challenges Aliases must be computed precisely or a false positive
 * 		will be found.
 */
public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction(
                                          ).add(
                                              R.id.container,
                                              new PlaceholderFragment()).commit(
                                                                           );
        }
        aliasFlowTest();
    }
    
    class A {
        public String b = "Y";
        
        public A() { super(); }
        
        public static final String jlc$CompilerVersion$jl7 = "2.7.0";
        public static final long jlc$SourceLastModified$jl7 = 1452579402000L;
        public static final String jlc$ClassType$jl7 =
          ("H4sIAAAAAAAAAK1XbWwURRieu7bXDwp3LVAqQinlICngHVUx0aJQzta2XGlD" +
           "aRPOkzLdnWuX7u0uu3P0WkSBxMAvQiIgJtJfEBOCQIxE/2BqjIrBmGCIHySC" +
           "mphogIT+EI31653Z24/bXvWPl+zs3Mz7vvN+PvPu+XuoxNDRGk2Vx4ZklUZI" +
           "lkZ2y+sjdEwjRqQzvr4H6wYRYzI2jO2wNiA0XAo+mD42HPKjQALNx4qiUkwl" +
           "VTG2EUOV9xIxjoLOaqtM0gZFofhuvBdHM1SSo3HJoM1xNMfFSlE4bqkQBRWi" +
           "oEKUqxBtcaiAaS5RMukY48AKNfagl5AvjgKawNSjaHm+EA3rOJ0T08MtAAll" +
           "7H8/GMWZszqqt203bZ5h8Ik10eOv7Qy9XYSCCRSUlF6mjgBKUDgkgSrTJD1I" +
           "dKNFFImYQFUKIWIv0SUsS+Nc7wSqNqQhBdOMTmwnscWMRnR+puO5SoHZpmcE" +
           "quq2eSmJyKL1ryQl4yGwtcax1bSwja2DgRUSKKansEAsluIRSREpWublsG0M" +
           "bwECYC1NEzqs2kcVKxgWULUZOxkrQ9FeqkvKEJCWqBk4haLFswplvtawMIKH" +
           "yABFtV66HnMLqMq5IxgLRQu9ZFwSRGmxJ0qu+NzbuuHoPqVd8XOdRSLITP8y" +
           "YKrzMG0jKaITRSAmY+Xq+Elcc+WIHyEgXughNmnefXFq09q6yasmzcMFaLoH" +
           "dxOBDghnBuddXxJrfLKIqVGmqYbEgp9nOU//ntxOc1aDyquxJbLNiLU5ue3j" +
           "HQfOkTt+VNGBAoIqZ9KQR1WCmtYkmejPEYXomBKxA5UTRYzx/Q5UCvO4pBBz" +
           "tTuVMgjtQMUyXwqo/D+4KAUimItKYS4pKdWaa5gO83lWQwj54EEBeNYgVHw7" +
           "975J0ZbWp5J9BiR8Mt7emXyWGCNU1ZJdRB8iTUmsaUlDF5JpLClJljZJkSSJ" +
           "YGi6BJMuWG0RqLRXomMRtqv9v+KyTPvQqM8Hjl3iLWsZKqJdlUWiDwjHM5tb" +
           "py4MXPPbaZ6zGxJaJBHrhIj7hHAL8vm46AXsLDNe4O0RqFtAtMrG3hc6dx1p" +
           "KIJE0UaLmQOBNDo7sMacSu/geCZAuqHJU6MH+19e50f+fIRk+sFSBWPvYbhm" +
           "41fYWxmF5AYP//Tg4sn9qlMjeZCbK92ZnKz0Grye1FWBiABmjvjV9fjywJX9" +
           "YT8qhnoGDKPgOAYPdd4z8kqw2YIzZksJGJxS9TSW2ZaFQRV0WFdHnRUe4nls" +
           "qDajzeLhUZAj4dO92umvP//5Me5JCzSDrmuol9BmV6EyYUFeklVOeLfrhADd" +
           "t6d6Xj1x7/DzPLZAsaLQgWE2xqBAITrgwVeu7vnm9q0zN/x2PqAsN6Hqb/j5" +
           "4PmLPWydLbA3QG0sV+D1doVr7MBVjkpQ6zLgDcuJcJ+SVkUpJeFBmbAc/CO4" +
           "suny3aMhM8oyrFhJsva/BTjrD21GB67t/LWOi/EJ7K5x3OaQmQA235Hcout4" +
           "jOmRPfjF0tc/wacBCgF+DGmccERBOTcwpSLcF418fMSzt44Nywx3audXj6sn" +
           "GBCO3bg/t//++1Nc2/ymwh3uLqw1m8ljRgEOK0O5gSHb99ab7c7X2LggCzos" +
           "8hZ7OzaGQdjjk1uTIXlyGo5NwLECXLdGtw7oks3LoBx1SenNDz6s2XW9CPnb" +
           "UIWsYrEN8zpD5ZDgxBgGYMpqGzch/htlSoW4P9AMD5lZVGtDTOPsENPGGgen" +
           "Smt/75YHD/3w2wxPcXApcF96+BPR828sjj1zh/M7Vc6467IzEReaLIf30XPp" +
           "X/wNgY/8qDSBQkKug+vHcoYVWAK6FsNq66DLy9vP70DM67bZRrElXoRxHevF" +
           "FwfpYc6o2bzCkxXlzMu18KyFbJjOve+6s8KH+GQjZ6nn4wo2rDJjQqEhzQzK" +
           "kpC1ZfqtTGOy7uTeP7pkUuQb5NQLoVfm2cOMjZjtlolzbGxiwyZT7vpC2WJu" +
           "1bMhbJ/Ob3KfdYNbb9fproxCLOeXztZs8UbxzKHjE2L32SazJarOb2BaoT9/" +
           "68s/P4uc+u7TArdrINcsuw8E21ss22tnu31Bq9oZjbrZXAoXJoJliyb6vuK3" +
           "j90AlgO4pzKy7I65ax7QdJKSeOzLzQzQ+KufojkuJSgqs6Zcxz6TagdFfpGL" +
           "SmgF4mYmadaX71g7gtX/EkFvLFbklTf/pMnZ35UxP2oGhIsTnVv3TT1x1rzr" +
           "4GNofJy3wNDRmzeq3Swsn1WaJSvQ3jg971L5Sn8OjPPuWo9uywrfKq1pjfJ7" +
           "YPy9Re9seHPiFr8D/wHQn1Upaw4AAA==");
    }
    
    public class B {
        public A attr;
        
        public B() { super(); }
        
        public static final String jlc$CompilerVersion$jl7 = "2.7.0";
        public static final long jlc$SourceLastModified$jl7 = 1452579402000L;
        public static final String jlc$ClassType$jl7 =
          ("H4sIAAAAAAAAAK1XXWwUVRS+u/0vhd22UEqFUkrBFMguRSHRolLW1rZsaUNp" +
           "E9aV5Xbmbjt0dmaYuUu3RRRIDDwREgExkT5BTAgCMRJ9wdQYFYMxwRD/EtH4" +
           "pEES+iAa8e/cO787bfHFTebO3XvPOff8fvfMxbuoyNDRWk2Vx4dllUZIjkb2" +
           "yhsjdFwjRqQ7vrEP6wYRYzI2jJ2wlhIar4TuPzgxEg6i4gSqxoqiUkwlVTF2" +
           "EEOV9xMxjkLuartMMgZF4fhevB9Hs1SSo3HJoK1xNM/DSlFT3FYhCipEQYUo" +
           "VyHa5lIB03yiZDMxxoEVauxDL6FAHBVrAlOPohX5QjSs44wlpo9bABJK2f9B" +
           "MIoz53TU4Nhu2jzD4FNroydf2x1+uwCFEigkKf1MHQGUoHBIAlVkSGaI6Eab" +
           "KBIxgSoVQsR+oktYlia43glUZUjDCqZZnThOYotZjej8TNdzFQKzTc8KVNUd" +
           "89ISkUX7X1FaxsNga41rq2lhB1sHA8slUExPY4HYLIWjkiJStNzP4djYtA0I" +
           "gLUkQ+iI6hxVqGBYQFVm7GSsDEf7qS4pw0BapGbhFIrq5hTKfK1hYRQPkxRF" +
           "tX66PnMLqMq4IxgLRYv8ZFwSRKnOFyVPfO5u33z8gNKpBLnOIhFkpn8pMNX7" +
           "mHaQNNGJIhCTsWJN/DSuuXYsiBAQL/IRmzTvvji9ZV391HWT5pFZaHqH9hKB" +
           "poRzQwtuLo01P1HA1CjVVENiwc+znKd/n7XTmtOg8mociWwzYm9O7fh416EL" +
           "5E4QlXehYkGVsxnIo0pBzWiSTPTniEJ0TInYhcqIIsb4fhcqgXlcUoi52ptO" +
           "G4R2oUKZLxWr/D+4KA0imItKYC4padWea5iO8HlOQwiVwoPmwxNFqMh+l1K0" +
           "rf3J5IABCZ+Md3YnnyXGKFW1ZA/Rh0lLEmta0tCFZAZLSpKlTVIkSSIYmi7B" +
           "pAdW2wQq7ZfoeITtav+vuBzTPjwWCIBjl/rLWoaK6FRlkegp4WR2a/v0pdSN" +
           "oJPmlt2Q0CKJ2CdEvCc0bUWBABe9kJ1lxgu8PQp1C4hW0dz/QveeY40FkCja" +
           "WCH4i5FG5wbWmFvpXRzPBEg3NHVm7PDgy+uDKJiPkEw/WCpn7H0M1xz8avJX" +
           "xmxyQ0d/un/59EHVrZE8yLVKdyYnK71Gvyd1VSAigJkrfk0Dvpq6drApiAqh" +
           "ngHDKDiOwUO9/4y8Emy14YzZUgQGp1U9g2W2ZWNQOR3R1TF3hYd4ARuqzGiz" +
           "ePgU5Ej4VL929uvPf36Me9IGzZDnGuontNVTqExYiJdkpRvenTohQPfdmb5X" +
           "T909+jyPLVCsnO3AJjbGoEAhOuDBV67v++b72+duBd18oHBTZYdkSchxWyr/" +
           "gV8Anr/Zw6qNLbA3YG7MqvQGp9Q1dvJqVzcoehmAhyVH04CSUUUpLeEhmbBk" +
           "/DO0quXqL8fDZrhlWLGzZd1/C3DXl2xFh27s/q2eiwkI7NJx/eeSmUhW7Upu" +
           "03U8zvTIHf5i2euf4LOAiYBDhjRBOLQg7g/EAxjlvljDx4hvr4UNyw1vjueX" +
           "kac5SAknbt2bP3jv/WmubX534Y17D9ZazSwyowCHhZA1MIhz3my3WmPjwhzo" +
           "sNhf9Z3YGAFhj09tT4blqQdwbAKOFeDeNXp1gJlcXipZ1EUl337wYc2emwUo" +
           "2IHKZRWLHZgXHCqDTCfGCCBUTntmC+K/MQbCYe4PNMNDZhbVOljTPDfWdLAO" +
           "wi3X2j965aEjP/4+w1McZWa5OH38iejFN+piT9/h/G65M+763EzohW7L5d1w" +
           "IfNrsLH4oyAqSaCwYLVyg1jOskpLQPti2P0dtHt5+/mtiHnvtjpwttQPNZ5j" +
           "/UDjQj7MGTWbl/uyogxZzl8P2bDCetd5syKA+GQLZ2ng40o2rDZjwqaP5hx5" +
           "QWTdqkzOEutd7ZFHUSGm1Oz7Fj3sJmozkY+NG9jQZh6yaba0Mbca2BBzVAmw" +
           "vRIr0e13wKOKJ7UQS/5lc7VfvHU8d+TkpNh7vsVskqryW5p26Njf+vKvzyJn" +
           "fvh0lvu22GqfvQdSFNhqe6F2Li+AVrUzWnez3RQuTYZKF08OfMXvI6clLAO4" +
           "T2dl2Rt8z7xY00la4klQZqaCxl+DFM3zKEFRqT3lOg6YVLsoCopcVEKzdQ/z" +
           "8mfZGjGzNRfId6wTwaqHRNAfi5V5dc4/ciz7e7LmZ05KuDzZvf3A9Kbz5u0H" +
           "n0cTE7wphh7fvGOd9mHFnNJsWcWdzQ8WXClbFbRQOe/29em2fPbrpT2jUX4h" +
           "TLy3+J3Nb07e5rfiv7780559DgAA");
    }
    
    private void aliasFlowTest() {
        TelephonyManager mgr = (TelephonyManager)
                                 this.getSystemService(TELEPHONY_SERVICE);
        String deviceId = mgr.getDeviceId();
        A b;
        A q;
        A y;
        B a;
        B p;
        B x;
        a = new B();
        p = new B();
        b = new A();
        q = new A();
        if (Math.random() < 0.5) {
            x = a;
            y = b;
        } else {
            x = p;
            y = q;
        }
        x.attr = y;
        q.b = deviceId;
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("+49 1234", null, a.attr.b, null, null);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) { return true; }
        return super.onOptionsItemSelected(item);
    }
    
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment() { super(); }
        
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container,
                                             false);
            return rootView;
        }
        
        public static final String jlc$CompilerVersion$jl7 = "2.7.0";
        public static final long jlc$SourceLastModified$jl7 = 1452579402000L;
        public static final String jlc$ClassType$jl7 =
          ("H4sIAAAAAAAAAK1XW2wUVRg+u73QltLtBUot0HIpKIXMWgUTLSKllF7Y0obS" +
           "JtaVcjpzdjt0dmY4c7bdFlEgMfBEiALiA32CGA0CMRJ9wdSYCARDgiHeRX3z" +
           "RkJf8AFN/M+ZmZ3d6VZj4iZ75sw5//+f//qdfy7cQwUWRetMQ5uIawaTSIpJ" +
           "+7SNEpswiSV1RTb2YmoRpVXDlrUb1obklZdDDx6eGCkPosJBVIV13WCYqYZu" +
           "7SKWoY0RJYJC3mqbRhIWQ+WRfXgMh5NM1cIR1WLNETQ/g5WhhoirQhhUCIMK" +
           "YaFCuMWjAqYFRE8mWjkH1pm1H72MAhFUaMpcPYZWZAsxMcUJR0yvsAAkFPH3" +
           "ATBKMKcoWp623bZ5lsGn1oVPvrGn/L08FBpEIVXv4+rIoASDQwZRaYIkhgm1" +
           "WhSFKIOoQidE6SNUxZo6KfQeRJWWGtcxS1KSdhJfTJqEijM9z5XK3DaalJlB" +
           "0+bFVKIp7ltBTMNxsLXas9W2cDtfBwNLVFCMxrBMXJb8UVVXGKr3c6RtbNgB" +
           "BMA6L0HYiJE+Kl/HsIAq7dhpWI+H+xhV9TiQFhhJOIWh2jmFcl+bWB7FcTLE" +
           "UI2frtfeAqpi4QjOwtAiP5mQBFGq9UUpIz73dm46fkDv0INCZ4XIGte/CJjq" +
           "fEy7SIxQosvEZixtjJzG1VePBREC4kU+Ypvmg5dmtqyvm75u0yzJQdMzvI/I" +
           "bEg+N1x2e2nr2qfzuBpFpmGpPPhZlov073V2mlMmVF51WiLflNzN6V2fPn/o" +
           "HfJbEJV0okLZ0JIJyKMK2UiYqkZoO9EJxYwonaiY6Eqr2O9E82AeUXVir/bE" +
           "YhZhnShfE0uFhngHF8VABHfRPJiresxw5yZmI2KeMhFCIfijhfCPIVT8k/P8" +
           "jqEdbc9E+y1I+Gikoyu6jVijzDCj3YTGSVMUm2bUonI0gVU9ytMmqpAokS2T" +
           "qjDphtUWmaljKpuQ+K75/4pLce3LxwMBcOxSf1lrUBEdhqYQOiSfTG5tm7k4" +
           "dDOYTnPHbobWK0RyT5AyT2gQEkaEhO0UxxMEghsIiMMW8tPtCIL/R6GSAeNK" +
           "1/a92LX32Mo8SB1zPB88yEnDc0Ntq1f7nQLhZEhANH1m/PDAK48HUTAbM7nG" +
           "sFTC2Xs50qURrcFfK7nkho7+/ODS6YOGVzVZIOwU82xOXowr/b6lhkwUgDdP" +
           "fONyfGXo6sGGIMqHCgdUY+BKDhh1/jOyirLZBThuSwEYHDNoAmt8y0WlEjZC" +
           "jXFvRQS9TMwrwMfFPG2Xwn8EoZI1zrOK71aZfFxoJwkPms8KAaDP9plnv7r1" +
           "y5PC3S7WhjJurz7CmjPqmwsLiUqu8HJgNyUE6L4/0/v6qXtHXxAJABSrch3Y" +
           "wMdWqGsIIbj51ev7v/7h7rk7QS9pGFxwyWFNlVNpI4PcyCLHuErnWZphJJy2" +
           "xtMH8EEDjOJZ09CvJwxFjal4WCM8S/8MrW668vvxcjsPNFhx02j9vwvw1h/Z" +
           "ig7d3PNHnRATkPn95PnMI7NBr8qT3EIpnuB6pA5/vuzNa/gswCdAlqVOEoFC" +
           "SPgAiaCFhf2NYpR8e018qLcykz+7vjL6iCH5xJ37CwbufzQjtM1uRDJj3Y3N" +
           "Zju9+LA8BeIX+yu9A1sjQLdheme0XJt+CBIHQaIMt6/VQwEqUlmZ4VAXzPvm" +
           "40+q997OQ8HtqEQzsLIdiyJDxZDdxOIokzKf24LEb5xHulyYimYZbydFjfMm" +
           "XlaIsYEPj4r1IJ8+BnlkidbFy6MAZypzsP1b53krM4+yhFO0bK5rWLQQ546c" +
           "nFJ6zjfZl2Vl9tXWBp3bu1/89Zl05scbOXC30GmjvAM5WjbOjZbdolfxEOfa" +
           "kV9rd28e2fsfgLLeZ41f5NvdF260r5FfC6K8NEbO6qKymZoz7YJDKYG2T+ce" +
           "4islIpuWpf3PXY9q4a9B/Q44z67ZYJUzqgER1RygwIVsc56b/cH0yidPSMkT" +
           "74sYWoJ1hRqqIo2pZFyK4Ano8Dp1QEDmRAVoqrNoBmBop0bSdLcr3G3DkrYm" +
           "dUUjQv/uf6jbfj60M1Rq6K2UwFlc6Cx56ePEzhN86LAN3+gUSWm6SAIud6Uo" +
           "O962Sj1jhPILPYslq65yVRZDVTnufFd8zVyNAqRtzaxvCrsPli9OhYoWT/V/" +
           "Ka7FdK9aDBdKLKlpGYmTmUSFJiUxVbir2IYjUzwAZednKMFQkTsVOg7bVDGG" +
           "gooQFU8Hqt51LLTepkGZNLZBgl5Lcm1MBWajivB6ZWpuF/qxYlVW7YqPMbfO" +
           "kvbn2JB8aapr54GZp87b1y18xk1OiuYdvkXsmz9dqyvmlObKKuxY+7DscvHq" +
           "oJNaZbbCXgVl6Faf+25rS5hM3EaTHy5+f9NbU3fFNfw3gekn0iUPAAA=");
    }
    
    public MainActivity() { super(); }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1452579402000L;
    public static final String jlc$ClassType$jl7 =
      ("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" +
       "zSPYHBSk3jIznEF+AsPtXuEOwfUCpNmSV3elZ1vfnfzlB8+6fhMv0mKL2bm5" +
       "Bz5Tzs8lI5Vsx6JiMkrjVrNSztXY3IievG2lXSRF7/uXZn//5OzZpKfjfkGq" +
       "SwCLBODr2PS5kN/hxWdTEJ8BlK0y4rFSVgZLjGMNUUFSEdJLBLUcuDMwbAMO" +
       "bnEdpibj9enrd5Y6qGJKYJ2Yq9R7nBSv37W8q0SNPrHC3ClsqCCr4dZDnV4D" +
       "Dm3mHjvfC/EbKy8PxrWgkMs64BmCytTy+tz1QhHLgxKFOo/JsNcPfP6AKels" +
       "ClKIWZSbF1fAZxobS5C1fsAM2jJTIbEkOOp5KnZ3g+XGLMtg1AzBs5d1Phw+" +
       "8UXcTC7cAc/d4Bv7vH7XF8UWmbR5/cbrxnbdImz7BStIAc6tgO+D2JwBcsv0" +
       "kEWyYWbIVImTp0Mof/IlQlkWpCl6S8BaaOOifxTcW7D63HyqfsP8sbdkoRzc" +
       "VBugDs0XDSNyiEQPlFqbs7wutWxwKxdbdnOCrIrcVSAZ+69SyIfdVY8JktQk" +
       "qwu2j/GNPsZw8bYtLpTSNxS4aSndsp47QLmvTDmxuMiQCLZeK5IjNURHxbkg" +
       "/5PxD9+i+6/MqHpp/tDh01fueMIt11WDzswgl/osqXMvBcEBvm1Zbj6v2r7d" +
       "V9c837DDz+MV14WYbO1L18M9BVvICnbmdxt+s+/X8+/IMv7/BOLYPywTAAA=");
}
