package jp.co.rakus.git_sample_yahiro;

/**
 * 車を表すドメイン
 * 
 * @author akihiko.yahiro
 *
 */
public class Car {
	/**スピード*/
	private int speed;
	/**飛ぶ*/
	private int flyAway;
	/**色*/
	private String color;
	/**車のナンバー*/
	private String carNumber;
	
	/**
	 *走る 
	 */
	public void run() {
		this.speed = speed + 5;
	}
	
	/**
	 *飛ぶ 
	 */
	public void flyAway(){
		this.speed = speed + 50;
	}

	
	public int getFlyAway() {
		return flyAway;
	}

	public void setFlyAway(int flyAway) {
		this.flyAway = flyAway;
	}
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

}
