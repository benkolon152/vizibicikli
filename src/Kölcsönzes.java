public class Kölcsönzes {
    private String nev;
    private char jarmu;
    private int elvitelOra;
    private int elvitelPerc;
    private int visszahozOra;
    private int visszahozPerc;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public char getJarmu() {
        return jarmu;
    }

    public void setJarmu(char jarmu) {
        this.jarmu = jarmu;
    }

    public int getElvitelOra() {
        return elvitelOra;
    }

    public void setElvitelOra(int elvitelOra) {
        this.elvitelOra = elvitelOra;
    }

    public int getElvitelPerc() {
        return elvitelPerc;
    }

    public void setElvitelPerc(int elvitelPerc) {
        this.elvitelPerc = elvitelPerc;
    }

    public int getVisszahozOra() {
        return visszahozOra;
    }

    public void setVisszahozOra(int visszahozOra) {
        this.visszahozOra = visszahozOra;
    }

    public int getVisszahozPerc() {
        return visszahozPerc;
    }

    public void setVisszahozPerc(int visszahozPerc) {
        this.visszahozPerc = visszahozPerc;
    }

    public Kölcsönzes(){
        //TODO
    }
    public Kölcsönzes(
            String nev,
            char jarmu,
            int elvitelOra,
            int elvitelPerc,
            int visszahozOra,
            int visszahozPerc
    ){
        setNev(nev);
        setJarmu(jarmu);
        setElvitelOra(elvitelOra);
        setElvitelPerc(elvitelPerc);
        setVisszahozOra(visszahozOra);
        setVisszahozPerc(visszahozPerc);
    }
    public Kölcsönzes(String fileline){

    }

}
