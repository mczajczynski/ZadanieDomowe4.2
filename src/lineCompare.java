public class lineCompare {



        public line longerLine(line l1, line l2){
            int l1lenght = (int) (l1.getP2().getX()-l1.getP1().getX());
            int l2lenght = 5;

            if(l1lenght>l2lenght)
                return l1;
            else
                return l2;
        }
}
