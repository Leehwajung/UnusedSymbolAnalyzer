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
        public static final long jlc$SourceLastModified$jl7 = 1452572502391L;
        public static final String jlc$ClassType$jl7 =
          ("H4sIAAAAAAAAAK1XfWwURRSf236XtndtoSBCP2jBtJA7QDDRIgK1pa0HbShg" +
           "rCfHdHeut+3e7rI71x7FKpAYCH8QogUxEf6C+BEQYiSaGEyNiUAwJhhi1ETw" +
           "D42IktB/MBEV38zu7d5tW9DES3Zmd+a9N+/zN+9O3UJ5poEW65qys1/RaJCk" +
           "aHBAWRmkO3ViBjvDK7uxYRKpRcGmuRnWouKCs/47dw/FAwLK70WVWFU1iqms" +
           "qeYmYmrKEJHCyO+utiokYVIUCA/gIRxKUlkJhWWTNofRjAxWihrCaRVCoEII" +
           "VAhxFUJrXSpgKiVqMtHCOLBKzR3oJeQLo3xdZOpRVJctRMcGTthiurkFIKGQ" +
           "fW8FozhzykC1ju2WzZMMPrw4NPb6tsD7Ocjfi/yy2sPUEUEJCof0opIESfQR" +
           "w1wrSUTqReUqIVIPMWSsyCNc715UYcr9KqZJgzhOYotJnRj8TNdzJSKzzUiK" +
           "VDMc82IyUaT0V15Mwf1ga5Vrq2VhG1sHA4tlUMyIYZGkWXIHZVWiqMbL4djY" +
           "8AwQAGtBgtC45hyVq2JYQBVW7BSs9od6qCGr/UCapyXhFIrmTiuU+VrH4iDu" +
           "J1GK5njpuq0toCrijmAsFM3yknFJEKW5nihlxOfWxlUHd6ntqsB1loioMP0L" +
           "ganaw7SJxIhBVJFYjCVN4SO46vx+ASEgnuUhtmg+fHFizZLq8YsWzcNT0HT1" +
           "DRCRRsUTfWVX5rU0Pp7D1CjUNVNmwc+ynKd/t73TnNKh8qociWwzmN4c3/T5" +
           "c7vfJb8KqLgD5YuakkxAHpWLWkKXFWKsJyoxMCVSByoiqtTC9ztQAbyHZZVY" +
           "q12xmEloB8pV+FK+xr/BRTEQwVxUAO+yGtPS7zqmcf6e0hFChfCgUnhCCAk3" +
           "7fknisKtT0S2mJDwkXB7Z+RpMkQUDeIXeVYzBnsg4CTSCekSad2RBC27DW0g" +
           "QolJTT7GiaJokXY2Lg+yrNL/Z3kppn9g2OcD187zFrYCwto1RSJGVBxLrmud" +
           "eC96WXAS3baconJLXkOHCk7meYZ8Pi5xJjvCChS4eRAKFqCspLHnhc7t+xfk" +
           "QIbow7ngKEYamh5RW9wS7+BAJkKeofGjw3u2vrxUQEI2NDK1YKmYsXczQHOA" +
           "q8FbElPJ9e+7cefMkVHNLY4srLVrdjInq7kFXgcamkgkQDFXfFMtPhc9P9og" +
           "oFwoZAAviiHZABeqvWdk1V5zGseYLXlgcEwzElhhW2nwKaZxQxt2V3hky/h7" +
           "Ofi4iGVnJTxLEcqZYc8+tlups3GmlQksaB4rOE4+2aMf++bLXx7l7k5Dqj/j" +
           "kuohtDmjjJkwPy/YcjcHNhuEAN33R7tfO3xr3/M8AYCifqoDG9jYAuULIQQ3" +
           "v3Jxx7fXr524KrhJQ+EeS/YpsphyjBSQXYfMOGTNwh8ZRsJpi1x9AAYUgCKW" +
           "NQ1b1IQmyTEZ9ymEZemf/oXLzv12MGDlgQIr6TRa8mAB7vpD69Duy9t+r+Zi" +
           "fCK7hlyfuWQWtlW6ktcaBt7J9Ejt+Wr+GxfwMUBJQCZTHiEcbBD3AeJBC3H7" +
           "m/gY9OwtY0ONmZn82fWV0S5ExUNXb5duvf3JBNc2u9/IjPUGrDdb6cWG2hSI" +
           "n+2t9HZsxoFuxfjGSEAZvwsSe0GiCJes2WUAoqSyMsOmziv47tPPqrZfyUFC" +
           "GypWNCy1YV5kqAiym5hxAKOU/tQaxH/DLNIBbiqaZLyVFHPsL/5Rx4aFTrL4" +
           "2E6BjdM/2vO1zGTJkmCg+dNdqbwdOLF37LjUdXKZdfFVZF9TrdCFnf76ry+C" +
           "R3+4NAWC5tstkXsgg8Sm6SFxA+87XFi5sPfm3M2r49v/AxrWeKzxinxnw6lL" +
           "6xeJrwooxwHCSR1RNlNzpl1wqEGghVOZh9hKMU+Z+Y7/2VXJX1ZAsT5iz/WT" +
           "EWmK0Dl1zliq7XmON3RTV0TnffbCbGilKJf1dRCBxvu0+YacAKQbsluj0GjF" +
           "9cE3b5y2ou/tozzEZP/YgXvBg2NCRrNZP6nfy+SxGk6uY6nlhXvw88HzN3uY" +
           "AWyBzdB/tthdT63T9ug6S+C6+6nFj2j7+czox2+P7hNsh6ymKEe2/zgsZ0Ob" +
           "VUor/10NUujGnKaAb8+CZLfaBT39HeAwwLrloNUapnyTa5cfXvGgwzOKtT4r" +
           "dPyfTTrRk9Z/m6h45njnxl0Tj520LjX4TzQywjthaOyt+9UplrpppaVl5bc3" +
           "3i07W7Qw7bkyS2E3hTN0q5n6BmlN6JRj/shHsz9Y9dbxa/yy+wdwC0DNcg4A" +
           "AA==");
    }
    
    public enum Em {
        a,
         b,
         c;
         
        
        private Em() {
            
        }
        
        public static final String jlc$CompilerVersion$jl7 = "2.7.0";
        public static final long jlc$SourceLastModified$jl7 = 1452572502391L;
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
           "2CR/L+uEkEb4J6A2SRISycHzbngOMJJO3ZPdb0LAZ9P9g9kH6BRVNPBf9uua" +
           "cTgDDqfZQQiXbOpICaQcMbRDWUZNZvJxkiqKlu3HcVcco0r/P/Mro/xt06EQ" +
           "mHZdMLEVYNavKRI1cuLpUk/q5ou518JOoNuaM9Jk8etKFUkoxDmtRNaWg8C8" +
           "hyFRAcJatme+OXhwdnMEIkOfrgMD4dZEbSTtdVN7gAOYCPFF5s9Mnxh79Ath" +
           "EvZDIooDU81IPoJA5gBWVzAVqvGNnXr3w/PPHNPcpPBhrJ2rCykx1zYHDWdo" +
           "IpUAvVz2OzqFC7mXj3WFSR0kMIAWEyDIAA82BM/w5Vyygl+oSz0oXNCMoqDg" +
           "UgV0mtmkoU27M9yjrTi0W85FfwQE5ND35Yz+3Nuvv3cnt2QFJWOeeydDWdKT" +
           "mcgsxnNwheveUYNS2PfHMyPfe/r6qQe5b2HHlmoHduHYCxkJ3gELfuvikSvv" +
           "XD37VtiNB0YadEOegkQtc2VW/Af+QvD/Mf5jfuEEPgFle+3c7nSSW8ejt7nC" +
           "QZorADUYHV371aImyQVZyCsUo/Gj2NadF/76RJvlbwVmKuFyx9IM3PnP9JDH" +
           "XnvoHxs4m5CI14xrQHebhV0dLuduwxCOohzlE2+u/8GrwnOAgoA8pjxDOZgQ" +
           "bhDCPZjgttjBx3hgbScOG01vkPvzyFMO5MQn37qxfOzGL29yaf31hNfxQ4Ke" +
           "tMLI8gIc1kbsAUHta5UnrnboOK4sgwy3BdO+XzAngdkX5/dm25T5W3DsOBwr" +
           "wk1rDhsAK2VfLNm76xv+8Ktfrz74RoSE+0izoglSn8AzjjRBqFNzEhCprH/l" +
           "fsL/phsr0pXJAgtZUbSG/4qAgFtrGCkFRZKbq637/3b54Eev/B3EHSQNmiHJ" +
           "qqCAqNtrQ1UfVhwuhzX/GlbyJ//yzwV25iBV5aIN0I8nzj27tve+a5zeRQuk" +
           "3lBeCNRQnbm0u14ofhDeHP1NmDSMkzbRLv3GBKWEiToO5Y5ZqQehPPSt+0sX" +
           "655OOmi4LohUnmODOOVeEPCOu/G9ORBTeFcSQAxyDzzG7Od+b0wRwl+6OUkn" +
           "H7fgsI17tI5BJVvKKzKkXdTkRSYDMdBbjNRh4csP/BwjIYEjoQWHOO7CoccK" +
           "j93VQqnyx3ckHZHrcS5qi3rAfn6jisjpGiLjawqHPhz24NDvSJmvJuXQ0lKG" +
           "AlLySqTJli5rPx+sImXm00gpVpNydGkpw+Xqp0X8p9kHeTKXILasr1XP8lr8" +
           "7MnTc9Lw8zutqrPdXyNidv/k9//+XfzMny5VKV+idj/iHhiG83bUTvYhXvS7" +
           "GffqyffXjt43efB/KEk2BrQJsvzx0LlLe7aJT4VJxMm/Be2Inyjpz7pmg0L/" +
           "pI76cm+9tyz4JM7Y43GGewGF7OoNf6+CXpVDOGJG3Gp3OJG8yK1VxAHgpmEK" +
           "YWe4wAXSFyGw1vJLih+MXPAu9JHyFK2qh/eEqUXW+HAEeHFxzUUuEogOfrNb" +
           "vdDcD7e8/ujclj/ze69RNgEwu42JKs2Zh+bGuXeuvbl8/Yu8UKzLC6blvmBX" +
           "u7Bp9fWiXOIWj7l0XSeLGfh4mZFwqlhxadQq6fXFEyFTypvM01g+Ls9d/u0H" +
           "sRNWFvqvS/5twSYN0l15O7JrGev6Lk8gR+dGuFNM3MlIZ+3vFJyXVa0sc2tG" +
           "Ur1mXOnebggKcf4ZRNfLFbVb3UjGdZydBRNsWsIEOXGgmMtcuHJqN4eX2JQM" +
           "FTOVRu0PJ/6i0G2Ikr6PKVWNlBPfPf/4xU3vj3XwLtmyB4p1Z9ny5pdswA1x" +
           "wA0Tq6mqFZ62RLyGzYmPPPvx5feOXb0UIVEIKAQZwYAOGVrweK2PS14GXaPw" +
           "9gBQAfK0WtSQ+9yttvvanVmnI2Lk87V447ezYOOEn2cUbZoaPVpJlXj9E4C5" +
           "kq57V63A/9SBcBzK/09gO0f1yt3WziM+ED7eRbhnOnrT3ZlMbvTASCo31r1v" +
           "oLsnzZFqVofFUIrLfBKHb3MlZq3ow/E7tVyN00/xwVfqQuHLkz44GfJfqs7l" +
           "3b7I5e2toPG1m1c3vHgo+xq9YPwOlaxPiDnx/Nzg3odv7n7eajTB1DMzdoA0" +
           "WO2scy1uqsmtwivav/1W60tNW8M2bvka3UDJsLF6I5cq6oy3XjO/uO1n9/5o" +
           "7ipvQP8LvHQA19kVAAA=");
    }
    
    public Hello2() { super(); }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1452572502391L;
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
    public static final long jlc$SourceLastModified$jl7 = 1452572502391L;
    public static final String jlc$ClassType$jl7 =
      ("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" +
       "9hYAAA==");
}

