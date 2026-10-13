import java.util.*;

public class lab2 {
    public static void main(String[] args) {

        //2.7.1
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList(); //a
        Set<Integer> zSet = new TreeSet(); //b
        List<Integer> xMinusY = new ArrayList();//c
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();

        Random rand = new Random();
        for (int i = 0; i <= 4; i++) {
            x.add(rand.nextInt(11));
        }

        for (int i = 0; i <= 6; i++) {
            y.add(rand.nextInt(11));
        }

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("Lista x: ");
        for(int nr: x){
            System.out.print(nr+ " ");
        }

        System.out.println("\nLista y: ");
        for(int nr: y){
            System.out.print(nr+ " ");
        }

        //a
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("\nX plus Y: ");
        for(int nr:xPlusY){
            System.out.print(nr+" ");
        }

        //b
        zSet.addAll(x);
        zSet.retainAll(y);
        if(!zSet.isEmpty()) {
            System.out.println("\nElem comune: \n" + zSet + " ");
        }
        else{
            System.out.println("Listele nu au elem comune. ");
        }

        //c
        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("Elem care exista doar in x: \n"+xMinusY+" ");

        //d
        Set<Integer>set=new TreeSet<>();
        for(Integer val:xPlusY){
            if(val<=p){
                set.add(val);
            }
        }
        xPlusYLimitedByP.addAll(set);
        System.out.println("Valorile din x si y mai mici decat "+p+": \n"+set+" ");


        //2.7.2

    }
}
