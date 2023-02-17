public abstract class xe{
    private String bsXe, mXe, nhHieu;
    public xe(){
    }
    public xe(String bsXe, String mXe, String nhHieu){
        this.bsXe = bsXe;
        this.mXe = mXe;
        this.nhHieu = nhHieu;
    }
    public String getBsXe(){
        return this.bsXe;
    }

    public void setBsXe(String bsXe){
        this.bsXe=bsXe;
    }

    public String getMXe(){
        return this.mXe;
    }
    
    public void setMXe(String mXe){
        this.mXe=mXe;
    }
    
    public String getNhHieu(){
        return this.nhHieu;
    }
    
    public void setNhHieu(String nhHieu){
        this.nhHieu=nhHieu;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bien so xe: ");
        bsXe = sc.nextLine();
        System.out.println("Nhap ma xe: ");
        mXe = sc.nextLine();
        System.out.println("Nhap nhan hieu: ");
        nhHieu = sc.nextLine();
    }

      public void xuat(){
        System.out.println("Bien so xe: " + this.bsXe);
        System.out.println("Ma xe: " + this.mXe);
        System.out.println("Nhan hieu: " + this.nhHieu);
    }

    public void abstract tinhTienQuaTram();

}

