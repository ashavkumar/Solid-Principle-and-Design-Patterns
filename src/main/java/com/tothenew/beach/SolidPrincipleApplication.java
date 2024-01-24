package com.tothenew.beach;

import com.tothenew.beach.designpattern.creational.builder.Phone;
import com.tothenew.beach.designpattern.creational.builder.PhoneBuilder;
import com.tothenew.beach.designpattern.creational.factory.OS;
import com.tothenew.beach.designpattern.creational.factory.OSFactory;
import com.tothenew.beach.designpattern.structural.adapter.AssignmentWork;
import com.tothenew.beach.designpattern.structural.adapter.Pen;
import com.tothenew.beach.designpattern.structural.adapter.PenAdapter;
import com.tothenew.beach.programmingpractice.Beach;
import com.tothenew.beach.solidprinciple.dip.BankCard;
import com.tothenew.beach.solidprinciple.dip.CreditCard;
import com.tothenew.beach.solidprinciple.dip.ShoppingMall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.expression.spel.ast.MethodReference;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class SolidPrincipleApplication {


    @Autowired
    @Qualifier("beachImpl1")
    public Beach beach;

    public static void m1() {
        System.out.println("hello Method reference.");
    }

    public static void main(String[] args) {
        SpringApplication.run(SolidPrincipleApplication.class, args);
        SolidPrincipleApplication solidPrincipleApplication = new SolidPrincipleApplication();
        solidPrincipleApplication.m1();
        //DebitCard debitCard=new DebitCard();
        //CreditCard creditCard=new CreditCard();
        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);

        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getInstance("Open");
        os.spec();

        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).getPhone();
        System.out.println(phone);

        AssignmentWork assignmentWork = new AssignmentWork();
        Pen pen = new PenAdapter();
        assignmentWork.setPen(pen);
        assignmentWork.writeAssignment("I'm bit tired to Write the Assignment.");

        List<String> listOfString = new ArrayList<>();
        listOfString.add("Kamlesh");
        listOfString.add("Suresh");
        listOfString.add("Mahesh");
        listOfString.add("Rahul");
        listOfString.add("Aayushi");

        //Enhanced For Loop
        for (String string : listOfString) {
            System.out.println(string);
        }

        //Iterator - Only Forward direction Moving
        Iterator<String> iterator = listOfString.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }

        //ListIterator - Both Forward and Backward direction Moving
        ListIterator<String> listIterator = listOfString.listIterator();
        while (listIterator.hasNext()) {
            String string = listIterator.next();
            System.out.println(string);
        }

        ListIterator<String> listIterator1 = listOfString.listIterator(listOfString.size());
        while (listIterator1.hasPrevious()) {
            String string = listIterator1.previous();
            System.out.println(string);
        }
        System.out.println("********");
        listOfString.forEach(stringElement -> System.out.println(stringElement));

        listOfString.stream().forEach(x -> System.out.println(x));


        //Collection Framework -> Java API which provides the architecture to store and manipulate the group of Objects.

        //Map -> Java API which provides the architecture to store and manipulate the group of Objects in key-value pairs.

        //Type Safe Declaration - Allow only those data elements which are declared in declaration.
        List<String> stringList = new ArrayList<String>();

        //UnType Safe Declaration - Allow each type of data elements becoz no specific type mentioned in declaration.
        List list = new ArrayList<>();


        Set<Double> doubleSet = new HashSet<Double>();
        doubleSet.add(93.5);
        doubleSet.add(84.60);
        doubleSet.add(3.14);
        doubleSet.add(521.667);
        System.out.println(doubleSet);

        Set<Integer> integerSet = new TreeSet<Integer>();
        integerSet.add(51);
        integerSet.add(28);
        integerSet.add(94);
        integerSet.add(63);
        integerSet.stream().forEach(x -> System.out.println(x));
        System.out.println("**********");
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 400);
        map.put("Python", 550);
        map.put("Spring", 600);
        map.put("C++", 250);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getValue());
        }

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key));
        }

        Collection<Integer> valueSet = map.values();
        System.out.println(valueSet);

        List<Integer> integerList = Arrays.asList(3, 5, 9, 7, 5, 8, 6, 7, 8);
        List<Integer> squareList = integerList.stream().map(x -> x * x).distinct().collect(Collectors.toList());
        System.out.println("Square List:" + squareList);

        List<Integer> numberList = Arrays.asList(15, 19, 7, 23, 9, 11, 7, 17, 5);
        IntSummaryStatistics intSummaryStatistics = numberList.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Counts in numberList:" + intSummaryStatistics.getCount());
        System.out.println("Average of numberList:" + intSummaryStatistics.getAverage());
        System.out.println("Sum of numberList:" + intSummaryStatistics.getSum());
        System.out.println("Min in numberList:" + intSummaryStatistics.getMin());

        List<String> strList = Arrays.asList("1", "2", "4", "8", "10");
        List<Integer> intList = strList.stream().map(Integer::valueOf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("String to Integer:" + intList);

        //map() is used for transformation only, but flatMap() is used for both transformation and flattening.
        List evenList = Arrays.asList(2, 4, 6, 12);
        List oddList = Arrays.asList(3, 5, 7, 11);
        List primeList = Arrays.asList(2, 3, 5, 7, 11, 17);
        List flatList = (List) Stream.of(evenList, oddList, primeList).flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println("Flattened list using Flatmap:" + flatList);


        List<String> stringList1 = Arrays.asList("Agra", "TTN", "Noida", "Developer", "Spring");
        Map<String, Integer> mapOfString = stringList1.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
        System.out.println("Map of String:" + mapOfString);

        List<String> stringList2 = Arrays.asList("Ashav", "Shubham", "Yogesh", "Arpit");
        System.out.println("String List:" + stringList2);
        List<String> unmodifiableStringList = Collections.unmodifiableList(stringList2);
        //unmodifiableStringList.add("Mohit");
        System.out.println("String List:" + unmodifiableStringList);

        //String class is final. So once it is created, Can't make any change in it.
        //A static method can access only static variables of class and invoke only static methods of the class.
        //It can invoke instance methods as well but using object only.
        String str1 = new String("test");   //String Object
        String str2 = "test";                       //String Literal

    }
}


