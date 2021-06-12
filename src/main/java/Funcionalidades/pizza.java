package Funcionalidades;

public class pizza {
    private String nom;
    private String pre;
    private String desc;
    private String sucur; 
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = "Q "+pre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSucur() {
        return sucur;
    }

    public void setSucur(String sucur) {
        this.sucur = sucur;
    }
}
