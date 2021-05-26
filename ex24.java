package Exercises;

import java.io.*;
import java.util.*;
//In Main() method declare Dictionary PhoneBook for keeping pairs PersonName-PhoneNumber.
// 1) From file "phones.txt" read 9 pairs into PhoneBook. Write only PhoneNumbers into file "Phones.txt".
// 2) Find and print phone number by the given name (name input from console)
// 3) Change all phone numbers, which are in format 80######### into new format +380#########. The result write into file "New.txt"
public class ex24 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<String,Long> map=new HashMap<>();
        map.put("Yura1",80677767875L);
        map.put("Yura2",80677767865L);
        map.put("Yura3",80677768875L);
        map.put("Yura4",80679767875L);
        map.put("Yura5",80670767875L);
        map.put("Yura6",80676767875L);
        map.put("Yura7",80677867875L);
        map.put("Yura8",80677567875L);
        map.put("Yura9",80677067875L);

        FileOutputStream phone=new FileOutputStream("phones.txt" );
        ObjectOutputStream oos=new ObjectOutputStream(phone);
        oos.writeObject(map);
        oos.close();

        FileInputStream fileIn = new FileInputStream("phones.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Map<String, Long> PhoneBook = (HashMap) in.readObject();
        in.close();
        System.out.println(PhoneBook);

        List<Long> number =new ArrayList<>();
        for (Map.Entry<String,Long> entry:PhoneBook.entrySet()) {
            number.add(entry.getValue());
        }

        System.out.println(number);


        FileOutputStream fos=new FileOutputStream("Phones.txt");
        ObjectOutputStream oos2=new ObjectOutputStream(fos);
        oos2.writeObject(number);
        oos2.close();

        System.out.println("Веддіть ім'я користувача");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();


        for (Map.Entry<String,Long> entry:PhoneBook.entrySet()) {
            if (entry.getKey().equals(a)) {
                System.out.println(entry.getValue());
            }
        }
        List<String> newPhone=new ArrayList<>();
        for (Long b:number) {
            String ss="+3"+b;
            newPhone.add(ss);
        }
        System.out.println(newPhone);

        FileOutputStream fos2=new FileOutputStream("New.txt");
        ObjectOutputStream oos3=new ObjectOutputStream(fos2);
        oos3.writeObject(newPhone);
        oos3.close();
    }
}
