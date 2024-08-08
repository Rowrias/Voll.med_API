package med.voll.api.medico;

public record DadosListagemMedico(
		Long id,
		String nome,
		String email,
		String crm,
		Especialidade especialidade) {

	public DadosListagemMedico(Medico medico) {
		this(medico.Id(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
	}
	
}
