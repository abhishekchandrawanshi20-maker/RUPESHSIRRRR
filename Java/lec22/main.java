
// import java.util.*;

// // class main {
// //     public static void main(String[] args) {
// //         ArrayList<Integer> list = new ArrayList<>();
// //         list.add(5);
// //         list.add(6);        
// //         list.add(7);
// //         list.add(8);
// //     List<Integer> res= list.stream().filter(n-> n%2!=0).toList();
// //     List<Integer> mapData= list.stream().map(n-> n*2).toList();   
// //      int data= list.stream().reduce(0,(a,b)-> a+b);

// //     System.out.println(res);
// //     System.out.println(mapData);    
// //     System.out.println(data);
// //     }
    
// // }





// class main {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(5);
//         list.add(6);        
//         list.add(7);
//         list.add(8);
//     List<Integer> res= list.stream().filter(n-> n>60).toList();
//     List<Integer> mapData= list.stream().map(n-> n*2).toList();   
//      int data= list.stream().reduce(0,(a,b)-> a+b);

//     List<Integer> skip= list.stream().skip(2).toList();
//     List<Integer> limit= list.stream().limit(2).toList();
//     List<Integer> sort= list.stream().sorted((a,b)->a-b).toList();
//     System.out.println(data);
//     // System.out.println(res);
//     // System.out.println(mapData);    
//     // System.out.println(data);
//     }
    
// }











import java.util.*;
public class main {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        List<Integer> res = list.stream().filter(n -> n % 2 != 0).toList();
        List<Integer> mapdata = list.stream().map(n -> n * 2).toList();
        int data = list.stream().reduce(0, (a, b) -> a + b);
        List<Integer> sortedList = list.stream().sorted().toList();
        List<Integer> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        List<Integer> skip= list.stream().skip(2).toList();
        List<Integer> limit= list.stream().limit(3).toList();
        List<Integer> sortedDescList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Sum of all elements: " + data);
        System.out.println("Sorted List (Ascending): " + sortedList);
        System.out.println("Sorted List (Descending): " + sortedDescList);
        System.out.println("Skipped first 2 elements: " + skip);
        System.out.println("Limited to first 3 elements: " + limit);
        System.out.println("Filtered List (Even Numbers): " + res);     
        System.out.println("Original List: " + list);
        System.out.println("Mapped List (Doubled Values): " + mapdata);
        System.out.println("Reversed List: " + reversedList);
            
       }
    }