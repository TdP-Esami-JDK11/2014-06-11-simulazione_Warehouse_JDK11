package it.polito.tdp.warehouse.model;

public class WMovement implements Comparable<WMovement> {
	public enum directionEnum {
		IN, OUT
	};

	int time;
	int onjectId;
	directionEnum direction;

	/**
	 * @param time
	 * @param onjectId
	 * @param size
	 * @param direction
	 */
	public WMovement(int time, int onjectId, directionEnum direction) {
		super();
		this.time = time;
		this.onjectId = onjectId;
		this.direction = direction;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getOnjectId() {
		return onjectId;
	}

	public void setOnjectId(int onjectId) {
		this.onjectId = onjectId;
	}

	public directionEnum getDirection() {
		return direction;
	}

	public void setDirection(directionEnum direction) {
		this.direction = direction;
	}

	@Override
	public int compareTo(WMovement o) {
		return Integer.compare(this.time, o.time);
	}

	@Override
	public String toString() {
		return "WMovement [time=" + time + ", onjectId=" + onjectId
				+ ", direction=" + direction + "]";
	}
	
	
}
