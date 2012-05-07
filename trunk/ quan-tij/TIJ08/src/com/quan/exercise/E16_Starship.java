package com.quan.exercise;

class AlertStatus {
	public String getStatus() {
		return "None";
	}
}

class RedAlertStatus extends AlertStatus {
	@Override
	public String getStatus() {
		return "Red";
	}
}

class YellowAlertStatus extends AlertStatus {
	@Override
	public String getStatus() {
		return "Yellow";
	}
}

class GreenAlertStatus extends AlertStatus {
	@Override
	public String getStatus() {
		return "Green";
	}
}

class Starship {
	private AlertStatus alertStatus = new GreenAlertStatus();

	public void setStatus(AlertStatus alertStatus) {
		this.alertStatus = alertStatus;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return alertStatus.getStatus();
	}
}

public class E16_Starship {
	public static void main(String[] args) {
		Starship eprise = new Starship();
		System.out.println(eprise);
		eprise.setStatus(new YellowAlertStatus());
		System.out.println(eprise);
		eprise.setStatus(new RedAlertStatus());
		System.out.println(eprise);
	}
}
