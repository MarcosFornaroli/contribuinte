package entities;

public class Juridica extends Pessoa {

	private Integer QtdFuncionarios;

	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnualDouble, Integer qtdFuncionarios) {
		super(nome, rendaAnualDouble);
		QtdFuncionarios = qtdFuncionarios;
	}

	public Integer getQtdFuncionarios() {
		return QtdFuncionarios;
	}

	public void setQtdFuncionarios(Integer qtdFuncionarios) {
		QtdFuncionarios = qtdFuncionarios;
	}

	@Override
	public Double taxaPaga() {
		Double taxa = 0.0;

		if (QtdFuncionarios > 10) {
			taxa = rendaAnual * 14 / 100;
		} else {
			taxa = rendaAnual * 16 / 100;
		}
		return taxa;
	}

}
