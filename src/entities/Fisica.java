package entities;

public class Fisica extends Pessoa {

	private Double gastoSaude;

	public Fisica() {
		super();
	}

	public Fisica(String nome, Double rendaAnualDouble, Double gastoSaude) {
		super(nome, rendaAnualDouble);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double taxaPaga() {
		Double taxa = 0.0;
		if (rendaAnual < 20000) {
			taxa = rendaAnual * 15 / 100;
		} else {
			taxa = rendaAnual * 25 / 100;
		}

		if (gastoSaude > 0) {
			taxa -= gastoSaude * 50 / 100;
		}

		return taxa;
	}

}
