package Funcionalidades;

public class pedido {
    
    private int no;
    private String pizza;
    private String Descr;
    private String Sucur;
    
    public pedido(int x){
        no = x;
    }
    
    public int getNo(){
        return no;
    }
    
    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getDescr() {
        return Descr;
    }

    public void setDescr(String Descr) {
        this.Descr = Descr;
    }

    public String getSucur() {
        return Sucur;
    }

    public void setSucur(String Sucur) {
        this.Sucur = Sucur;
    }
}
