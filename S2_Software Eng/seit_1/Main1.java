package seit_1;
  public class Main1
 {
    public static void main(String[] args) {
     Person w1 = new Person("aaa", 1, 2, 1991,2);
     Person w2 = new Person("bbb", 3, 4, 1993,2);
     Person w3 = new Person("ccc", 5, 6, 1995,2);
     
     Person b1 = new Person("ddd", 7, 8, 1997,1);
     Person b2 = new Person("eee", 9,10, 1999,1);
     
     w1.boss = b1; b1.worker[b1.nworkers++] = w1;
     w2.boss = b1; b1.worker[b1.nworkers++] = w2;
     w3.boss = b1; b1.worker[b1.nworkers++] = w3;
//     setBoss(b1,w1);
//     setBoss(b1,w2);
//     setBoss(b1,w3);
    		 
     b1.print(System.err); 
     b2.print(System.err); 
     w1.print(System.err); 
     w2.print(System.err); 
     w3.print(System.err); 
     }
     }