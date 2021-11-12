package br.senai.sp.jandira.model;

import java.util.HashMap;

public enum Periodo {

	MANHA("Manh�"), TARDE("Tarde"), NOITE("Noite");

	private String description;

	private Periodo(String descri) {
		description = descri;
	}

	private static HashMap<String, Periodo> valuesEnumCol =
			new HashMap<String, Periodo>();

	// Inicializador de classe; static s� pode tratar m�todos e atributos
	// static;

	static {
		for (Periodo i : Periodo.values()) {
			valuesEnumCol.put(i.getDescricao(), i);
		}
	}

	public String getDescricao() {
		return description;
	}

	public static Periodo getValueForEnum(String value) {
		return valuesEnumCol.get(value);
	}
}
