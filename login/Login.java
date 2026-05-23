package login;
public class Login {
    private double salario;

    public Login(double salario) {
        this.salario = salario;
    }
    
   
    public double calculoSaludo(){
        return salario*0.04;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculoPension(){
        return salario*0.04;
    }
    
    
}
