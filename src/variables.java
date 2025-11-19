public class variables {
//    static int a=6;
//    public static void main (String[] args){
//        System.out.println(a);
//    }
//}
static int a=5;
int b=0;
void FirstNRep(String str){
int [] freq = new int [256];
for (int i =0;i<str.length();i++){
freq[str.charAt(i)]++;
}
    for (int i =0;i<256;i++){
        if (freq[i]==1) {
            System.out.println((char) i + " : " + freq[i]);
        }}}
            void Sum (){
                System.out.println("hello");
            }
            public static void main(String[] args){

            variables obj=new variables();
            obj.FirstNRep("aabbcdd");
            }
        }
