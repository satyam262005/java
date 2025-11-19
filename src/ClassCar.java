//class Car4{
//    Car4(){
//        System.out.println("Hello");
//    }
//    Car4(String str){
//        System.out.println(str);
//    }
//
//    static void main() {
//        Car4 obj1=new Car4("hiiii");
//        Car4 obj=new Car4();
//    }
//}

class Car{
    int a;
    Car(int a){
        this.a=a;
            System.out.println(a);
    }
}
class Main{
    public static void main(String[] args){
        Car obj =new Car(5);

    }
}
