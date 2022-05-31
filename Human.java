public class Human {
    private String Anun;
    private String Azganun;
    private int Tariq;
    private String SeR;
    private String Pashton;
    private boolean Azgutyun;
    public String getAnun() {
        return Anun;
    }public void setAnun(String anun) {
        Anun = anun;
    }public String getAzganun() {
        return Azganun;
    }public void setAzganun(String azganun) {
        Azganun = azganun;
    }public int getTariq() {
        return Tariq;
    }public void setTariq(int tariq) {
        Tariq = tariq;
    }public String getSeR() {
        return SeR;
    }public void setSeR(String seR) {
        SeR = seR;
    }public String getPashton() {
        return Pashton;
    }public void setPashton(String pashton) {
        Pashton = pashton;
    }public boolean isAzgutyun() {
        return Azgutyun;
    }public void setAzgutyun(boolean azgutyun) {
        Azgutyun = azgutyun;
    }public void printInfo() {
        System.out.println(Anun + " " + Azganun);
        System.out.println(Tariq);
        System.out.println(SeR);
        System.out.println(Pashton);
        System.out.println("hay");
        System.out.println();

    }
}
