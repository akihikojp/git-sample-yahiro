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

	/**
	 *走る 
	 */
	public void run() {
		this.speed = speed + 5;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
