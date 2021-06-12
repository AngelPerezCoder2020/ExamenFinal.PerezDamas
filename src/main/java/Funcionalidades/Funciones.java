package Funcionalidades;
import Ventanas.Forms.VentanaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Funciones {
    public static ArrayList<pizza> sucurGuate = new ArrayList<pizza>();
    public static ArrayList<pizza> sucurElpro = new ArrayList<pizza>();
    public static ArrayList<pizza> sucurJala = new ArrayList<pizza>();
    public static ArrayList<pedido> pedidos = new ArrayList<pedido>();
    
    public static void crear(pizza x,javax.swing.JTable t, javax.swing.table.DefaultTableModel m){
        if(x.getSucur().equals("GUATEMALA")){
            sucurGuate.add(x);
            mostrar(t,m,sucurGuate);
        }else{
            if(x.getSucur().equals("EL PROGRESO")){
                sucurElpro.add(x);
                mostrar(t,m,sucurElpro);
            }else{
                if(x.getSucur().equals("JALAPA")){
                    sucurJala.add(x);
                    mostrar(t,m,sucurJala);
                }
            }
        }
    }
    public static void mostrar(javax.swing.JTable t, javax.swing.table.DefaultTableModel m, ArrayList<pizza> y){
        t.setModel(m);
        String[] agg = new String[3];
        if(y.isEmpty()){
            limpiartabla(m, t);
            JOptionPane.showMessageDialog(null, "EL listado de pizzas de la Sucursal Seleccionada esta Vacía");
        }else{  
            limpiartabla(m, t);
            for(int x=0;x<y.size();x++){
                agg[0]=y.get(x).getNom();
                agg[1]=y.get(x).getDesc();
                agg[2]=y.get(x).getPre();
                m.addRow(agg);
            }
        }
    }
    public static void limpiartabla(javax.swing.table.DefaultTableModel mo, javax.swing.JTable t){
        int n = t.getRowCount();
        for(int x = n-1; x >= 0; x--){
            mo.removeRow(x);
        }
    }
    public static void mostrarpe(javax.swing.JTable t, javax.swing.table.DefaultTableModel m, ArrayList<pedido> y){
        t.setModel(m);
        limpiartabla(m,t);
        String[] agg = new String[4];
        for(int x=0;x<y.size();x++){
            agg[0]=String.valueOf(y.get(x).getNo());
            agg[1]=y.get(x).getPizza();
            agg[2]=y.get(x).getDescr();
            agg[3]=y.get(x).getSucur();
            m.addRow(agg);
        }
    }
    public static void newPedido(pedido x,javax.swing.JTable t, javax.swing.table.DefaultTableModel m){
        pedidos.add(x);
        mostrarpe(t,m,pedidos);
    }    
}