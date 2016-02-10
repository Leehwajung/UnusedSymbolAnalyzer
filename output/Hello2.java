public class Hello2 {
    private int member;
    
    public static void main(String[] args) {
        int local;
        Box<String> asdf = new Box<String>();
        System.out.println("Hello world!");
        for (int i = 0; i < 10; i++) {  }
        Integer d = new Integer(1);
        OuterClass oc = new OuterClass() {
            @Override
            public int meth() {
                return 2;
            }
        };
    }
    
    public int method(String str, int ddd, long ll) {
        Box<String> bb = new Box<String>();
        bb.get();
        new InnerClass() {
            @Override
            public int meth() {
                return 1;
            }
        };
        return 2;
    }
    
    public <E> E m2(String str, int ddd) {
        E aa = null;
        return aa;
    }
    
    public <E> E elem(String str, int ddd) {
        E aa = null;
        return aa;
    }
    
    public class InnerClass {
        public InnerClass() { super(); }
        
        public int meth() { return 1; }
        
        public static final String jlc$CompilerVersion$jl7 = "2.7.0";
        public static final long jlc$SourceLastModified$jl7 = 1453812606087L;
        public static final String jlc$ClassType$jl7 =
          ("H4sIAAAAAAAAAK1XfWwURRSf236XtndtoSBCP2jBtJA7imCiRQTPlrYetKGA" +
           "sZ4c0925dtu93WV3rj2KVSAxEP8gRAtiIvwF8SMgxEg0MZgaE4FgTDDEqIng" +
           "HxoRJaH/YCIqvpnd273btqCJl+zM7sx7b97nb96dvInyTAMt1TVlZ7+i0SBJ" +
           "0eCgsipId+rEDHZGVnVjwyRSWMGmuRnWYuKiM/7bdw4OBASU34sqsapqFFNZ" +
           "U81NxNSUYSJFkN9dbVVIwqQoEBnEwziUpLISisgmbYmgWRmsFDVE0iqEQIUQ" +
           "qBDiKoTWuVTAVErUZCLMOLBKzR3oReSLoHxdZOpRVJctRMcGTthiurkFIKGQ" +
           "fW8FozhzykC1ju2WzVMMPrQ0NP76tsD7Ocjfi/yy2sPUEUEJCof0opIESfQR" +
           "w1wnSUTqReUqIVIPMWSsyKNc715UYcr9KqZJgzhOYotJnRj8TNdzJSKzzUiK" +
           "VDMc8+IyUaT0V15cwf1ga5Vrq2VhG1sHA4tlUMyIY5GkWXKHZFWiqMbL4djY" +
           "8DQQAGtBgtABzTkqV8WwgCqs2ClY7Q/1UENW+4E0T0vCKRTNn1Eo87WOxSHc" +
           "T2IUzfPSdVtbQFXEHcFYKJrjJeOSIErzPVHKiM/NjasP7FLbVYHrLBFRYfoX" +
           "AlO1h2kTiRODqCKxGEuaIodx1bn9AkJAPMdDbNF8+MLk2mXVExcsmgenoenq" +
           "GyQijYnH+8ouLwg3PprD1CjUNVNmwc+ynKd/t73TktKh8qociWwzmN6c2PT5" +
           "s7vfJb8KqLgD5YuakkxAHpWLWkKXFWKsJyoxMCVSByoiqhTm+x2oAN4jskqs" +
           "1a543CS0A+UqfClf49/gojiIYC4qgHdZjWvpdx3TAf6e0hFChfCgUnhCCAk3" +
           "7PknitpbH4tuMSHho5H2zuhTZJgoGsQv+oxmDPVAwEm0E9Il2rojCVp2G9pg" +
           "lBKTmnxsjrYTRdFWBFlG6f+jrBTTOzDi84FLF3gLWgFB7ZoiESMmjiefbJ18" +
           "L3ZJcBLctpiickteQ4cKzuX5hXw+LnE2O8IKELh3CAoVIKyksef5zu37F+VA" +
           "ZugjueAgRhqaGUnDbml3cAATIb/QxJGRPVtfWi4gIRsSmVqwVMzYuxmQOYDV" +
           "4C2F6eT6912/ffrwmOYWRRbG2rU6lZPV2iKvAw1NJBKglyu+qRafjZ0baxBQ" +
           "LhQwgBbFkGSAB9XeM7JqriWNX8yWPDA4rhkJrLCtNOgU0wFDG3FXeGTL+Hs5" +
           "+LiIZWUlPMsRypllzz62W6mzcbaVCSxoHis4Pj7eox/95stfHubuTkOpP+Ny" +
           "6iG0JaN8mTA/L9RyNwc2G4QA3fdHul87dHPfczwBgKJ+ugMb2BiGsoUQgptf" +
           "vrDj22tXj18R3KShcH8l+xRZTDlGCsiuP2Ycsmbhjwwj4bQlrj5Q/gpAEMua" +
           "hi1qQpPkuIz7FMKy9E//4uazvx0IWHmgwEo6jZbdX4C7/sCTaPelbb9XczE+" +
           "kV0/rs9cMgvTKl3J6wwD72R6pPZ8tfCN8/gooCMgkimPEg4yiPsA8aCFuP1N" +
           "fAx69prZUGNmJn92fWW0CTHx4JVbpVtvfTLJtc3uMzJjvQHrLVZ6saE2BeLn" +
           "eiu9HZsDQLdyYmM0oEzcAYm9IFGEy9XsMgBRUlmZYVPnFXz36WdV2y/nIKEN" +
           "FSsaltowLzJUBNlNzAEAo5T+xFrEfyMs0gFuKppivJUU8+wv/lHHhsVOsvjY" +
           "ToGNzz/a89XMZMmSYKCFM12lvA04vnf8mNR1otm68Cqyr6dW6L5Off3XF8Ej" +
           "P1ycBkHz7VbIPZBBYtPMkLiB9xsurJzfe2P+5jUD2/8DGtZ4rPGKfGfDyYvr" +
           "l4ivCijHAcIpnVA2U0umXXCoQaB1U5mH2EoxT5mFjv/ZFclfVkKxPmTP9VMR" +
           "aZrQOXXOWKrteZ43dNNXROc99iJsaKUol/VzEIHGe7T3hpwApBu2W6LQWMW1" +
           "oTevn7Ki7+2fPMRk//grd4MHxoWMJrN+Sp+XyWM1mlzHUssLd+Hng+dv9jAD" +
           "2AKboe8M291OrdPu6DpL4Lp7qcWPaPv59NjHb4/tE2yHrKEoR7b/MKxgQ5tV" +
           "Sqv+XQ1S6MKcpoBvz4Fkt9oFPf0d4DDAuuSg1RKmfFNrlx9ecb/DM4q1Pit0" +
           "/B9NOtGT1n+amHj6WOfGXZOPnLAuNfgvNDrKO2Bo6K371SmWuhmlpWXltzfe" +
           "KTtTtDjtuTJLYTeFM3Srmf4GaU3olGP+6EdzP1j91rGr/LL7BzXs0e1qDgAA");
    }
    
    public enum Em {
        a,
         b,
         c;
         
        
        private Em() {
            
        }
        
        public static final String jlc$CompilerVersion$jl7 = "2.7.0";
        public static final long jlc$SourceLastModified$jl7 = 1453812606087L;
        public static final String jlc$ClassType$jl7 =
          ("H4sIAAAAAAAAAK1YfWwcRxWfu7PPH3F8jp2kIeTDSZyIpOWOpDSovVJqu+fY" +
           "5hybnGOIe/Sytztnb7K3u9mdsy9ukzaRIBZSS1XSEqTWf6UgqtBUiAj+KTJC" +
           "tAkllVpVqEEiBf5qGyIliBZESuG92b398p1dKix5dm9m3pv3+Zv39tx1Um8a" +
           "5HZdU45OKBqL0zKLH1LuirOjOjXjg+m7RgTDpFKvIpjmKMzlxM0vxT689eRk" +
           "W5hEx0mHoKoaE5isqeY+amrKFJXSJObOphRaNBlpSx8SpoREiclKIi2bLJkm" +
           "yzykjHSlKyIkQIQEiJDgIiS63V1AtJyqpWIvUggqM4+Q4ySUJlFdRPEY2eRn" +
           "oguGULTZjHANgEMj/h4DpThx2SCdju6WzgsUfvr2xOnvP9T20wiJjZOYrGZQ" +
           "HBGEYHDIOGkp0mKeGma3JFFpnKxQKZUy1JAFRZ7hco+TdlOeUAVWMqhjJJws" +
           "6dTgZ7qWaxFRN6MkMs1w1CvIVJEqv+oLijABuq52dbU07MN5ULBZBsGMgiDS" +
           "CkndYVmVGNkYpHB07PoqbADShiJlk5pzVJ0qwARpt3ynCOpEIsMMWZ2ArfVa" +
           "CU5hZG1NpmhrXRAPCxM0x8ia4L4Rawl2NXFDIAkjq4LbOCfw0tqAlzz+ub73" +
           "3iceVvvVMJdZoqKC8jcC0YYA0T5aoAZVRWoRtuxIPyOsfnk2TAhsXhXYbO35" +
           "+SM3779jw/xFa89nq+wZzh+iIsuJZ/Otb6zr3X53BMVo1DVTRuf7NOfhP2Kv" +
           "JMs6ZN5qhyMuxiuL8/teOfDYC/RamDQPkKioKaUixNEKUSvqskKNPVSlhsCo" +
           "NECaqCr18vUB0gDvaVml1uxwoWBSNkDqFD4V1fhvMFEBWKCJGuBdVgta5V0X" +
           "2CR/L+uEkEb4J6A2SRISycHzbngOMNKfuie734SAz6b7B7MP0CmqaOC/7Nc1" +
           "43AGHE6zgxAu2dSREkg5YmiHsoyazOTjzmw/VRRtVxwjSv8/8iqj3G3ToRCY" +
           "dF0woRVg1K8pEjVy4ulST+rmi7nXwk6A2xoz0mTx60oVSSjEOa1E1pZjwKyH" +
           "IUEBulq2Z745eHB2cwQiQp+uA8Pg1kRtBO11U3qAA5cIcUXmz0yfGHv0C2ES" +
           "9kMhigNTzUg+ggDmAFVXMAWq8Y2devfD888c09xk8GGrnaMLKTHHNgcNZ2gi" +
           "lQC1XPY7OoULuZePdYVJHSQugBUTILgABzYEz/DlWrKCW6hLPShc0IyioOBS" +
           "BWya2aShTbsz3KOtOLRbzkV/BATkkPfljP7c26+/dye3ZAUdY577JkNZ0pOR" +
           "yCzGc2+F695Rg1LY98czI997+vqpB7lvYceWagd24dgLmQjeAQt+6+KRK+9c" +
           "PftW2I0HRhp0Q56CBC1zZVb8B/5C8P8x/mNe4QQ+AV177ZzudJJax6O3ucJB" +
           "eisAMRgdXfvVoibJBVnIKxSj8aPY1p0X/vpEm+VvBWYq4XLH0gzc+c/0kMde" +
           "e+gfGzibkIjXi2tAd5uFWR0u527DEI6iHOUTb67/wavCc4B+gDimPEM5iBBu" +
           "EMI9mOC22MHHeGBtJw4bTW+Q+/PIUwbkxCffurF87MYvb3Jp/XWE1/FDgp60" +
           "wsjyAhzWRuwBwexrlSeudug4riyDDLcF075fMCeB2Rfn92bblPlbcOw4HCvC" +
           "DWsOGwArZV8s2bvrG/7wq1+vPvhGhIT7SLOiCVKfwDOONEGoU3MSEKmsf+V+" +
           "wv+mGyvSlckCC1lRtIb/ioCAW2sYKQXFkZurrfv/dvngR6/8HcQdJA2aIcmq" +
           "oICo22tDVR9WGi6HNf8aVvIn//LPBXbmIFXlgg3QjyfOPbu2975rnN5FC6Te" +
           "UF4I1FCVubS7Xih+EN4c/U2YNIyTNtEu+cYEpYSJOg5ljlmpA6Es9K37Sxbr" +
           "fk46aLguiFSeY4M45V4Q8I678b05EFN4RxJADHIPPMbs535vTBHCX7o5SScf" +
           "t+CwjXu0jkEFW8orMqRd1OTFJQMx0FuM1GHByw/8HCMhgSOhBYc47sKhxwqP" +
           "3dVCqfLHdyQdketxLmqLesB+fqOKyOkaIuNrCoc+HPbg0O9Ima8m5dDSUoYC" +
           "UvIKpMmWLms/H6wiZebTSClWk3J0aSnD5eqnRfyn2Qd5MpcgtqyvVcfyGvzs" +
           "ydNz0vDzO61qs91fG2J2/+T3//5d/MyfLlUpX6J2H+IeGIbzdtRO9iFe7LsZ" +
           "9+rJ99eO3jd58H8oSTYGtAmy/PHQuUt7tolPhUnEyb8FbYifKOnPumaDQt+k" +
           "jvpyb723LPgkztjjcYZ7AYXs6g1/r4IelUM4YkbcanM4kbzIrVXEAeCmYQph" +
           "Z7jABdIXIbDW8kuKH4xc8C70j/IUraqH94SpRdb4cAR4cXHNRS4SiA5+s1s9" +
           "0NwPt7z+6NyWP/N7r1E2ATC7jYkqTZmH5sa5d669uXz9i7xQrMsLpuW+YDe7" +
           "sFn19aBc4haPuXRdJ4sZ+HiZkXCqWHFp1Crp9cUTIVPKm8zTUD4uz13+7Qex" +
           "E1YW+q9L/k3BJg3SXXk7smsZ6/ouTyBH50a4U0zcyUhn7e8TnJdVrSxza0ZS" +
           "vWZc6d5uCApx/vlD18sVtVvdSMZ1nJ0FE2xawgQ5caCYy1y4cmo3h5fYlAwV" +
           "M5VG7Q8m/qLQbYiSvo8oVY2UE989//jFTe+PdfDu2LIHinVn2fLml2zADXHA" +
           "DROrqaoVnrZEvIbNiY88+/Hl945dvRQhUQgoBBnBgM4YWu94rY9KXgZdo/D2" +
           "AFAB8rRa1JD73K22+9qdWacjYuTztXjjN7Ng44SfZRRtmho9WkmVeP0TgLmS" +
           "rntXrcD/1IFwHMr/T2A7R/XK3dbOIz4QPt5FuGc6etPdmUxu9MBIKjfWvW+g" +
           "uyfNkWpWh8VQist8EodvcyVmrejD8Tu1XI3TT/HBV+pC4cuTPjgZ8l+qzuXd" +
           "vsjl7a2g8bWbVze8eCj7Gr1g/A6VrE+HOfH83ODeh2/uft5qNMHUMzN2gDRY" +
           "7axzLW6qya3CK9q//VbrS01bwzZu+RrdQMmwsXojlyrqjLdeM7+47Wf3/mju" +
           "Km9A/wtnEScN0RUAAA==");
    }
    
    public Hello2() { super(); }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1453812606087L;
    public static final String jlc$ClassType$jl7 =
      ("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");
}

class Box2<E> {
    private E elem;
    
    public E get() { return elem; }
    
    public void set(E elem) { this.elem = elem; }
    
    public <T, S> boolean isEmpty(Box<T> e2, S ss) { return elem == null; }
    
    public Box2() { super(); }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1453812606087L;
    public static final String jlc$ClassType$jl7 =
      ("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");
}

class OuterClass {
    public OuterClass() { super(); }
    
    public int meth() { return 1; }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1453812606087L;
    public static final String jlc$ClassType$jl7 =
      ("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");
}
