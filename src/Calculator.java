import java.util.Vector;

public class Calculator {
    public Vector<Integer> current_type = new Vector<>(100);

    public TypeTag type_89016252;
    public TypeTag type_89016253;
    public TypeTag type_89016259;
    public TypeTag type_89950166;
    public TypeTag type_89950167;
    public TypeTag type_89950168;
    public TypeTag type_90063345;
    public TypeTag type_90109916;
    public TypeTag type_90155946;
    public TypeTag type_99104722;
    public TypeTag type_99999825;
    public TypeTag type_99999826;
    public TypeTag type_99999827;
    public TypeTag type_99999828;
    public TypeTag type_99999830;

    public Calculator(TypeTag[] mid){
        this.type_89016252=mid[0];
        this.type_89016253=mid[1];
        this.type_89016259=mid[2];
        this.type_89950166=mid[3];
        this.type_89950167=mid[4];
        this.type_89950168=mid[5];
        this.type_90063345=mid[6];
        this.type_90109916=mid[7];
        this.type_90155946=mid[8];
        this.type_99104722=mid[9];
        this.type_99999825=mid[10];
        this.type_99999826=mid[11];
        this.type_99999827=mid[12];
        this.type_99999828=mid[13];
        this.type_99999830=mid[14];
    }

    public void addCureentType(int i){
        if(this.current_type.contains(new Integer(i))){
            return;
        }
        this.current_type.add(new Integer(i));
    }

    public void addGenda(int type,int genda,float month_traffic){
        switch (type){
            case 89016252:{
                this.type_89016252.addGender(genda,month_traffic);
                break;
            }
            case 89016253:{
                this.type_89016253.addGender(genda,month_traffic);
                break;
            }
            case 89016259:{
                this.type_89016259.addGender(genda,month_traffic);
                break;
            }
            case 89950166:{
                this.type_89950166.addGender(genda,month_traffic);
                break;
            }
            case 89950167:{
                this.type_89950167.addGender(genda,month_traffic);
                break;
            }
            case 89950168:{
                this.type_89950168.addGender(genda,month_traffic);
                break;
            }
            case 90063345:{
                this.type_90063345.addGender(genda,month_traffic);
                break;
            }
            case 90109916:{
                this.type_90109916.addGender(genda,month_traffic);
                break;
            }
            case 90155946:{
                this.type_90155946.addGender(genda,month_traffic);
                break;
            }
            case 99104722:{
                this.type_99104722.addGender(genda,month_traffic);
                break;
            }
            case 99999825:{
                this.type_99999825.addGender(genda,month_traffic);
                break;
            }
            case 99999826:{
                this.type_99999826.addGender(genda,month_traffic);
                break;
            }
            case 99999827:{
                this.type_99999827.addGender(genda,month_traffic);
                break;
            }
            case 99999828:{
                this.type_99999828.addGender(genda,month_traffic);
                break;
            }
            case 99999830:{
                this.type_99999830.addGender(genda,month_traffic);
                break;
            }
        }
    }
}
