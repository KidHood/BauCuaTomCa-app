package model;

public enum BauCuaModelEnum {
	Nai(1),
	Bầu(2),
	Gà(3),
	Cá(4),
	Cua(5),
	Tôm(6);
	
	private int value;

	private BauCuaModelEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	
	
}
