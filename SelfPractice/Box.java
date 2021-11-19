package SelfPractice;
 class Box {
    int height;
    int width;
    int length;

    Box(){
        System.out.println("CALLING CONSTRUCTOR");
        height = 5;
        width = 2;
        length = 9;

    }
     Box(int h,int w,int l){
         System.out.println("CALLING PARAMETERISED CONSTRUCTOR");
         height = h;
         width = w;
         length = l;

     }

    int volume() {
        return (height * width * length);
    }
        void setDimen(int h,int w,int l){
          this.height = h;
          width = w;
          length = l;
        }
    }

