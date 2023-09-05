package entities;

public class PessoaJuridica extends Contribuinte {

    private Integer numFuncionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double calculaImposto() {
        if(numFuncionarios > 10){
            return getRendaAnual() * 0.14;
        } else {
            return getRendaAnual() * 0.16;
        }
    }
}
