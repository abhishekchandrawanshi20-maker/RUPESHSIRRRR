package Java.lec20;

// import java.io.File;

// public class hello {
//     //crud
//     public static void main(String[] args) {
//         File file = new File("Data.java");
//         try{
//             if(file.createNewFile()) {
//                 System.out.println("File createdddd"+file.getName());
//                 System.out.println("file createdddd"+ file.getAbsolutePath());

//             } else {
//                     System.out.println("File already existsssss.");
//             }
//         }   catch(Exception e) {
//             System.out.println(e);
//         }
    
//     }
// }







// import java.io.FileWriter;

// public class hello{
//      static    void   writeData(String data){
//         try {
//             FileWriter writer=new FileWriter("New.txt",true);
//             writer.write(data);
//             writer.close();
            
//         } catch (Exception e) {
//         }
   
//      }
//     // crud
//     public static void main(String[] args) {
//         writeData("hello old data  hiiiii");
        
//     }


// }

import java.io.File;

public class hello {
    static void  FileRead (){
 
    }
    
    
    
    
    static void FileDelete(){
        try{
            File file=new File("New.txt");
            if(file.delete() ) {
                System.out.println("file deleteddd");
            }else{
                System.out.println("noooooh!!");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
            

    }
     
}