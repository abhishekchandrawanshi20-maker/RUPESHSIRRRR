package Java;

// import java.util.ArrayList;

// class Main {
//     public static void main(String[] args) {
//      ArrayList<Integer> list = new ArrayList<>();
//         list.add(5);
//         list.add(10);
//         list.add(1,30);
//         System.out.println(list.get(1));
//     }
    
// }



// class Node{
//     int data;
//     Node next;

//     public Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// class Mylink{
//     Node head;
//     Node curr;
//     public void addTolast(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=curr=newNode;
//         }else{
//             curr.next=newNode;
//             curr=newNode;
//         }
//     }
// }



        //DATE:- 26/11/2025

        
//         import java.util.HashMap;
//         class Main{
//         public static void main(String[]agrs){
//         HashMap<Integer,Integer> map=new HashMap<>();
//         map.put(1,10);
//         map.put(2,20);
//         System.out.println(map.get(3));
//         System.out.println(map.containsKey(3));


//         for(int x :map.keySet()) {
//             System.out.println(map.get(x));
//         }
//     }
// }


// import java.util.HashMap;
//         class Main{
//         public static void main(String[]agrs){
//         HashMap<Integer,Integer> map=new HashMap<>();
//         map.put(1,10);
//         map.put(2,20);
//         System.out.println(map.get(3));
//         System.out.println(map.containsKey(3));
//         System.out.println(map.getOrDefault(3, null));
//         System.out.println(map.containsKey(3));

//         for(int x :map.keySet()) {
//             System.out.println(map.get(x));
//         }
//     }
// }


// import java.util.HashMap;
//         class Main{
//         public static void main(String[]agrs){
//         HashMap<Integer,Integer> map=new HashMap<>();
//             int arr[]={1,2,3,4,5,6,};
//             for(int x: arr){
//                 map.put(x, map.getOrDefault(x, 0)+1);
//             }
//             System.out.println(map);
//     }
// }


// import java.util.HashMap;
//         class Main{
//         public static void main(String[]agrs){
//             String str="abcdbaba";
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char ch : str.toCharArray()) {
//                 map.put(ch, map.getOrDefault(ch, 0)+1);
//             }
//             System.out.println(map);
            
//         }
           
//     }



// import java.util.HashMap;
//         class Main{
//         public static void main(String[]agrs){
//             String str="abcdbaba";
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char ch : str.toCharArray()) {
//                 map.put(ch, map.getOrDefault(ch, 0)+1);
//             }
//             // System.out.println(map);
//             for(char ch :str.toCharArray()) {
//                 if(map.get(ch)==1) {
//                     System.out.println(ch);
//                     break;
//                 }
//             }
//         }
           
//     }



import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int arr[] = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                System.out.println("Indices: " + map.get(diff) + ", " + i);
                System.out.println("Numbers: " + diff + ", " + arr[i]);
                break;
            }

            map.put(arr[i], i);
        }
    }
}