class OuterClass {
    public OuterClass() { super(); }
    
    public int meth() { return 1; }
    
    public static final String jlc$CompilerVersion$jl7 = "2.7.0";
    public static final long jlc$SourceLastModified$jl7 = 1452572502391L;
    public static final String jlc$ClassType$jl7 =
      ("H4sIAAAAAAAAAK1Xa2wUVRS+u90+Ld1tgYIIfUDBtOAuoDXRojxKS1u2dKWA" +
       "sa5sb2fudqednRlm7rZLsQomBuIPQrQgJsIviI+AECPRxGBqTASCMcEQoyaC" +
       "/8QHCf2DP1Dx3DuzO7OzLWjiJntn5s65557Hd7575tRNVGjoaLmmyrsHZZUG" +
       "SZoGh+TmIN2tESPYFW6OYN0gYquMDWMbzMWExWf9t+8cSgS8qKgPzcaKolJM" +
       "JVUxthJDlUeIGEZ+e7ZNJkmDokB4CI/gUIpKcigsGbQljB5wLKWoIZwxIQQm" +
       "hMCEEDchtN6WgkWziJJKtrIVWKHGLvQS8oRRkSYw8yiqz1WiYR0nLTUR7gFo" +
       "KGHPO8Apvjito7qs76bPeQ4fXh6aeHNn4MMC5O9DfknpZeYIYASFTfpQeZIk" +
       "B4hurBdFIvahSoUQsZfoEpalMW53H6oypEEF05ROskFikymN6HxPO3LlAvNN" +
       "TwlU1bPuxSUii5mnwriMB8HXattX08N2Ng8OlklgmB7HAsks8Q1LikhRrXtF" +
       "1seGzSAAS4uThCbU7FY+BcMEqjJzJ2NlMNRLdUkZBNFCNQW7ULRgRqUs1hoW" +
       "hvEgiVE03y0XMV+BVCkPBFtC0Vy3GNcEWVrgypIjPze3rDm4R+lQvNxmkQgy" +
       "s78EFtW4Fm0lcaITRSDmwvKm8BFcff6AFyEQnusSNmU+fnFq3YqayYumzEPT" +
       "yPQMDBGBxoQTAxVXFrY2PlHAzCjRVENiyc/xnMM/Yr1pSWtQedVZjexlMPNy" +
       "cuuXz+19n/zmRWWdqEhQ5VQScFQpqElNkom+iShEx5SInaiUKGIrf9+JiuE+" +
       "LCnEnO2Jxw1CO5FP5lNFKn+GEMVBBQtRMdxLSlzN3GuYJvh9WkPWrxD+EYR8" +
       "zdZ1JUXhtiej2w0AfDTc0RXdSEaIrEL+os+q+nAvJJxEuwAu0bZdKbAyoqtD" +
       "UUoMavAxQWRZjXawcXWQoUr7n/Wlmf2BUY8HQrvQXdgyKOtQZZHoMWEitaFt" +
       "6oPYZW8W6JbnFJX1MGhzgCGPh6uaw3SbGYL4DkOlAoeVN/a+0NV/YHEBQEMb" +
       "9UGEmGhoZipttWu7kzOYAABDk0dH9+14eaUXeXM5kdkDU2VseYQxWZaxGty1" +
       "MJ1e//4bt88cGVftqsghWatY81eyYlvsjpyuCkQE+rLVN9Xhc7Hz4w1e5IMK" +
       "BtaiGFAGhFDj3iOn6FoyBMZ8KQSH46qexDJ7lWGdMprQ1VF7hqe0gt9XQoxL" +
       "GCyr4P8MwHG7dd3M3s7W2DjHhABLmssLTpBP9WrHvvv6l0d5uDNc6necTr2E" +
       "tjjqlynz80qttDGwTScE5H48Gnnj8M39z3MAgMSS6TZsYGMr1C2kEML86sVd" +
       "31+/duKq1wYNhQMsNSBLQjrrpIc5WWw512VdNzqchN2W2fZA/cvAQQw1DduV" +
       "pCpKcQkPyISh9E//0lXnfj8YMHEgw0wGRivur8Cef3AD2nt55x81XI1HYOeP" +
       "HTNbzCS12bbm9bqOdzM70vu+WfTWBXwM6BEoyZDGiMkyPAaIJy3E/W/iY9D1" +
       "bhUbag0n+HPry9EnxIRDV2/N2nHrsylubW6j4cx1N9ZaTHixoS4N6ue5K70D" +
       "GwmQe2xySzQgT94BjX2gUYDT1ejRgUrSOciwpAuLf/j8i+r+KwXI247KZBWL" +
       "7ZgXGSoFdBMjASyU1tauM0l2lGE6wF1Fec6boJhvPfGHej42sOFh53wlcvw4" +
       "W2euTuTkqNPRopkOVt4UnHhl4rjYc3KVefxV5R5WbdCLnf72r6+CR3+6NA2P" +
       "llJVe0RmfO7Yk1Fk08wU2c0bEJtmLrzy64JtTyf6/wM71roccqt8r/vUpU3L" +
       "hNe9qCBLjHmtUe6iFqdrsKlOoJdTWJDYTBmH0KJsCsqRlU5gJ59qXYfzGYqn" +
       "kg1L8+ueLYlb13539qavkM33eNfNhnaKfKzBgww03qPf16UkMN+I1SOFxquu" +
       "D79947QJAHdD5RImByZeuxs8OOF1dJ1L8ho/5xqz8+Q2zjKjcBd+Hvj/zf7M" +
       "ATbBrtCItlrtT122/9E0huH6e5nFt2j/+cz4p++O7/daAVlLUYFkfUGsZsMm" +
       "s4Sa/11N5jQJmsYF5sJXDicC1igHza4w7cmvXr5d1f22c1Tokpxk8Y+aDLRT" +
       "5mdNTDhzvGvLnqnHT5rHGnwOjY3xJhh6evOEzZZH/YzaMrqKOhrvVJwtXZqJ" +
       "VYVpsA1ah221058hbUmNctYf+2TeR2veOX6NH3f/AIhzUGltDgAA");
}
