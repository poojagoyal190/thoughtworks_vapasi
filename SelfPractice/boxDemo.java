package SelfPractice;

class boxDemo {

        public static void main(String[] args) {
            Box myBox1 = new Box();
            Box myBox2 = new Box();
            Box myBox3 = new Box();// DEFAULT CONSTRUCTOR
            Box myBox4 = new Box(4,5,3); //PARAMETERISED CONSTRUCTOR

            myBox2.setDimen(15,11,2); // parameterised method
            myBox1.height = 20;// passing values through object
            myBox1.width = 2;
            myBox1.length =10;

            int vol = myBox1.volume();
            System.out.println(vol);

            vol = myBox2.volume();
            System.out.println(vol);

            vol = myBox3.volume();
            System.out.println(vol);

            vol = myBox4.volume();
            System.out.println(vol);
        }

}
