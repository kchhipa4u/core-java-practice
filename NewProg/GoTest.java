/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kc211701
 */


class GoTest {

    public static void main(String[] args) {
        Sente a = new Sente();
        a.go();
        Goban b = new Goban();
        b.go();
        Stone c = new Stone();
        c.go();
    }
}

class Sente implements Go {

    public void go() {

        System.out.println("go in Sente");
    }
 }

 class Goban extends Sente {
 public void go() { 
}
}


 class Stone extends Goban implements Go { }

 interface Go { public void go(); }