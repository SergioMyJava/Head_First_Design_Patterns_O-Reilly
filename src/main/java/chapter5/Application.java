package chapter5;

public class Application {

    public static void main(String[] args){


    }

    public static class SingltonOne{
        private static SingltonOne singltonOne;

        private SingltonOne(){}

        public static SingltonOne getSingltonOne() {
            if(singltonOne == null){
                singltonOne = new SingltonOne();
            }
            return singltonOne;
        }
    }

    public static class SingltonTwo{
        private static volatile SingltonTwo singltonTwo;

        private SingltonTwo(){}

        public static SingltonTwo getSingltonTwo(){
            if(singltonTwo == null){
                synchronized (SingltonTwo.class){
                    singltonTwo = new SingltonTwo();
                }
            }
        return singltonTwo;
        }
    }

    public static class SingltonThree{
        private static SingltonThree singltonThree;

        private SingltonThree(){}

        public synchronized static SingltonThree getSingltonThree(){
            if(singltonThree == null){
                singltonThree = new SingltonThree();
                }
            return singltonThree;
        }
    }
}
