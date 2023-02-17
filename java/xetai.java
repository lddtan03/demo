public class xetai extends xe{
    private int trongTai;

    public xetai(){

    }

    public xetai(String bsXe, String mXe, String nhHieu, int trongTai){
        super.xe(bsXe,mXe,nhHieu);
        this.trongTai = trongTai;
    }

    public int getTrongtai(){
        return this.trongTai;
    }

    public void setTrongtai(int trongTai){
        this.trongTai = trongTai;
    }

    public int tinhTienQuaTram(){
        if(trongTai < 3)
        return 15000;
        return 30000;
    }
}