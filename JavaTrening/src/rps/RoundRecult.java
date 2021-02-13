package rps;

public enum RoundRecult {
WON("Победа!"), LOST("Поражение("), DRAW("Ничья");
private String value;
	private RoundRecult (String value) {
		this.value = value; 
	}
	String getValue() { 
		return value;
	}
	
}
