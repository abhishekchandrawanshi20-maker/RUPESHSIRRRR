package Java;

// public class lec19 {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//       int a=5;
//       int b=0;
//       int c=a/b;
//       System.out.println(c);
//    } 
// }





// public class lec19 {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        try{
//         // int a=5;
//         // int b=0;
//         // int c=a/b;
//         // int arr[]={1,23};
//         String str=null;
//         System.out.println(str);
//        }catch (NullPointerException e) {
//         System.out.println(e);
//        }finally{
//         System.out.println(" Gooddd byeee");
//        }
//        System.out.println("byeee!!");
//    } 
// }







// class lec19 {
//     public static void main(String[] args) {
//        try {
//         voteAge(15);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        try{
//         voteAge(19);
//        }catch (Exception e) {
//             System.out.println("app vote de sakte hai");
//        }
//     }
//     static void voteAge(int age) {
//         throw new IllegalArgumentException("app vote nhi de sakte");
//     }
// }




 public class lec19 {
    public static void main(String[] args) {
       try {
        riskyMethod() ;
        }catch (Exception e) {
            System.out.println("Main me handle hua");

        }
        System.out.println("Program continues...");
  }
  static void rikyMethod9() throws Exception {
    System.out.println("rislymethod start");
    int result=10/0;
    System.out.println("result:"+result);
  }
}