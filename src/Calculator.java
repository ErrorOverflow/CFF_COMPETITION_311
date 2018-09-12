import java.util.Vector;

public class Calculator {
    public Vector<Integer> current_type = new Vector<>(100);

    public type_89016252 type_89016252;
    public type_89016253 type_89016253;
    public type_89016259 type_89016259;
    public type_89950166 type_89950166;
    public type_89950167 type_89950167;
    public type_89950168 type_89950168;
    public type_90063345 type_90063345;
    public type_90109916 type_90109916;
    public type_90155946 type_90155946;
    public type_99104722 type_99104722;
    public type_99999825 type_99999825;
    public type_99999826 type_99999826;
    public type_99999827 type_99999827;
    public type_99999828 type_99999828;
    public type_99999830 type_99999830;

    public void addCureentType(int i){
        if(this.current_type.contains(new Integer(i))){
            return;
        }
        this.current_type.add(new Integer(i));
    }

    public void addGenda(int type,int genda){
        switch (type){
            case 89016252:{
                this.type_89016252.addGender(genda);
                break;
            }
            case 89016253:{
                this.type_89016253.addGender(genda);
                break;
            }
            case 89016259:{
                this.type_89016259.addGender(genda);
                break;
            }
            case 89950166:{
                this.type_89950166.addGender(genda);
                break;
            }
            case 89950167:{
                this.type_89950167.addGender(genda);
                break;
            }
            case 89950168:{
                this.type_89950168.addGender(genda);
                break;
            }
            case 90063345:{
                this.type_90063345.addGender(genda);
                break;
            }
            case 90109916:{
                this.type_90109916.addGender(genda);
                break;
            }
            case 90155946:{
                this.type_90155946.addGender(genda);
                break;
            }
            case 99104722:{
                this.type_99104722.addGender(genda);
                break;
            }
            case 99999825:{
                this.type_99999825.addGender(genda);
                break;
            }
            case 99999826:{
                this.type_99999826.addGender(genda);
                break;
            }
            case 99999827:{
                this.type_99999827.addGender(genda);
                break;
            }
            case 99999828:{
                this.type_99999828.addGender(genda);
                break;
            }
            case 99999830:{
                this.type_99999830.addGender(genda);
                break;
            }
        }
    }
}
