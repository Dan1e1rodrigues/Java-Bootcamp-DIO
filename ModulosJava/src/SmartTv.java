public class SmartTv {
        //Os valores tem que ter um valor inicial, não necessariamente, mas para
        //Essa atividade SIM!!!
        boolean ligada = false;
        int canal = 194;
        int volume = 25;

        public void mudarCanal (int novoCanal){
            canal = novoCanal;
        }

        public void aumentarCanal(){
            canal ++;
        }

        public void DiminuirCanal(){
            canal --;
        }

        public void aumentarVolume(){
            //Mesma coisa seria volume + 1
            volume++;
        }

        public void DiminuirVolume(){
            //Mesma coisa seria volume - 1
            volume--;
        }

        public void ligar(){
            ligada = true;
        }

        public void desligar(){
            ligada = false;
        }
    }

