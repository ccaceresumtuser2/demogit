public class Calculo {
    private double salario;

    public Calculo(double salario) {
        this.salario = salario;
    }
    
   
    public double calculoSaludo(){
        return salario*0.04;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        System.out.println(salario);
        this.salario = salario;
    }
    
}
