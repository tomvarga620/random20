import java.util.*;

public class Main {
    public static void main(String[] args) {

/*
        Random rand = new Random();
        Integer num[] = new Integer[20];
        for(int i= 0;i<num.length;i++){
            //num[i] = rand.nextInt(20)+1;
            num[i] = ((int) (Math.random() * (20 - 1) + 1));
            System.out.println(num[i]);

        }

        List<Integer> rslt = Arrays.asList(num);

        Collections.shuffle(rslt);

        System.out.println(rslt);

        int count=0;

        Random rand = new Random();

        HashSet hs = new HashSet();

        for(int i=0;i<20;i++){
            double num = Math.random();
            hs.add(num);
        }

        Iterator it=hs.iterator();

        while(it.hasNext()){

            count++;
            System.out.println(it.next());
        }

        System.out.println("Count= "+count);
    */

        Random r = new Random();
        Set<Integer> setList = new HashSet<>();
        for(int i = 0; i < 20; i++) {
            while (true) {
                int num = r.nextInt(20) + 1;
                if (setList.contains(num) == false) {
                    setList.add(num);
                    System.out.println(num);
                    break;
                }
            }
        }
    }
}
