public class xebuyt extends xe{
    private int soTuyen;
    private int doDai;
    
    public xebuyt(){

    }
    
    public xebuyt(String bsXe, String mXe, String nhHieu, int soTuyen, int doDai){
        super.xe(bsXe, mXe, nhHieu);
        this.soTuyen = soTuyen;
        this.doDai = doDai;
    }

    public int getSotuyen(){
        return this.soTuyen;
    }    

    public void setSotuyen(int soTuyen){
        this.soTuyen = soTuyen;
    }

    public int getDodai(){
        return this.doDai;
    }

    public void setDodai(int doDai){
        this.doDai = doDai;
    }

    @override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tuyen: ");
        soTuyen = sc.nextLine();
        System.out.println("Nhap do dai: ");
        doDai = sc.nextLine();
    }

    @override
    public void xuat(){
        super.xuat();
        System.out.println("So tuyen: "+ this.soTuyen);
        System.out.println("Do dai: "+ this.doDai);
    }

    public int tinhTienQuaTram(){
        if(this.doDai > 20)
        return 10000;
        return 5000;
    }


}